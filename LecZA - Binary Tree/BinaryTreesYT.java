import java.util.*;

public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }       
    }
    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    // Preorder Traversal
    // Time Complexity - O(n)
    // Depth First Search
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Inorder Traversal
    // Time Complexity - O(n)
    // Depth First Search
    public static void inorder(Node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Postorder Traversal
    // Time Complexity - O(n)
    // Depth First Search
    public static void postorder(Node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    // Level Order Traversal
    // Time Complexity - O(n)
    // Breadth First Search
    public static void levelorder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    // Counting of Nodes
    // Time Complexity - O(n)
    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // Sum of Nodes
    // Time Complexity - O(n)
    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    // Height of Tree
    // Time Complexity - O(n)
    public static int height(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int myHeight = Math.max(leftHeight, rightHeight) + 1;

        return myHeight;
    }

    // Diameter of a tree - Number of nodes in the longest path between any 2 nodes
    // Approach - 1
    // Time Complexity - O(n^2)
    public static int diameter1(Node root) {
        if(root == null) {
            return 0;
        }
        int diam1 = diameter1(root.left);
        int diam2 = diameter1(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));

    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    // Approach - 2
    // Time Complexity - O(n)
    public static TreeInfo diameter2(Node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam; 
        int diam2 = right.diam; 
        int diam3 = left.ht + right.ht + 1;
        
        int mydiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;
    }    

    // Subtree of another Tree
    // In Leetcode


    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);

        System.out.println("Root Node - "+root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        levelorder(root);

        System.out.println("Count of Nodes - "+countOfNodes(root));
        System.out.println("Sum of Nodes - "+sumOfNodes(root));
        System.out.println("Height of Tree - "+height(root));
        System.out.println("Diameter of Tree (Approach - 1) - "+diameter1(root));
        
        System.out.println("Diameter of Tree (Approach - 2) - "+diameter2(root).diam);
        
    }
}