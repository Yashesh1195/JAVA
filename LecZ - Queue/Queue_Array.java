public class Queue_Array {
    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        
        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //enqueue
        public static void add(int data) {
            if(rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //dequeue
        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //front or peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }

            int front = arr[0];
            return front;
        }


    }
    public static void main(String[] args) {
        Queue q = new Queue(6);

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