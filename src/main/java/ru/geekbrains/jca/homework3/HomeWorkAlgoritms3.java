package ru.geekbrains.jca.homework3;

import java.util.Arrays;

public class HomeWorkAlgoritms3 {
    public static void main(String[] args) {
        // Задание 1
        int[] arr = GenerateArray.generateOneArray(16);
        System.out.println(Arrays.toString(arr));
        System.out.println("Missing number: " + SearchElementArray.searchMissingElement(arr, 5));

        // Задание 2
        testDeque();

    }

    private static void testDeque() {
        Deque<Integer> deque = new DequeImpl<>(5);
//        Queue<Integer> queue = new PriorityQueueImpl<>(5);



        System.out.println("add element: " + deque.insertRight(12));

        System.out.println("add element: " + deque.insertRight(20));
        System.out.println("add element: " + deque.insertLeft(34)); // Не могу понять почему при вставке слева удаляется последний вставленный элемент вставки справа.
        System.out.println("add element: " + deque.insertRight(16));
        System.out.println("add element: " + deque.insertRight(15));



        deque.display();
//        System.out.println("remove: " + deque.removeRight());
        deque.display();
    }



}
