public class Recursion5 {
    public static void fibonacci(int a, int b, int n) {
        if(n==0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        a = b;
        b = c;
        fibonacci(a, b, n-1);
    }
    public static void main(String[] args) {
        int a = 0; 
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        fibonacci(a, b, n-2);
    }
}
