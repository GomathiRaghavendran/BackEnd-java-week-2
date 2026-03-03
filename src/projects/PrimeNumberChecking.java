package projects;

import java.util.Scanner;

public class PrimeNumberChecking {

    public static void main(String[] args) {
        GivenNumberIsPrimeOrNot gn=new GivenNumberIsPrimeOrNot();

        System.out.println("Enter the number: ");
        int n = gn.scanner.nextInt();

    if (gn.isPrime(n)) {
            System.out.println("given number is a  prime");

        } else
            System.out.println("given number is not a prime");

        gn.displayPrimeNumbers();
    }

}
class GivenNumberIsPrimeOrNot {
    Scanner scanner = new Scanner(System.in);

    public boolean isPrime(int n) {

        if (n <= 1) {
            System.out.println("Given no is invalid");
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
   }

    public void displayPrimeNumbers() {
        int count=0;

        System.out.println("Enter the number1: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the number2: ");
        int n2 = scanner.nextInt();

        for (int i = n1; i <= n2; i++) {

            if (isPrime(i)) {
                count = count + 1;
                System.out.println("Prime numbers are: " + i);
            }

        }
        System.out.println("Count of prime numbers are: "+count);
    }
}

