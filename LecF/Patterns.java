package LecF;
import java.util.*;
public class Patterns {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k;

        //Butterfly Pattern

        //Upper Half
        // for(i=1; i<=n; i++){
        //     for(j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     for(k=1; k<=2*(n-i); k++){
        //         System.out.print(" ");
        //     }
            
        //     for(j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Lower Half
        // for(i=n; i>=1; i--){
        //     for(j=1; j<=i; j++){
        //         System.out.print("*");
        //     }

        //     for(k=1; k<=2*(n-i); k++){
        //         System.out.print(" ");
        //     }
            
        //     for(j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Solid Rhombus
        // for(i=1; i<=n; i++){
        //     for(k=1; k<=(n-i);k++){
        //         System.out.print(" ");
        //     }
        //     for(j=1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Number Pyramid
        // for(i=1; i<=n; i++){
        //     for(k=1; k<=n-i; k++){
        //         System.out.print(" ");
        //     }
        //     for(j=1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //Palindromic Pattern
        // for(i=1; i<=n; i++){
        //     //Spaces
        //     for(k=1; k<=(n-i);k++){
        //         System.out.print(" ");
        //     }

        //     //1st Half
        //     for(j=i; j>=1; j--){
        //         System.out.print(j);
        //     }

        //     //2nd Half
        //     for(j=2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        //Diamond Pattern
        for(i=1; i<=n; i++){
            for(k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(i=n; i>=1; i--){
            for(k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            // for(j=2; j<=i; j++){
            //     System.out.print(" *");
            // }
            for(j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
