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
            getCalc[1][i] = answer(getCalc[0][i]);
        }
        return getCalc;
    }
    static String answer(String question) {
        String answer = "";
        String operator = question.split(" ")[1];
        int firstNumber = Integer.parseInt(question.split(" ")[0]);
        int secondNumber = Integer.parseInt(question.split(" ")[2]);
        switch (operator) {
            case "+" -> {
                answer = Integer.toString(firstNumber + secondNumber);
            }
            case "-" -> {
                answer = Integer.toString(firstNumber - secondNumber);
            }
            case "*" -> {
                answer = Integer.toString(firstNumber * secondNumber);
            }
            default -> throw new RuntimeException("Unavailable operator");
        }
        return answer;
    }
}
