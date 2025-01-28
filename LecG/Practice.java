package LecG;
import java.util.*;
public class Practice {
    
    //-----1-----
    // public static void checkPrime(int n){
    //     int i, count = 0;
    //     for(i=1; i<=n; i++){
    //         if(n % i == 0){
    //             count++;
    //         }
    //     }
    //     if(count == 2){
    //         System.out.println("It is a Prime Number!!");
    //         return;
    //     }
    //     else{
    //         System.out.println("It is not a Prime Number!!");
    //         return;
    //     }
    // }

    //-----2-----
    // public static void evenOdd(int n){
    //     if(n%2 == 0){
    //         System.out.println("It is even number!!");
    //         return;
    //     }
    //     else{
        //         System.out.println("It is odd number!!");
        //         return;
    //     }
    // }

    //-----3-----
    public static void table(int n){
        int i;
        for(i=1; i<=10; i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
        return;
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //-----1-----
        // int num = sc.nextInt();
        // checkPrime(num);

        //-----2-----
        // int num = sc.nextInt();
        // evenOdd(num);

        //-----3-----
        int num = sc.nextInt();
        table(num);


    }
}
