package com.bessonov.homework.binary_search;

import java.util.Random;

public class MainToBinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        fillArray(array);
        Random random = new Random();
        int randomInt = random.nextInt(1_000_000, 2_000_000);
        System.out.println("Случайное число: " + randomInt + ".");
        binarySearch(array, randomInt);
    }

    public static void binarySearch(int[] array, int targetNumber) {
        if (array[array.length - 1] < targetNumber || array[0] > targetNumber) {
            System.out.println("В данном массиве нет заданного элемента");
            return;
        }
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int attemptsCount = 0;
        while (true) {
            attemptsCount++;
            int center = (firstIndex + lastIndex) / 2;
            if (array[center] == targetNumber) {
                System.out.println("Элемент который мы искали найден: " + array[center] +
                        ".\nОн находиться под индексом: " + center + ".\nМы нашли данное" +
                        " " +
                        "число с " + attemptsCount + " попытки.");
                return;
            } else if (array[center] > targetNumber) {
                lastIndex = center - 1;
            } else {
                firstIndex = center + 1;
            }
        }
    }

    public static int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + array.length;
        }
        return array;
    }


}
