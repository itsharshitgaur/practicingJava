import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int chances = 5;
        System.out.println("Welcome to the Random Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("You have 5 chances to guess the correct number.");
        for (int i = 0; i < chances; i++) {
            System.out.print("Guess #" + (i + 1) + ": Enter your guess: ");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number correctly!");
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
            if (i == chances - 1) {
                System.out.println("Sorry, you've run out of chances. The correct number was: " + randomNumber);
            }
        }
        scanner.close();
    }
}