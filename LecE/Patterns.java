package LecE;

public class Patterns {
    public static void main(String[] args) {
        int i, j, k;
        int n = 4;
        int m = 5;

        // PATTERNS 1 TO 9


    //Solid Rectangle

    // for(i = 1; i <= n; i++) {
    //     for(j = 1; j <= m; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println("");
    // }

    //Hollow Rectangle

    // for(i = 1; i <= n; i++) {
    //     for(j = 1; j <= m; j++){
    //         if(i == 1 || j == 1 || i == n || j == m) {
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    // }

    //Half Pyramid

    // for(i = 1; i <= 4; i++) {
    //     for(j=1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //Inverted Half Pyramid
    // for(i=1; i<=4; i++) {
    //     for(j=4; j>=i; j--) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    // //OR=========

    // for(i=4; i>=1; i--) {
    //     for(j=1; j<=i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //Inverted Half Pyramid(Rotated by 180 deg)
    // for(i = 1; i <= 4; i++) {
    //     for(k=1; k<=4-i; k++){
    //         System.out.print(" ");
    //     }
    //     for(j=1; j<= i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //Half Pyramid With Numbers
    // for(i=1; i<=4; i++){
    //     for(j=1; j<=i; j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    //Inverted Half Pyramid With Numbers
    // for(i=5; i>=1; i--){
    //     for(j=1; j<=i; j++){
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    // Floyd's Triangle
    // int num = 1;
    // for(i=1; i<=4; i++){
    //     for(j=1; j<=i; j++){
    //         System.out.print(num+" ");
    //         num++;
    //     }
    //     System.out.println();
    // }

    //0-1 Triangle
    for(i=1; i<=5; i++) {
        for(j=1; j<=i; j++) {
            if((i+j)%2 == 0){
                System.out.print(1+" ");
            }
            else {
                System.out.print(0 + " ");
            }
        }
        System.out.println();
    }

    }
}
