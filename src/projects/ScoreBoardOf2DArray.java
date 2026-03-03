package projects;

import java.util.Scanner;

public class ScoreBoardOf2DArray {

    public static void main(String[] args) {

        Player p1 = new Player();
        p1.getPlayerName();
        p1.getScores();

        Player p2 = new Player();
        p2.getPlayerName();
        p2.getScores();

        Player p3 = new Player();
        p3.getPlayerName();
        p3.getScores();

        p1.displayHeadings();
        p1.displayScores();
        p2.displayScores();
        p3.displayScores();
    }
}

class Player {

    String playerName;
    int totalSCore = 0;
    static int games;
    Scanner sc = new Scanner(System.in);

    static {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        games = sc1.nextInt();

    }

    int[] scores = new int[games];

    public void getScores() {

        for (int i = 0; i < games; i++) {

            System.out.println("Enter the score of game" + (i + 1) + ": ");
            scores[i] = sc.nextInt();
            totalSCore = scores[i] + totalSCore;

        }
    }

    public void displayScores() {
        System.out.printf("%10s", playerName);//10s-To align the String spaces
        for (int i = 0; i < games; i++) {
            System.out.printf("%12d", scores[i]);//printf-To align the decimal spaces
        }
        System.out.printf("%12d\n", totalSCore);
    }

    public void getPlayerName() {
        System.out.print("Enter the playerName: ");
        playerName = sc.next();
    }

    public void displayTotalScore() {

        System.out.println("Total score of " + playerName + " " + totalSCore);
    }

    public void displayHeadings() {
        System.out.print("Names            ");
        for (int i = 0; i < games; i++) {
            System.out.print("game" + (i + 1) + "       ");
        }
        System.out.println("TotalSCore");
        sc.close();
    }



}








