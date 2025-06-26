import java.util.*;

public class LL_CF {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("name");
        list.addFirst("My");
        System.out.println(list);
        
        list.addLast("is");
        System.out.println(list);
        list.addLast("Yashesh");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + "->");
        }
        System.out.println("NULL");

        // list.removeFirst();
        // System.out.println(list);
        
        // list.removeLast();
        // System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }    
}
