/**Advance Calculator
        Concepts used: Methods, parameters, return types.

        Create separate methods for addition, subtraction, multiplication, division , and modulus.
        Make it works for integers and doubles separately (method overloading).
        Ask the user for two numbers and an operation.
        Call the correct method and return the result.
        Do integer or double operations based on user input.*/


package projects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the int value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the int value of b: ");
        int b = scanner.nextInt();
        System.out.println("Enter the double value of x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the double value of b: ");
        double y = scanner.nextDouble();
        System.out.println("Entre the operator to perform operations");
        System.out.print("Enter operation (+, -, *, /): ");
        //char operation = scanner.next().charAt(0);
        String operation=scanner.next();


        Calculator calc = new Calculator();

        System.out.println("Integer Sum = " + calc.addMethod(a, b));
        System.out.println("Double Sum = " + calc.addMethod(x, y));
        System.out.println("Integer minus= " + calc.minusMethod(a, b));
        System.out.println("Double minus= " + calc.minusMethod(x, y));
        System.out.println("Integer multiply= " + calc.multiplyMethod(a, b));
        System.out.println("Double Multiply= " + calc.multiplyMethod(x, y));
        System.out.println("Integer Division= " + calc.divisionMethod(a, b));
        System.out.println("double division= " + calc.divisionMethod(x, y));
    }


      public int addMethod(int a, int b) {
            return a + b;
        }

        public double addMethod(double x, double y) {
            return x + y;
        }

        public int minusMethod(int a, int b) {
            return a - b;
        }

        public double minusMethod(double x, double y) {
            return x - y;
        }

        public int multiplyMethod(int a, int b) {
            return a * b;
        }

        public double multiplyMethod(double x, double y) {
            return x * y;
        }

        public int divisionMethod(int a, int b) {
            return a / b;
        }

        public double divisionMethod(double x, double y) {
            return x / y;
        }

      }




