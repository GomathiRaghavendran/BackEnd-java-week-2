package projects;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {


        ReversingAString rs = new ReversingAString();
        rs.countVowels();
        rs.reverseString();
        rs.isPalindrome();


    }
}


class ReversingAString {

    Scanner sc = new Scanner(System.in);
    String str;
    public void countVowels() {
        int count = 0;
        System.out.println("Enter the String:");
        str = sc.next();
        System.out.print("Vowels are: ");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {
                System.out.print(ch+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("number of vowels: "+count);
        }
    public String reverseString(){
           String reversed = " ";
        for (int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println("Reversed String: "+reversed);
        return reversed;
    }

    public boolean isPalindrome(){
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Given string is NOT a Palindrome");
                return false;
            }
        }
        System.out.println("Given string is a Palindrome");
        return true;
    }
}








