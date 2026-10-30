package pr1;
public class Task3 {
    public static void main(String[] args) {
        // Инициализация массива
        int[] numbers = {5, 12, 8, 23, 4, 16, 7};

        int sum = 0;
        // Цикл for для подсчета суммы
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Среднее арифметическое
        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}