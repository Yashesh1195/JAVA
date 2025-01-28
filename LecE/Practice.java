package LecE;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k;

        //---1---
        // for(i=1; i<=n; i++){
        //     for(k=n-i; k>=1; k--){
        //         System.out.print(" ");
        //     }
        //     for(j=1; j<=n; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


        //---2---
        for(i=1; i<=n; i++){
            for(k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        //---3---
        

        sc.close();
    }
}
