package projects;
//Dice Roller with Methods
//Concepts used: Methods, random numbers, loops.
//
//Write a method rollDice() that returns a random number between 1–6.
//Ask the user how many times they want to roll the dice.
//Call rollDice() that many times and print the results.

import java.util.Random;
import java.util.Scanner;

public class RollDice {

    static int numberOfRoll;

    Scanner scanner = new Scanner(System.in);

    public void getTheNumberOfRollsFromUser() {
        System.out.println("Enter the number of rolls: ");
        numberOfRoll = scanner.nextInt();

    }


    public void rollDice() {
        Random r = new Random();
        for (int i = 0; i < numberOfRoll; i++) {
            int dice = r.nextInt(1, 7); // r.NextInt(6) will Generate the number between 0 and 5, to match it with the dice value adding 1 to it

            System.out.println("Enter the random number for the roll " + (i + 1) + ": " + dice);

        }
        scanner.close();

    }

    public class Dice {

        public static void main(String[] args) {

            RollDice rd = new RollDice();
            rd.getTheNumberOfRollsFromUser();
            rd.rollDice();


        }
    }
}


