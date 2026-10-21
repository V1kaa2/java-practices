package pr4;

public class TestComputer {
    public static void main(String[] args) {
        // Создаем комплектующие
        Processor cpu = new Processor("Intel Core i7", 8, 3.4);
        Memory ram = new Memory(16, "DDR4");
        Monitor screen = new Monitor("Dell UltraSharp", 27.0);

        // Собираем компьютер
        Computer myPC = new Computer(Computer.Brand.ASUS, cpu, ram, screen);

        // Выводим информацию
        System.out.println(myPC);
    }
}