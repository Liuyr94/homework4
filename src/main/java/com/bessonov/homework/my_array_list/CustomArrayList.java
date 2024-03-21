package com.bessonov.homework.my_array_list;

public class CustomArrayList<T> {
    private Object[] elements;
    private int size;
    private int capacity;

    // Конструктор инициализирует массив и устанавливает начальный размер
    public CustomArrayList() {
        elements = new Object[10];
        size = 0;
    }

    // Метод для обеспечения достаточной емкости массива
    private void ensureCapacity() {
        if (size == elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    // Метод добавления элемента в начало массива
    public void add(T element) {
        if (size < elements.length) {
            for (int i = size - 1; i >= 0; i--) {
                elements[i + 1] = elements[i];
            }
            elements[0] = element;
            size++;
        } else {
            ensureCapacity();
        }
    }

    // Метод добавления массива элементов в список
    public void addAll(T[] array) {
        for (int i = 0; i < array.length; i++) {
            add(array[i]);
        }
    }

    // Метод добавления элемента по указанному индексу
    public void addAtIndex(int index, T element) {
        if (index >= 0 && index <= size) {
            if (size < elements.length) {
                for (int i = size - 1; i >= index; i--) {
                    elements[i + 1] = elements[i];
                }
                elements[index] = element;
                size++;
            } else {
                ensureCapacity();
            }
        } else {
            System.out.println("Некорректный индекс");
        }
    }

    // Метод удаления элемента по индексу
    public void removeAtIndex(int index) {
        if (size == 0) {
            System.out.println("Массив пуст");
        } else if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        } else {
            System.out.println("Некорректный индекс");
        }
    }

    // Метод очистки массива
    public void clear() {
        size = 0; // Обнуление размера массива
    }

    // Переопределение метода toString для вывода элементов массива в виде строки
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}