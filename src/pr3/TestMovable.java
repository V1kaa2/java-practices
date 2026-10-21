package pr3;

public class TestMovable {
    public static void main(String[] args) {
        // Тестируем точку
        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println("Начальная точка: " + point);
        point.moveRight();
        point.moveDown();
        System.out.println("После движения: " + point);

        System.out.println("-------------------");

        // Тестируем круг
        MovableCircle circle = new MovableCircle(10, 10, 2, 2, 5);
        System.out.println("Начальный круг: " + circle);
        circle.moveLeft();
        circle.moveUp();
        System.out.println("После движения: " + circle);
    }
}