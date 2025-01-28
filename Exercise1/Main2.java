package Exercise1;
import java.util.*;
public class Main2 {
    
    public static void sum(int n){
        int i;
        int summation = 0;
        for(i=1; i<=n; i++){
            if( i % 2 != 0){
                summation += i;
            }
        }
        System.out.println(summation);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        sc.close();
    }

}
