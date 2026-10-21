package pr4;

public class Monitor {
    private String model;
    private double diagonal; // в дюймах

    public Monitor(String model, double diagonal) {
        this.model = model;
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return model + " (" + diagonal + " дюймов)";
    }
}