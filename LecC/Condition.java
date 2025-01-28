package LecC;
import java.util.*;
public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        
//===================
//if ... else
//===================

        // if(age>18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not Adult");
        // }

//===================
//if ... else
//===================

        // int num = sc.nextInt();

        // if(num%2==0){
        //     System.out.println("Even Number");
        // }
        // else{
        //     System.out.println("Odd Number");
        // }

        //===============
        // if ... else if
        //===============
        

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("Equal");
        // }
        // else{
        //     if(a > b){
        //         System.out.println("a greater than b");
        //     }
        //     else{
        //         System.out.println("a less than b");
        //     }
        // }
        // else if(a > b){
        //     System.out.println("a greater than b");
        // }
        // else{
        //     System.out.println("a less than b");
        // }

        //===============
        //Switch Case
        //===============

        int button = sc.nextInt();

        switch(button) {
            case 1: 
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Hola");
            break;
            case 3:
            System.out.println("Bonjour");
            break;
            default:
            System.out.println("Enter Valid Number");
            break;
        }

        sc.close();
    }
}
