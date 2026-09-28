package listDemo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        // 1. Array：長度固定
        int[] numbers = {30, 10, 20};

        // Arrays：提供操作 array 的工具方法
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // [10, 20, 30]


        // 2. List 是介面；ArrayList 是它的一種實作
        List<String> names = new ArrayList<>();

        names.add("Bob");
        names.add("Alice");
        names.remove("Bob");

        System.out.println(names.get(0)); // Alice
        System.out.println(names.size()); // 1


        // 3. Comparable：定義 Student 的預設排序
        List<Student> students = new ArrayList<>();

        students.add(new Student("Bob", 85));
        students.add(new Student("Alice", 90));
        students.add(new Student("Charlie", 70));

        Collections.sort(students);
        System.out.println(students); // 按分數由低到高


        // 4. Comparator：另外指定排序規則
        Comparator<Student> byName =
                Comparator.comparing(Student::getName);

        students.sort(byName);
        System.out.println(students); // 按名字排序


        // 5. 自訂泛型 collection ADT
        Bag<String> words = new SimpleBag<>();
        words.add("Java");
        words.add("Java"); // Bag 允許重複
        words.add("Hello");

        System.out.println(words.size());           // 3
        System.out.println(words.contains("Java")); // true

        words.remove("Java"); // 只移除一個
        System.out.println(words.size()); // 2

        // 相同實作也能儲存其他型別
        Bag<Integer> scores = new SimpleBag<>();
        scores.add(90);
        scores.add(80);

        System.out.println(scores.size()); // 2
    }


    static class Student implements Comparable<Student> {
        private final String name;
        private final int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        // 預設排序：按分數由低到高
        @Override
        public int compareTo(Student other) {
            // return Integer.compare(this.score, other.score);
            if (this.score > other.score) return 1;
            if (this.score < other.score) return -1;
            return 0;
        }

        @Override
        public String toString() {
            return name + ": " + score;
        }
    }


    // ADT 的介面：定義能做甚麼
    // Bag 允許重複元素，不保證順序
    interface Bag<T> {
        void add(T item);

        // 移除一個相等的元素；成功則回傳 true
        boolean remove(T item);

        boolean contains(T item);

        int size();

        boolean isEmpty();
    }


    // ADT 的實作：決定如何儲存資料
    static class SimpleBag<T> implements Bag<T> {
        private final List<T> items = new ArrayList<>();

        @Override
        public void add(T item) {
            items.add(item);
        }

        @Override
        public boolean remove(T item) {
            return items.remove(item);
        }

        @Override
        public boolean contains(T item) {
            return items.contains(item);
        }

        @Override
        public int size() {
            return items.size();
        }

        @Override
        public boolean isEmpty() {
            return items.isEmpty();
        }
    }
}