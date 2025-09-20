package Basic_Recursion;

public class Print1ToN {
    public static void func(int i , int n){
        if(i>n)return;
        System.out.println(i);

        func(i+1,n);
    }
    public static void main(String[] args) {
        int n = 5;
        func(1,n);
    }
}
