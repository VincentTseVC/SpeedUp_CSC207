package switchCaseDemo;

public class switchCaseDemo {


    // 格里高利曆：能被 4 整除且（不能被 100 整除或能被 400 整除）
    static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }

    // 回傳某年某月的天數（1~12）
    static int daysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("month must be 1..12");
        }

        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                boolean leapYear = isLeapYear(year);
                yield leapYear ? 29 : 28;       // If statement inside a switch case.
            }
            default -> 31;
        };
    }



    public static void main(String[] args) {

        // Regular if ... else if ... else ...
        int score = 83;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);

        ///////////////////////////////////////////

        // Single ONE LINE if
        String x = (2 > 1) ? "Hello" : "Bye";

        // Python:
        //     x = "Hello" if 2 > 1 else "Bye"

        System.out.println(x);

        ///////////////////////////////////////////

        grade = 'A';
        String msg;

        switch (grade) {
            case 'A':
            case 'B':                 // 注意：沒有 break 會「落入」下一個 case
                msg = "Great!";
                break;
            case 'C':
                msg = "OK.";
                break;
            case 'D':
            case 'F':
                msg = "Needs improvement.";
                break;
            default:
                msg = "Unknown grade.";
        }

        System.out.println(msg);

        ///////////////////////////////////////////

        // 新版 switch expression [Enhanced version] (Java 14+)
        msg = switch (grade) {
            case 'A', 'B' -> "Great!";
            case 'C' -> "OK.";
            case 'D', 'F' -> "Needs improvement.";
            default -> "Unknown grade.";
        };

        System.out.println(msg);

        // Example 2
        String role = "admin";
        int level = switch (role) {
            case "guest" -> 0;
            case "user"  -> 1;
            case "admin", "owner" -> 2;
            default -> throw new IllegalArgumentException("Unknown role: " + role);
        };

        System.out.println("Level = " + level);

        ///////////////////////////////////////////

        System.out.println(daysInMonth(2024, 2)); // 29（閏年）
        System.out.println(daysInMonth(2100, 2)); // 28（世紀年但非 400 倍數，不是閏年）
        System.out.println(daysInMonth(2000, 2)); // 29（400 倍數，閏年）

    }
}
