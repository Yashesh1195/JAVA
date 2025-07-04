import java.util.*;
public class Queue_CF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }  
    }
}

// | Operation            | LinkedList                              | ArrayDeque                                                   |
// | -------------------- | --------------------------------------- | ------------------------------------------------------------ |
// | **Add at tail**      | O(1)                                    | Amortized O(1)                                               |
// | **Remove from head** | O(1)                                    | O(1)                                                         |
// | **Random access**    | O(n) (linear search)                    | O(1) (array-based) but no direct random access API for queue |
// | **Memory overhead**  | Higher (stores node objects + pointers) | Lower (array + indices)                                      |
