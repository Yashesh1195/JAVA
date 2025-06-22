import java.util.*;
public class Recursion3 {
    public static void printSum(int i, int n, int sum) {
        if(i==n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        printSum(i, n, sum);

        sc.close();
    }
}
