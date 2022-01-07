package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("/Hello, Tirion!/");
        menu();
        String inputChoiceNumber = new Scanner(System.in).nextLine();
        switch (inputChoiceNumber) {
            case "0" -> System.out.println("Goodbye!");
            case "1" -> Cli.namePerson();
            case "2" -> Even.start();
            case "3" -> Calc.start();
            case "4" -> GCD.start();
            case "5" -> Progression.start();
            case "6" -> Prime.start();
            default -> System.out.println("");
        }
    }

    protected static void menu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println("Your choice: ");
        return;
    }
}
