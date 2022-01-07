package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public class GCD {
    static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void start() {
        GameEngine.start(QUESTION, getGCD());
    }

    static String[][] getGCD() {
        String[][] getGCD = new String[2][GameEngine.CHANCE];
        for (int i = 0; i < getGCD[0].length; i++) {
            int firstNumber = Utils.getRandomValue() + 1;
            int secondNumber = Utils.getRandomValue() + 1;
            getGCD[0][i] = firstNumber + " " + secondNumber;
            getGCD[1][i] = gameLogic(firstNumber, secondNumber);
        }
        return getGCD;
    }

    static String gameLogic(int firstValue, int secondValue) {
        String result = "";
        int minValue = Math.min(firstValue, secondValue);
        int maxValue = Math.max(firstValue, secondValue);
        for (int j = minValue; j > 0; j--) {
            if ((maxValue % j == 0) && (minValue % j == 0)) {
                result = String.valueOf(j);
                //пришлось оставить, так как не проходит проверку hexlet
                break;
            }
        }
        return result;
    }
}
