package pr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Сумма через while
        int sumWhile = 0;
        int i = 0;
        while (i < size) {
            sumWhile += arr[i];
            i++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        // Сумма через do while
        int sumDoWhile = 0;
        int j = 0;
        do {
            sumDoWhile += arr[j];
            j++;
        } while (j < size);
        System.out.println("Сумма (do while): " + sumDoWhile);

        // Поиск max и min
        int max = arr[0];
        int min = arr[0];
        for (int k = 1; k < size; k++) {
            if (arr[k] > max) max = arr[k];
            if (arr[k] < min) min = arr[k];
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }
}