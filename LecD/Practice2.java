package LecD;
import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //====================================
        // int n = sc.nextInt();
        // int i;
        // for(i=0;i<n;i++) {
        //     if(i%2==0){
        //         System.out.println(i);
        //     }
        // }
        
        //====================================
        
        int num;

        do{
            System.out.println("Enter 1 to input marks of student or 0 to stop");
            num = sc.nextInt();

            if(num == 1){
                System.out.println("Enter Student's Marks (Out of 100)");
                int marks = sc.nextInt();

                if(marks>=90){
                    System.out.println("This is good");
                }
                else if(marks>=60 && marks<=89) {
                    System.out.println("This is also good");
                }
                else if(marks>=0 && marks<= 59) {
                    System.out.println("This is good as well");
                }
                else {
                    System.out.println("Invalid marks");
                }
            }
            else if(num != 0) {
                System.out.println("Invalid Choice!");
            }
        }while(num!=0);

        sc.close();
    }
}
