package bai7.code;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        int sizeInput = 4;
        String studentInput = "S01 A 7.5\nS02 B 4.5\nS03 C 8.0\nS04 D 5.0";
        Scanner sc = new Scanner(studentInput);

        for (int i = 0; i < sizeInput; i++) {
            students.add(new Student(sc.next(), sc.next(), sc.nextDouble()));
        }

        System.out.println("=== Original Data ===");
        for (Student s : students) {
            System.out.println(s); // Tự động gọi hàm toString() bên class Student
        }
        System.out.println();

        // 1. FILTER
        students.removeIf(student -> student.getGpa() < 5.0);

        System.out.println("=== After removing GPA < 5.0: ===");
        for (Student s : students) {
            System.out.println(s); // Tự động gọi hàm toString() bên class Student
        }
        System.out.println();

        // 2.1. SORT
        students.sort((s1,s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("=== After sorting by name (A-Z): ===");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        // 2.2. REVERSED SORT
        students.sort((s1,s2) -> s2.getName().compareTo(s1.getName()));

        System.out.println("=== After sorting by name (Z-A): ===");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        // 3. CUSTOM FUNCTIONAL INTERFACE
        Operation<Double> add = (a, b) -> a + b;
        Operation<Double> sub = (a, b) -> a - b;
        Operation<Double> multiply = (a, b) -> a*b;
        Operation<Double> divide = (a, b) -> a/b;

        Double a = 7.0;
        Double b = 2.0;

        Double addResult = add.execute(a, b);
        Double subResult = sub.execute(a, b);
        Double multiplyResult = multiply.execute(a, b);
        Double divideResult = divide.execute(a, b);

        System.out.println("=== Execute result: ===");
        System.out.println("a = " + a + "; b = " + b);
        System.out.println("a + b = " + addResult);
        System.out.println("a - b = " + subResult);
        System.out.println("a * b = " + multiplyResult);
        System.out.println("a / b = " + divideResult);

        sc.close();
    }
}
