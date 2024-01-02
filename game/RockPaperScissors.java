package game;

import utils.RandomUtils;

import java.util.HashMap;
import java.util.Scanner;

public class RockPaperScissors {

    private HashMap<String, Integer> choices;

    public RockPaperScissors() {
        initializeChoices();
    }

    public void playGame() {
        // Getting user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.nextLine().toLowerCase();

        // Validating user input
        if (!choices.containsKey(userChoice)) {
            System.out.println("Invalid choice. Please choose rock, paper, or scissors.");
            return;
        }

        // Generating random computer choice
        int computerChoice = RandomUtils.getRandomChoice();

        // Displaying choices
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer's choice: " + getKeyName(choices, computerChoice));

        // Determining the winner
        int result = (3 + choices.get(userChoice) - computerChoice) % 3;
        if (result == 0) {
            System.out.println("It's a tie!");
        } else if (result == 1) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    // Helper method to initialize choices
    private void initializeChoices() {
        choices = new HashMap<>();
        choices.put("rock", 0);
        choices.put("paper", 1);
        choices.put("scissors", 2);
    }

    // Helper method to get the key (choice) from its corresponding value (integer)
    private String getKeyName(HashMap<String, Integer> map, int value) {
        for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return null; // Should not reach this point if the map is correctly constructed
    }
}
