package pr4;

public class Processor {
    private String model;
    private int cores;
    private double frequency; // в ГГц

    public Processor(String model, int cores, double frequency) {
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return model + " (" + cores + " ядер, " + frequency + " ГГц)";
    }
}