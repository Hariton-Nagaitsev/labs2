package src.labs.lab04;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уникальное число: ");
        int uniqueNumber = scanner.nextInt();

        int index = findIndex(array, uniqueNumber);
        if (index != -1) {
            System.out.println("Уникальное число " + uniqueNumber + " найдено на позиции " + index);
        } else {
            System.out.println("Уникальное число " + uniqueNumber + " не найдено в массиве");
        }
    }

    public static int findIndex(int[] array, int uniqueNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == uniqueNumber) {
                return i;
            }
        }
        return -1;
    }

}
