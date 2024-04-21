package src.labs.lab04;

public class Main2 {


    public static void main(String[] args) {
        // Часть 2, задание 1
        int[] array = {5, 8, 12, 15, 20, 25};
        checkIfSorted(array);

        // Без булевой переменной
        int[] array1 = {5, 8, 12, 15, 20, 25};
        checkIfSortedNoBoolean(array1);
    }

    public static void checkIfSorted(int[] array) {
        boolean isSorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void checkIfSortedNoBoolean(int[] array) {
        boolean sorted = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }
}
