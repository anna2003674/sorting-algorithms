package org.example.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{67, 45, 880, 24342, 543};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) { // Внешний цикл отвечает за количество проходов
            boolean swapped = false; // Флаг для отслеживания, был ли произведен обмен
            for (int j = 0; j < arrays.length - 1 - i; j++) { // Внутренний цикл отвечает за сравнение соседних элементов (с каждым проходом уменьшаем длину области для сравнения, исключая уже отсортированные элементы в конце массива)
                if (arrays[j] > arrays[j + 1]) { // Сравниваем текущий элемент с следующим ()
                    int temp = arrays[j]; // Меняем местами, если текущий больше следующего
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    swapped = true; // Обмен произошел
                }
            }
            if (!swapped) { // Если обменов не было, массив отсортирован, можно завершить
                break;
            }
        }
    }
}
