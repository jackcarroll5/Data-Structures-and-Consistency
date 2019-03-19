package spelling;

/*****************************************************
*��� Title: AVLTree
*��� Author: 
*    Site owner/sponsor: Rosetta code
*��� Date: 11 October 2017
*��� Code version: edited 11 October 2017, at 14:46
*��� Availability: https://rosettacode.org/wiki/AVL_tree
*    (Accessed 24 November 2017)
*    Modified: 1. Uses generic type for data instead of int
*     2. Added add method - to match Dictionary interface
*     3. Added contains method - to match Dictionary interface         

*****************************************************/

public class AVLTree<E extends Comparable<E>> { 
 
    private class Node {
        private E key;
        private int balance;
        private int height;
        private Node left;
        private Node right;
        private Node parent;
 
        Node(E key, Node parent) {
            this.key = key;
            this.parent = parent;
        }
    }
 
    private Node root;

    public int getHeight(){
        return root.height;
    }
    
    public void add(E word) {
        insert(word);
    }
    
    public boolean contains(E word){
        Node current = root;
        
        while (current != null)
        {
            int result = current.key.compareTo(word);

            if (result == 0)
                return true;
            else if (result < 0)
                // go right
                current = current.right;
            else
                // go left
                current = current.left;
        }
        return false;
    }
     
    public boolean insert(E key) {
        if (root == null) {
            root = new Node(key, null);
            return true;
        }
 
        Node n = root;
        while (true) {
            if (n.key == key)
                return false;
 
            Node parent = n;
            
            //boolean goLeft = n.key > key;
            boolean goLeft = false;
            if (n.key.compareTo(key) > 0)
                goLeft = true;
            
            n = goLeft ? n.left : n.right;
 
            if (n == null) {
                if (goLeft) {
                    parent.left = new Node(key, parent);
                } else {
                    parent.right = new Node(key, parent);
                }
                rebalance(parent);
                break;
            }
        }
        return true;
    }
 
    private void rebalance(Node n) {
        setBalance(n);
 
        if (n.balance == -2) {
            if (height(n.left.left) >= height(n.left.right))
                n = rotateRight(n);
            else
                n = rotateLeftThenRight(n);
 
        } else if (n.balance == 2) {
            if (height(n.right.right) >= height(n.right.left))
                n = rotateLeft(n);
            else
                n = rotateRightThenLeft(n);
        }
 
        if (n.parent != null) {
            rebalance(n.parent);
        } else {
            root = n;
        }
    }
 
    private Node rotateLeft(Node a) {
 
        Node b = a.right;
        b.parent = a.parent;
 
        a.right = b.left;
 
        if (a.right != null)
            a.right.parent = a;
 
        b.left = a;
        a.parent = b;
 
        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else {
                b.parent.left = b;
            }
        }
 
        setBalance(a, b);
 
        return b;
    }
 
    private Node rotateRight(Node a) {
 
        Node b = a.left;
        b.parent = a.parent;
 
        a.left = b.right;
 
        if (a.left != null)
            a.left.parent = a;
 
        b.right = a;
        a.parent = b;
 
        if (b.parent != null) {
            if (b.parent.right == a) {
                b.parent.right = b;
            } else {
                b.parent.left = b;
            }
        }
 
        setBalance(a, b);
 
        return b;
    }
 
    private Node rotateLeftThenRight(Node n) {
        n.left = rotateLeft(n.left);
        return rotateRight(n);
    }
 
    private Node rotateRightThenLeft(Node n) {
        n.right = rotateRight(n.right);
        return rotateLeft(n);
    }
 
    private int height(Node n) {
        if (n == null)
            return -1;
        return n.height;
    }
 
    private void setBalance(Node... nodes) {
        for (Node n : nodes) {
            reheight(n);
            n.balance = height(n.right) - height(n.left);
        }
    }
 
    public void printBalance() {
        printBalance(root);
    }
 
    private void printBalance(Node n) {
        if (n != null) {
            printBalance(n.left);
            System.out.printf("%s ", n.balance);
            printBalance(n.right);
        }
    }
 
    private void reheight(Node node) {
        if (node != null) {
            node.height = 1 + Math.max(height(node.left), height(node.right));
        }
    }
 
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
 
        System.out.println("Inserting values 1 to 10");
        for (int i = 1; i < 10; i++)
            tree.insert(i);
 
        System.out.print("Printing balance: ");
        tree.printBalance();
        System.out.println("");
        System.out.println(tree.getHeight());
    }
}
