package pr4;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private List<Product> cart; // Корзина

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new ArrayList<>();
    }

    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public List<Product> getCart() { return cart; }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public double getCartTotal() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }
}