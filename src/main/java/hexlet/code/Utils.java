package hexlet.code;

import java.util.Random;

public class Utils {
    static final int RANGE = 20;

    public static int getRandomValue() {
        Random rand = new Random();
        return rand.nextInt(RANGE);
    }

    public static int getRandomValueCalc(int range) {
        Random rand = new Random();
        return rand.nextInt(range);
    }
}
