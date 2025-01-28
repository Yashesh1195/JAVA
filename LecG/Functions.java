package LecG;
import java.util.*;
public class Functions {

    //==================================
    //1
    //==================================
    // public static void printMyName(String name){
    //     System.out.println(name);
    //     return;//return ot the function that called this function
    // }

    //===================
    //2
    //===================
    // public static int calculateSum(int a, int b){
    //     int sum = a + b;
    //     // System.out.println(sum);
    //     return sum;
    // }

    //===================
    //3
    //===================
    // public static int mul(int a, int b){
    //     int multiply = a * b;
    //     return multiply;
    // }

    //====================
    //4
    //====================
    public static void fact(int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        else{
            int factorial = 1;
            for(int i=1; i<=n; i++){
                factorial = factorial * i;
            }
            System.out.println("Factorial of "+n+" = "+factorial);
            return;
        }
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //==================================
        //1
        //==================================
        // String name = sc.next();
        // // String name = sc.nextLine();
        // printMyName(name);//function call

        //===================
        //2
        //===================
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum = " + sum);

        //===================
        //3
        //===================
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int multiply = mul(a, b);
        // System.out.println("Multiplication of "+a+" and "+b+" = "+multiply);

        //====================
        //4
        //====================
        int n = sc.nextInt();
        fact(n);


        sc.close();
    }
}
