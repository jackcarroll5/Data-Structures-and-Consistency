package spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVLTreeTest {

    @Test
    void size() {
    AVLTree<Integer> tree = new AVLTree<Integer>();

    tree.insert(2);
    tree.insert(6);
    tree.insert(10);
    tree.insert(15);
    tree.insert(22);


        System.out.println("Height of tree: " + tree.getHeight());

        System.out.println("Size of tree: " + tree.size());

       tree.printBalance();

     int expRes = 5;


    assertEquals(expRes,tree.size());
    }










}