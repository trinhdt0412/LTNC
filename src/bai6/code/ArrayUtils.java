package bai6.code;

public class ArrayUtils {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Cú pháp <T extends Comparable<T>> nghĩa là
    // kiểu T bắt buộc phải có khả năng so sánh (implements Comparable).
    public static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    swap(array, j, j+1);
                }
            }
        }
    }
}
