package pr4.Atelier2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: размер " + size + " (" + size.getEuroSize() + "), цвет " + color + ", цена " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: размер " + size + " (" + size.getEuroSize() + "), цвет " + color + ", цена " + price);
    }
}