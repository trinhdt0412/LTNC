package bai6.code;

public class Main {
    public static void main(String[] args) {
        Integer[] intList = {5, 1, 3, 2};
        ArrayUtils.sort(intList);
        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i]);
            if (i < intList.length -1) {
                System.out.print(" ");
            }
        }

        System.out.println("");

        String[] stringList = {"Java", "C++", "Python"};
        ArrayUtils.sort(stringList);
        for (int i = 0; i < stringList.length; i ++) {
            System.out.print(stringList[i]);
            if (i < stringList.length - 1 ) {
                System.out.print(" ");
            }
        }

        System.out.println("");

        Student[] students = {
                new Student("thuy", 9.6),
                new Student("trinh", 9.3),
                new Student("duong", 10)};
        ArrayUtils.sort(students);
        for (int i = 0; i < students.length; i ++) {
            System.out.print(students[i]);
            if (i < students.length - 1 ) {
                System.out.print(" ");
            }
        }
    }
}
