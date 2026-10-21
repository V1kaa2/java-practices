package pr4.Atelier2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: размер " + size + " (" + size.getEuroSize() + "), цвет " + color + ", цена " + price);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: размер " + size + " (" + size.getEuroSize() + "), цвет " + color + ", цена " + price);
    }
}