class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    } 
    
    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    } 

    // print a list
    public void printList() {
        if(head == null) {
            System.out.println("List is Empty!!");
            return;
        }
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // delete - first
    public void deleteFirst() {
        if(head == null) {
            System.out.println("List is Empty!!");
            return;
        }
        size--;
        head = head.next;
    }

    // delete - last
    public void deleteLast() {
        if(head == null) {
            System.out.println("List is Empty!!");
            return;
        }
        size--;
        if(head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // size
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Name");    
        list.addFirst("My");    
        list.printList();

        list.addLast("is");    
        list.addLast("Yashesh!!");
        list.printList();

        list.deleteFirst();
        list.printList();
        
        list.deleteLast();
        list.printList();

        System.out.println("Size : " + list.getSize());
        
        list.addFirst("My");
        System.out.println("Size : " + list.getSize());

    }
}