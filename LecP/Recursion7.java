public class Recursion7 {
    public static int printPower(int x, int n) {
        if(n==0) { // base case 1
            return 1;
        }
        if(x==0) { // base case 2
            return 0;
        }

        //if n is even
        if(n % 2 == 0) {
            return printPower(x, n/2) * printPower(x, n/2);
        }
        else { //if n is odd
            return printPower(x, n/2) * printPower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = printPower(x, n);
        System.out.println(result);
    }
}
