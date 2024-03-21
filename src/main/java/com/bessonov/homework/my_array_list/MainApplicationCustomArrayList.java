package com.bessonov.homework.my_array_list;

public class MainApplicationCustomArrayList {
    public static void main(String[] args) {
        CustomArrayList<String> customList = new CustomArrayList<>();
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.add("A");
        customList.addAll(new String[]{ "B", "C", "D" });
        System.out.println(customList);
        customList.addAtIndex(2, "E");
        System.out.println(customList);
        customList.removeAtIndex(1);
        System.out.println(customList);
        customList.clear();
        System.out.println(customList);
    }
}
