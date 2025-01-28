package LecC;

import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int op = sc.nextInt();

        switch(op) {
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: 
            if(b == 0){
                System.out.println(a / b);
            }
            else{
                System.out.println("Invalid Division");
            }
            break;
            case 5: 
            if(b == 0){
                System.out.println(a % b);
            }
            else{
                System.out.println("Invalid Division");
            }
            break;
            default: System.out.println("Enter Valid Command");
            break;
        }
        
        sc.close();
    }
}
