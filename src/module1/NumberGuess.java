package ModuleProblems;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(101);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Let the game begin!");

        int[] guesses = new int[100];
        int attempt = 0;

        while (true) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            guesses[attempt++] = guess;

            if (guess < randomNumber) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }

        System.out.println("You made " + attempt + " guesses: ");
        for (int i = 0; i < attempt; i++) {
            System.out.print(guesses[i] + " ");
        }
        System.out.println();

    }
}

