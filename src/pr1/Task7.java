package pr1;

public class Task7 {
    public static void main(String[] args) {
        int number = 5; // число, для которого считаем факториал
        long result = calculateFactorial(number);
        System.out.println("Факториал " + number + " = " + result);
    }

    // Метод для вычисления факториала
    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}