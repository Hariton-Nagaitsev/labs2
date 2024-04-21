package src.labs.lab04;
import java.util.Scanner;
import java.util.Arrays;

public class Main3 {

    //Часть 2, задание 2
    public static int[] getArrayFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        System.out.println("Numbers of array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("Result: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = getArrayFromUser();
        printArray(array);
    }
}
