package BasicProblems;

public class Armstrong {

    public static boolean isArmstrong(int n){
        int sum=0;
        int k = String.valueOf(n).length();
        int temp= n ;

        while(temp!=0){
            int digit = temp  % 10;
            sum += Math.pow(digit,k);
            temp /= 10;
        }

        return sum==n ? true:false;

    }
    public static void main(String[] args) {
        int number = 153;
        System.out.println(isArmstrong(number));
    }
}
