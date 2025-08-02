import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        String playAgain;

        do {
            int numberToGuess = rand.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            int maxAttempts = 7;

            System.out.println("🎯 Guess the number between 1 and 100. You have " + maxAttempts + " attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("✅ Correct! You guessed it in " + attempts + " attempt(s).");
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }

                if (attempts == maxAttempts) {
                    System.out.println("❌ Out of attempts! The number was: " + numberToGuess);
                }
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        System.out.println("🏁 Game Over! Your score: " + score);
        sc.close();
    }
}
