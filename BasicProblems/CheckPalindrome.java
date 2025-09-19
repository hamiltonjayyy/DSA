package BasicProblems;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        int number = num;

        while (number != 0) {
            int digit = number % 10;    // get last digit
            rev = rev * 10 + digit;     // build reversed number
            number = number / 10;       // remove last digit
        }

        if (rev == num) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
