package BasicProblems;

public class CountDigits {

    public static int Count(int n){
        int cnt = 0;
        while(n>0){
            cnt += 1;
            n = n/10;
        }

        return cnt;
    }


    public static void main(String[] args) {

        int digits = 12345;
        System.out.println(Count(digits));

    }
}
