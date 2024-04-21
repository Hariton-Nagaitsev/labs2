package src.labs.lab04;

import java.util.Arrays;

public class Main4 {
    //Часть 2, задание 3
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};

        System.out.println("Array 1: " + Arrays.toString(array));
        swapFirstAndLast(array);
        System.out.println("Array 2: " + Arrays.toString(array));
    }

    public static void swapFirstAndLast(int[] arr) {
        if (arr.length >= 2) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }
    }
}
