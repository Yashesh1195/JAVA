package Exercise1;
import java.util.*;
public class Main10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nummber of terms: ");
        int n = sc.nextInt();
        int i, a = 0, b = 1, c;

        for(i=1; i<=n; i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
}
