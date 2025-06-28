import java.util.Collections;
import java.util.LinkedList;

class RLL {
    Node head;
    private int size;

    RLL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    } 
    
    // add - last
    public void addLast(int data) {
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

    // reversing a Linked List
    
    // Iterative Method 
    // Time complexity - O(n) 
    // Space complexity - O(1) 
    public void reverseIterate() {
        if(head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // updating the values
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // Recursive Method 
    // Time complexity - O(n) 
    // Space complexity - O(1)
    public Node reverseListRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);
        head.next.next = head;
        head.next = null;
        
        return newHead;
    }   

    public static void main(String[] args) {
        RLL list = new RLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.head = list.reverseListRecursive(list.head);
        list.printList();


        // Collections Method 
        // Time complexity - O(n) 
        // Space complexity - O(1)
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1); 
        list1.add(2); 
        list1.add(3);
        Collections.reverse(list1);
        System.out.println(list1);  
    }
}
