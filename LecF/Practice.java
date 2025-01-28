package LecF;
import java.util.*;
public class Practice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k;

        //================
        //Hollow Butterfly
        // for(i=1; i<=n; i++){
        //     for(j=1; j<=i; j++){
        //         if(j==1 || j==i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     for(k=1; k<=2*(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(j=1; j<=i; j++){
        //         if(j==1 || j==i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // for(i=n; i>=1; i--){
        //     for(j=1; j<=i; j++){
        //         if(j==1 || j==i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     for(k=1; k<=2*(n-i); k++){
        //         System.out.print(" ");
        //     }
        //     for(j=1; j<=i; j++){
        //         if(j==1 || j==i){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //==============
        //Hollow Rhombus
        for(i=1; i<=n; i++){
            for(k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Pascal's Triangle


        //Half Pyramid
        for(i=1; i<=n; i++){
            for(k=1; k<=(n-i); k++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        for(i=1; i<=n; i++){
            for(j=n-i+1; j>=1; j--){
                System.out.print(i+"");
            }
            System.out.println();
        }
        
    }
}
