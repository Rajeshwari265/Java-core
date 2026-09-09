package Jvacore;
import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; 
        int attempts = 0;
        int guess = 0;
        System.out.println("I've picked a number between 1 and 100. Try to guess it!");
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); 
                continue;
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You found it in " + attempts + " attempts.");
            }
        }
        scanner.close();
    }
}
