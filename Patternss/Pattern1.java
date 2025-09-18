package Patternss;


public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");  // print without new line
            }
            System.out.println();  // move to next line after a row
        }
    }
}

