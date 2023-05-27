/**
 * This program allows the user to play Rock-Paper-Scissors against the computer.
 * The user enters their choice (1 for ROCK, 2 for PAPER, 3 for SCISSOR),
 * and the computer generates a random choice.
 * The program then determines the winner based on the choices and displays the result.
 */

package Sayam.com;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String winMessage = "You Won!!";
        String lostMessage = "Computer Won! Better Luck Next Time...";

        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(3) + 1;

            // Display game options to the user
            System.out.println("""
                    ---------- Enter a number to choose from below --------
                            
                    1 ---- ROCK
                            
                    2 ---- PAPER
                            
                    3 ---- SCISSOR
                            
                    -------------------------------------------------------
                            
                            
                    """);

            // Prompt the user for their choice
            System.out.print("Enter Your Choice: ");
            int userInput = scanner.nextInt();
            System.out.println("\n \n");

            // Determine the winner based on the choices
            if ((randomNumber == 1 && userInput == 1) || (randomNumber == 2 && userInput == 2) || (randomNumber == 3 && userInput == 3)) {
                // Draw condition
                if (randomNumber == 1) {
                    System.out.println("Both chose ROCK");
                } else if (randomNumber == 2) {
                    System.out.println("Both chose PAPER");
                } else {
                    System.out.println("Both chose SCISSOR");
                }
                System.out.println("Match Draw!!!");
            } else if ((randomNumber == 1 && userInput == 2)) {
                System.out.println("""
                        Computer : Rock
                        You : Paper
                        """);
                System.out.println(winMessage);
            } else if ((randomNumber == 1 && userInput == 3)) {
                System.out.println("""
                        Computer : Rock
                        You : Scissor
                        """);
                System.out.println(winMessage);
            } else if (randomNumber == 2 && userInput == 1) {
                System.out.println("""
                        Computer : Paper
                        You : Rock
                        """);
                System.out.println(lostMessage);
            } else if (randomNumber == 2 && userInput == 3) {
                System.out.println("""
                        Computer : Paper
                        You : Scissor
                        """);
                System.out.println(winMessage);
            } else if (randomNumber == 3 && userInput == 1) {
                System.out.println("""
                        Computer : Scissor
                        You : Rock
                        """);
                System.out.println(winMessage);
            } else if (randomNumber == 3 && userInput == 2) {
                System.out.println("""
                        Computer : Scissor
                        You : Paper
                        """);
                System.out.println(lostMessage);
            }

            // Prompt the user if they want to play again
            System.out.print("Do you want to play again? (y/n): ");
            char playAgainChoice = scanner.next().charAt(0);
            playAgain = (playAgainChoice == 'y' || playAgainChoice == 'Y');

            System.out.println();
        }
    }
}
