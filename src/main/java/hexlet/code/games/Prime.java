package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public class Prime {
    static final int DIVISION = 3;
    static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        GameEngine.start(QUESTION, getPrime());
    }

    static String[][] getPrime() {
        String[][] getPrime = new String[2][GameEngine.CHANCE];
        for (int i = 0; i < getPrime[0].length; i++) {
            int tempValue = Utils.getRandomValue();
            getPrime[0][i] = Integer.toString(tempValue);
            getPrime[1][i] = gameLogic(getPrime[0][i]);
        }
        return getPrime;
    }

    static String gameLogic(String question) {
        int temp = Integer.parseInt(question);
        boolean prime;
        if (temp <= 1) {
            prime = false;
            //исключаем значение 1 и 0
        } else if (temp <= DIVISION) {
            prime = true;
            //возвращаем true, так как 2 и 3 являются простыми числами
        } else if (temp % 2 == 0 || temp % DIVISION == 0) {
            prime = false;
            //исключаем все числа, которые делятся нацело на 2 и на 3
        } else {
            prime = true;
            //все остальные значения до 20 (исскуственное ограничение) подпадают под эту логику
        }
        return prime ? "yes" : "no";
    }
}
