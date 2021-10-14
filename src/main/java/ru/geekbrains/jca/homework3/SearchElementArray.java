package ru.geekbrains.jca.homework3;

public class SearchElementArray {
    public static int searchMissingElement (int[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;
        int base;



        while (end >= start) {
            base = (start + end) / 2;
            if (arr[base + 1] - arr[base] == 2) {
                return base + 2;
            } else if(arr[base] == base + 1) {
                start = base +1;
            } else {
                end = base - 1;
            }
        }

        return -1;
    }
}
