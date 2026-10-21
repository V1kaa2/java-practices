package pr4;

public class Computer {
    // Используем перечисление для марок компьютеров
    public enum Brand {
        APPLE, ASUS, LENOVO, HP
    }

    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    // Конструктор
    public Computer(Brand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Компьютер [" + brand + "]\n" +
                "  Процессор: " + processor + "\n" +
                "  Память: " + memory + "\n" +
                "  Монитор: " + monitor;
    }
}