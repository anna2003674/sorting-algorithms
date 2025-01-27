package org.example.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 9, 45, 878, 334, 77, 1, -100, -4534, 45645};
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void mergeSort(int[] array) {
        int n = array.length;
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSort(l);
        mergeSort(r);
        merge(array, l, r);
    }

    private static void merge(int[] array, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                array[idx] = l[i];
                i++;
                idx++;
            } else {
                array[idx] = r[j];
                j++;
                idx++;

            }
        }
        for (int ll = i; ll < left; ll++) {
            array[idx++] = l[ll];
        }
        for (int rr = j; rr < right; rr++) {
            array[idx++] = r[rr];
        }
    }
}
