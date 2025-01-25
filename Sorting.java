/**
 *  @assignment THE FINAL PROJECT
 *
 *  @author      STUDENT'S NAME: MOHMMED R H HIREZ
 *               STUDENT'S NO:   1 2022 0519
 *
 *  @instructor  Dr. Eyad El-Masri
 *
 *  @course      BSAI2121 Data Structures and Algorithm Analysis - Lab
 *
 *  @date        25 Jan 2025
 */

 import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] array = {5, 3, 8, 4, 2};

        bubbleSort(array);
        System.out.println("Bubble Sort: " + Arrays.toString(array));

        int[] array2 = {5, 3, 8, 4, 2};
        insertionSort(array2);
        System.out.println("Insertion Sort: " + Arrays.toString(array2));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}
