package pr4;

public class Memory {
    private int size; // в ГБ
    private String type; // DDR4, DDR5 и т.д.

    public Memory(int size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return size + " ГБ " + type;
    }
}