package pr4;

public class Main {
static void main() {
    Level level = Level.HIGH;
    System.out.println(level);
    Level level1 = level;
    System.out.println(level1);
    for (Level i : Level.values()) {
        System.out.println(i);
        System.out.println(i.getPrior_inc());
    }
}
}
