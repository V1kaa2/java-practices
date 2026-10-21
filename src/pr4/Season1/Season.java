package pr4.Season1;

public enum Season {
    WINTER(-10.0) {
        @Override
        public String getDescription() { return "Холодное время года"; }
    },
    SPRING(10.0) {
        @Override
        public String getDescription() { return "Холодное время года"; }
    },
    SUMMER(25.0) {
        @Override
        public String getDescription() { return "Теплое время года"; }
    },
    AUTUMN(5.0) {
        @Override
        public String getDescription() { return "Холодное время года"; }
    };

    private final double averageTemp;

    Season(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}