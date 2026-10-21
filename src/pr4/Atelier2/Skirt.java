package pr4.Atelier2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская юбка: размер " + size + " (" + size.getEuroSize() + "), цвет " + color + ", цена " + price);
    }
}