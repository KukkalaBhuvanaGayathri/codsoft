import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rounds, totalAttempts = 0;

        System.out.print("How many rounds would you like to play? ");
        rounds = scanner.nextInt();

        for (int i = 0; i < rounds; i++) {
            int number = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 10;
            boolean guessed = false;

            System.out.println("Round " + (i + 1) + ": Guess the number between 1 and 100. You have 10 attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    guessed = true;
                    break;
                }
            }

            if (!guessed) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + number + ".");
            }

            totalAttempts += attempts;
        }

        System.out.println("Game over! You played " + rounds + " rounds with a total of " + totalAttempts + " attempts.");
        scanner.close();
    }
}
