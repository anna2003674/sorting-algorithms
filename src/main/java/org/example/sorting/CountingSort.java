package org.example.sorting;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arrays = new int[]{4, 2, 2, 8, 3, 3, 1};
        int[] sortingArray = countingSort(arrays);
        System.out.println(Arrays.toString(sortingArray));
    }

    private static int[] countingSort(int[] arrays) {
        if (arrays == null || arrays.length == 0) {
            return new int[0];
        }

        int minElement = arrays[0];
        int maxElement = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < minElement) {
                minElement = arrays[i];
            }
            if (arrays[i] > maxElement) {
                maxElement = arrays[i];
            }
        }

        int[] count = new int[maxElement - minElement + 1];

        for (int i = 0; i < arrays.length; i++) {
            count[arrays[i] - minElement]++;
        }

        int[] sortingArray = new int[arrays.length];
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sortingArray[index++] = i + minElement;
                count[i]--;
            }
        }
        return sortingArray;
    }
}
