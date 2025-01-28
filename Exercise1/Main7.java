package Exercise1;
import java.util.*;
public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        String choice;

        do{
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            if(num>0){
                positiveCount++;
            }
            else if(num<0){
                negativeCount++;
            }
            else{
                zeroCount++;
            }

            System.out.println("To enter another number, type yes or else no: ");
            choice = sc.next();
        }while(choice.equalsIgnoreCase("yes"));
        //equalsIgnoreCase is a method in Java that whether two strings are equal or not, ignoring the differences in case 

        System.out.println("Counts:- ");
        System.out.println("Positive Numbers = "+positiveCount);
        System.out.println("Negative Numbers = "+negativeCount);
        System.out.println("Zeroes = "+zeroCount);
        sc.close();
    }
}
