package src.labs.lab04;

public class Main2 {


    public static void main(String[] args) {
        //Часть 2, задание 1
        int[] array = {5, 8, 12, 15, 20, 25};

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
        // Без булевой переменной

        int[] array1 = {5, 8, 12, 15, 20, 25};

        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                System.out.println("Please, try again");
                break;
            } else {
                System.out.println("OK");
                break;
            }
        }
    }
}
