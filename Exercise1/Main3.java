package Exercise1;
import java.util.*;
public class Main3 {
    
    public static int greater(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int larger = greater(a, b);
        System.out.println(larger+" is greater");
        sc.close();
    }

}
