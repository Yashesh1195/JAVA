public class Recursion4 {
    public static int printFactorial(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int fact = n * printFactorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        int n = 6;
        int fact = printFactorial(n);
        System.out.println(fact);
    }
}
