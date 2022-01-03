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
            getGCD[1][i] = answer(getGCD[0][i]);
        }
        return getGCD;
    }
    static String answer(String question) {
        String answer = "";
        int firstNumber = Integer.parseInt(question.split(" ")[0]);
        int secondNumber = Integer.parseInt(question.split(" ")[1]);
        int minValue = Math.min(firstNumber, secondNumber);
        int maxValue = Math.max(firstNumber, secondNumber);
        for (int j = minValue; j > 0; j--) {
            if ((maxValue % j == 0) && (minValue % j == 0)) {
                answer = Integer.toString(j);
                break;
            }
        }
        return answer;
    }
}
