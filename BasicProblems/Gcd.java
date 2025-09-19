package BasicProblems;
import java.lang.Math;
public class Gcd {
    public static int Gfc(int a, int b) {
        int Gcd = 1;
        for(int i = 1;i <= Math.min(a,b);i++){
            if(a % i == 0 && b % i == 0){
                Gcd = i;
            }
        }
        return Gcd;
    }


    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 5;
        System.out.println(Gfc(n1,n2));

    }
}
