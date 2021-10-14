package ru.geekbrains.jca.homework3;

public class GenerateArray {
    public static int[] generateOneArray (int s) {
        int[] oneArray = new int[s-1];
        int x = (int)(Math.random()*(((s-2)-1)+1))+1;
        System.out.println("Missing number for chek: " + (x + 1));
        if (x == s) {
            for (int i = 0; i < s-1; i++) {
                oneArray[i] = 1 + i;
            }
        } else {
            for (int i = 0; i < s; i++) {
                if (i < x) {
                    oneArray[i] = 1 + i;
                } else if (i == x) {
                    continue;
                } else if (i > x) {
                    oneArray[i-1] = 1 + i;
                }

            }

        }
        return oneArray;

    }
}
