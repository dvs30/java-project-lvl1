package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public class Calc {
    static final String[] OPERATIONS = {"+", "-", "*"};
    static final String QUESTION = "What is the result if the expression?";

    public static void start() {
        GameEngine.start(QUESTION, getCalc());
    }

    static String[][] getCalc() {
        String[][] getCalc = new String[2][GameEngine.CHANCE];
        for (int i = 0; i < getCalc[0].length; i++) {
            int randomOperations = Utils.getRandomValueCalc(OPERATIONS.length);
            int firstNumber = Utils.getRandomValue();
            int secondNumber = Utils.getRandomValue();
            getCalc[0][i] = firstNumber + " " + OPERATIONS[randomOperations] + " " + secondNumber;
            getCalc[1][i] = gameLogic(OPERATIONS[randomOperations], firstNumber, secondNumber);
        }
        return getCalc;
    }

    static String gameLogic(String operator, int firstNumber, int secondNumber) {
        int result;
        switch (operator) {
            case "+" -> {
                result = firstNumber + secondNumber;
            }
            case "-" -> {
                result = firstNumber - secondNumber;
            }
            case "*" -> {
                result = firstNumber * secondNumber;
            }
            default -> throw new RuntimeException("Unavailable operator");
        }
        return String.valueOf(result);
    }
}
