package BasicProblems;

public class Printdivisor {

    public static int[] Divisor(int n, int[] size) {
        int[] divisors = new int[n]; // max possible size is n
        int count = 0;

        for (int i = 1; i <= n; i++) { // start from 1, include n itself
            if (n % i == 0) {
                divisors[count++] = i;
            }
        }

        size[0] = count; // return the count using the size array
        return divisors;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] size = new int[1];
        int[] divisors = Divisor(number, size);

        System.out.print("Divisors of " + number + " are: ");
        for (int i = 0; i < size[0]; i++) {
            System.out.print(divisors[i] + " ");
        }
        System.out.println();

        divisors = null; // optional: allow garbage collection
    }
}
