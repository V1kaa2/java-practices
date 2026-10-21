package pr4;

import java.util.Scanner;

public class TestStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        User currentUser = null;

        System.out.println("Добро пожаловать в Интернет-магазин!");

        // 1. Аутентификация
        while (currentUser == null) {
            System.out.print("Введите логин (admin): ");
            String login = scanner.nextLine();
            System.out.print("Введите пароль (123): ");
            String password = scanner.nextLine();

            currentUser = store.login(login, password);
            if (currentUser == null) {
                System.out.println("Неверный логин или пароль. Попробуйте снова.\n");
            }
        }
        System.out.println("Успешный вход! Здравствуйте, " + currentUser.getLogin() + "!\n");

        // Основной цикл программы
        boolean running = true;
        while (running) {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Просмотр каталогов (Электроника, Одежда, Книги)");
            System.out.println("2. Выбрать товар в корзину");
            System.out.println("3. Посмотреть корзину и купить");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    for (Category c : Category.values()) {
                        store.showProductsByCategory(c);
                    }
                    break;
                case 2:
                    System.out.println("Введите название товара (как в каталоге):");
                    String productName = scanner.nextLine();
                    // Упрощенный поиск товара по имени
                    if (productName.equalsIgnoreCase("Смартфон")) currentUser.addToCart(new Product("Смартфон", 25000, Category.ELECTRONICS));
                    else if (productName.equalsIgnoreCase("Ноутбук")) currentUser.addToCart(new Product("Ноутбук", 60000, Category.ELECTRONICS));
                    else if (productName.equalsIgnoreCase("Футболка")) currentUser.addToCart(new Product("Футболка", 1500, Category.CLOTHING));
                    else if (productName.equalsIgnoreCase("Джинсы")) currentUser.addToCart(new Product("Джинсы", 4000, Category.CLOTHING));
                    else if (productName.equalsIgnoreCase("Книга 'Java'")) currentUser.addToCart(new Product("Книга 'Java'", 2000, Category.BOOKS));
                    else System.out.println("Товар не найден!");

                    System.out.println("Товар добавлен в корзину!");
                    break;
                case 3:
                    if (currentUser.getCart().isEmpty()) {
                        System.out.println("Ваша корзина пуста.");
                    } else {
                        System.out.println("--- Ваша корзина ---");
                        for (Product p : currentUser.getCart()) {
                            System.out.println(p);
                        }
                        System.out.println("Итого к оплате: " + currentUser.getCartTotal() + " руб.");
                        System.out.println("Покупка совершена! Спасибо за заказ.");
                        currentUser.getCart().clear(); // Очищаем корзину
                    }
                    break;
                case 0:
                    running = false;
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный ввод.");
            }
        }
    }
}