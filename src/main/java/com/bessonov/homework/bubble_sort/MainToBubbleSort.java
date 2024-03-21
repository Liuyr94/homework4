package com.bessonov.homework.bubble_sort;

import java.util.Arrays;
import java.util.Random;

public class MainToBubbleSort {
    public static void main(String[] args) {
        int[] array = new int[1000];
        fillRandomArray(array);
        System.out.println("Наш не отсортированный массив: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("После сортировки: " + Arrays.toString(array));
    }

    public static int[] fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 2000);
        }
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }
        return array;
    }
}
