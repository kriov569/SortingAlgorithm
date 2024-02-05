package org.example;

import java.util.Arrays;
import static org.example.SelectSort.selectSortAscending;
import static org.example.BubbleSort.bubbleSort;
public class Main {
    public static void main(String[] args) {
        int arraySize = 10;
        int[] array = new int[arraySize];
        long startTime;
        Arrays.sort(array);
        long endTime;

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        bubbleSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Bubble sort time= " + (endTime - startTime));

        generate(array, arraySize);
        startTime = System.currentTimeMillis();
        selectSortAscending(array);
        endTime = System.currentTimeMillis();
        System.out.println("Select sort time= " + (endTime - startTime));
    }
    public static void generate(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            array[i] = new java.util.Random().nextInt(100000) + 100000;
        }
    }
}