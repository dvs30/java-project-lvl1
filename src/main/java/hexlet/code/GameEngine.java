package hexlet.code;

import java.util.Scanner;

public class GameEngine {
    public static final int CHANCE = 3;
    public static void start(String nameGame, String[][] getAnswer) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scName = new Scanner(System.in);
        String namePerson = scName.nextLine();
        System.out.println("Hello, " + namePerson + "!");
        System.out.println(nameGame);
        startGame(namePerson, getAnswer);
    }

    static void startGame(String namePerson, String[][] getAnswer) {

        boolean isWinner = true;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CHANCE; i++) {
            System.out.println("Question: " + getAnswer[0][i]);
            System.out.println("Your answer: ");
            String answer = sc.nextLine();
            if (answer.equals(getAnswer[1][i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + "is wrong answer ;(. "
                        + "Correct answer was '" + getAnswer[1][i] + "'.");
                isWinner = false;
            }
        }
        if (isWinner) {
            System.out.println("Congratulations, " + namePerson + "!");
        } else {
            System.out.println("Let's try again, " + namePerson + "!");
        }
    }
}
