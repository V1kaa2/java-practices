package pr4.Atelier2;

public class TestAtelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "Белый"),
                new Pants(Size.L, 3000, "Черный"),
                new Skirt(Size.S, 2500, "Красный"),
                new Tie(Size.XS, 800, "Синий")
        };

        Atelier.dressMan(clothes);
        System.out.println();
        Atelier.dressWomen(clothes);
    }
}