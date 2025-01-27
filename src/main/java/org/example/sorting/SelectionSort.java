package org.example.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {54, 987, 25345, 8787, 232, 6, 25, 8, 99};
        selectionSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        for (int step = 0; step < array.length - 1; step++) {
            int index = min(array, step);
            swap(array, step, index);
        }
    }

    private static int min(int[] array, int start) {
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
