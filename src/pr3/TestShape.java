package pr3;

public class TestShape {
    public static void main(String[] args) {
        // Восходящее преобразование (Upcast)
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Площадь: " + s1.getArea());
        System.out.println("Периметр: " + s1.getPerimeter());

        Shape s2 = new Rectangle(2.0, 4.0, "BLUE", true);
        System.out.println(s2);
        System.out.println("Площадь: " + s2.getArea());

        Shape s3 = new Square(6.6);
        System.out.println(s3);
        System.out.println("Площадь: " + s3.getArea());
    }
}