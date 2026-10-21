package pr4.Season1;

import java.util.Scanner;

public class TestSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Спрашиваем у пользователя время года
        System.out.println("Доступные времена года: WINTER, SPRING, SUMMER, AUTUMN");
        System.out.print("Введите ваше любимое время года (с большой буквы, на англ.): ");

        String input = scanner.nextLine().toUpperCase(); // переводим в верхний регистр на случай, если введут строчными

        // 2. Преобразуем строку в наше перечисление (Enum)
        // Для этого используем метод valueOf, который встроен в каждый Enum
        Season myFavorite;
        try {
            myFavorite = Season.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Вы ввели неверное название времени года!");
            return; // завершаем программу
        }

        // 3. Выводим информацию (как и раньше)
        System.out.println("\nМое любимое время года: " + myFavorite);
        System.out.println("Температура: " + myFavorite.getAverageTemp());
        System.out.println("Описание: " + myFavorite.getDescription());

        System.out.println("\n--- Проверка через switch ---");
        printSeasonMessage(myFavorite);

        System.out.println("\n--- Все времена года ---");
        for (Season season : Season.values()) {
            System.out.println(season + ": " + season.getAverageTemp() + "°C, " + season.getDescription());
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case SUMMER: System.out.println("Я люблю лето"); break;
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }
}