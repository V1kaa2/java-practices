package pr4;

public enum Level {
    HIGH (1),
    MEDIUM ( 2),
    LOW ( 3);
    private final int prior_inc;

    Level(int prior_inc) {
        this.prior_inc = prior_inc;
    }

    public int getPrior_inc() {
        return prior_inc;
    }

    @Override
    public String toString() {
        return "Level{" +
                "prior_inc=" + prior_inc +
                '}';
    }
}

