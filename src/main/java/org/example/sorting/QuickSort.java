package org.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 4, 78, 90, 344, 44, 346, 898, 4475};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if (array.length == 0 || leftIndex >= rightIndex) {
            return;
        }
        int pivot = array[(leftIndex + rightIndex) / 2];
        int leftMarkerIndex = leftIndex;
        int rightMarkerIndex = rightIndex;
        while (leftMarkerIndex <= rightMarkerIndex) {
            while (array[leftMarkerIndex] < pivot) {
                leftMarkerIndex++;
            }
            while (array[rightMarkerIndex] > pivot) {
                rightMarkerIndex--;
            }
            if (leftMarkerIndex <= rightMarkerIndex) {
                int swap = array[leftMarkerIndex];
                array[leftMarkerIndex] = array[rightMarkerIndex];
                array[rightMarkerIndex] = swap;
                leftMarkerIndex++;
                rightMarkerIndex--;
            }
        }
        if (leftIndex < rightMarkerIndex) {
            quickSort(array, leftIndex, rightMarkerIndex);
        }
        if (rightIndex > leftMarkerIndex) {
            quickSort(array, leftMarkerIndex, rightIndex);
        }
    }
}
