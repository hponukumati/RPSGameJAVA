import game.RockPaperScissors;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the game instance
        RockPaperScissors game = new RockPaperScissors();

        // Variable to control the game loop
        boolean playAgain = true;

        // Game loop
        while (playAgain) {
            // Play the game
            game.playGame();

            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.nextLine().toLowerCase();

            // Check if the player wants to continue
            playAgain = playAgainInput.equals("yes");
        }

        // Close the scanner
        scanner.close();
    }
}