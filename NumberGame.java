import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        String playAgain;
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100.");

        do {
            int randomNumber = rand.nextInt(100) + 1;

            System.out.print("Your guess: ");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                System.out.println("Unbeliveable! You Won, You guessed it exactly right!");
                System.out.println("Closeness: 100%");
                System.out.println("Farness: 0%");
            } else {
                int difference = Math.abs(userGuess - randomNumber);
                double closeness = (1 - (double) difference / randomNumber) * 100;
                closeness = Math.max(0, Math.min(closeness, 100));
                double farness = 100 - closeness;

                System.out.println("The number Computer was thinking: " + randomNumber);
                System.out.printf("You were %.2f%% close.\n", closeness);
                System.out.printf("And %.2f%% far off.\n", farness);
                
            }

            System.out.print("\n Do you want to play again? If Yes press (yes/y) If NO press any other key: ");
            scanner.nextLine(); 
            playAgain = scanner.nextLine().trim().toLowerCase();
            System.out.println();

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("Thanks for playing");
        scanner.close();
    }
}
