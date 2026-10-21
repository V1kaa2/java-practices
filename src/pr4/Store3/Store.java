package pr4;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> allProducts;
    private List<User> users;

    public Store() {
        allProducts = new ArrayList<>();
        users = new ArrayList<>();

        // Добавляем тестовых пользователей (логин: admin, пароль: 123)
        users.add(new User("admin", "123"));
        users.add(new User("user", "qwerty"));

        // Добавляем товары в каталог
        allProducts.add(new Product("Смартфон", 25000, Category.ELECTRONICS));
        allProducts.add(new Product("Ноутбук", 60000, Category.ELECTRONICS));
        allProducts.add(new Product("Футболка", 1500, Category.CLOTHING));
        allProducts.add(new Product("Джинсы", 4000, Category.CLOTHING));
        allProducts.add(new Product("Книга 'Java'", 2000, Category.BOOKS));
    }

    // Метод аутентификации
    public User login(String login, String password) {
        for (User u : users) {
            if (u.getLogin().equals(login) && u.getPassword().equals(password)) {
                return u; // Успешный вход
            }
        }
        return null; // Ошибка входа
    }

    // Просмотр списка товаров по категории
    public void showProductsByCategory(Category category) {
        System.out.println("--- Каталог: " + category.getTitle() + " ---");
        for (Product p : allProducts) {
            if (p.getCategory() == category) {
                System.out.println(p);
            }
        }
    }
}