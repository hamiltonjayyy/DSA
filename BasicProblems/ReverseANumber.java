package BasicProblems;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = n.nextInt();

        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed: " + reverse);
        n.close();
    }
}
