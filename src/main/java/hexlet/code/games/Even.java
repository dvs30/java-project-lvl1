package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public class Even {
    static final String QUESTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void start() {
        GameEngine.start(QUESTION, getAnswerEven());
    }

    static String[][] getAnswerEven() {
        String[][] getEven = new String[2][GameEngine.CHANCE];
        for (int i = 0; i < getEven[0].length; i++) {
            int temp = Utils.getRandomValue();
            getEven[0][i] = Integer.toString(temp);
            getEven[1][i] = temp % 2 == 0 ? "yes" : "no";
        }
        return getEven;
    }
}
