package BasicProblems;

public class Gcd2 {

    public static int Gcd2(int a,int b){
        while(a > 0 && b > 0){
            if(a>b){
                a = a%b;
            }else {
                b = b%a;

            }
        }

        if(a == 0){
            return b;
        }

        return a;
    }
    public static void main(String[] args) {
        int a=5;
        int b=5;
        System.out.println(Gcd2(a,b));

    }
}
