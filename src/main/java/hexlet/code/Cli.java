package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void namePerson() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scName = new Scanner(System.in);
        String namePerson = scName.nextLine();
        System.out.println("Hello, " + namePerson);
    }
}
