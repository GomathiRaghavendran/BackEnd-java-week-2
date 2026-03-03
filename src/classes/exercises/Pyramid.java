package classes.exercises;

import java.util.Scanner;

public class Pyramid {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        int userInput;

        System.out.print("Please enter the input: ");
        if (scanner.hasNextInt()){
            userInput = scanner.nextInt();
            printPyramid(userInput);
        }
        else {
            System.out.println("Your input is not an integer.");
        }


        scanner.close();
    }

    public static void printPyramid(int userInput) {

        for (int i = 1; i <= userInput;i++ ){

            for (int j = 0; j < i;j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void reversePrintPyramid(int userInput) {

        for (int i = userInput; i>0 ;i-- ){

            for (int j = 0; j < i;j++ ){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}

