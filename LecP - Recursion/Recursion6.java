public class Recursion6 {
    public static int printPower(int x, int n) {
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        int xPown = x * printPower(x, n-1);
        return xPown;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = printPower(x, n);
        System.out.println(result);
    }
}
