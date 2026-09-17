package javaBasic;

public class JavaBasic {

    public static void main(String[] args) {
        System.out.println("Hello World");

        // 1 TB -> 1024GB -> 1024MB -> 1024KB -> 1024 Bytes -> 8 bits

        // Primitive Types (Value Types)
        int a = 65; // 4 bytes, 32 bits, 2^32 -> 21億4700萬..
        float f = 1;
        double d = 3.14159;
        long l = 100000;    // 8 bytes
        boolean b = true;
        char c = 'A'; // 65
        short s = 259;  // 2 bytes, 16 bits


        int z = s;
        // 259 -> 256 + 2 + 1
        // s -> 0000 0001 0000 0011
        // z -> 0000 0000 0000 0000 0000 0001 0000 0011

        byte b1 = (byte) s;
        // s  -> 0000 0001 0000 0011
        // b1 -> 0000 0011 -> 3

        System.out.println(s);
        System.out.println(z);
        System.out.println(b1);


        // Reference Type (Object Type)
        String s1 = new String("CSC207");
        String s2 = new String("CSC207");

        String s3 = "CSC207"; // String-literal (short-cut to create a string)
        // Immutable
        String s4 = "CSC207"; // java will first check String-Pool, if this string exist or not
        // if not, create new string


        // same object? same memory address?
        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false
        System.out.println(s3 == s4); // true

        // Same content?
        System.out.println(s1.equals(s2)); // true

        // Integer int1 = new Integer(5);
        Integer i = 5;   // auto-boxing
        int j = i;       // auto-unboxing

    }
}
