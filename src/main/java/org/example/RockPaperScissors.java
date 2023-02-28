package org.example;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class RockPaperScissors {


    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);


    }

    public static String getRandomChoice(int min, int max) {
        int randomInt = getRandomInt(min, max);
        String choice;
        switch (randomInt) {
            case 1:
                choice = "Rock";
                break;
            case 2:
                choice = "Paper";
                break;
            case 3:
                choice = "Scissors";
                break;
            default:
                choice = "Quit";
                break;
        }
        return choice;
    }

    public static String getWinner(String playerChoice, String computerChoice) {
        String winner = "";
        if (playerChoice.equals("Rock") && computerChoice.equals("Rock")) {
            winner = "Tie";
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Paper")) {
            winner = "Computer";
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            winner = "Player";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            winner = "Player";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Paper")) {
            winner = "Tie";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Scissors")) {
            winner = "Computer";
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Rock")) {
            winner = "Computer";
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            winner = "Player";
        }
        return winner;
    }

    public static void printWinner(String playerChoice, String computerChoice) {
        String winner = getWinner(playerChoice, computerChoice);
        if (winner.equals("Tie")) {
            System.out.println("It's a tie!");
        } else if (winner.equals("Computer")) {
            System.out.println("The computer won!");
        } else if (winner.equals("Player")) {
            System.out.println("You won!");
        }
    }

    public static void playGame() {
        String playerChoice = "";
        String computerChoice = "";
        String winner = "";
        Scanner s = new Scanner(System.in, StandardCharsets.UTF_8);

        while (!playerChoice.equals("4")) {
            playerChoice = s.nextLine();
            computerChoice = getRandomChoice(1, 3);
            System.out.println("You chose " + playerChoice + " and the computer chose " + computerChoice + ".");
            printWinner(playerChoice, computerChoice);
        }
    }

    public static void main(String[] args) {
            playGame();
    }




}
