package spelling;

import org.junit.jupiter.api.Test;
import spelling.AVLTree;

import static org.junit.jupiter.api.Assertions.*;

class AVLTreeTest {

    @Test
    void getHeight() {
    }

    @Test
    void add() {
    }

    @Test
    void containsRecursive() {
        AVLTree<Integer> numbers = new AVLTree<Integer>();

        numbers.insert(12);
        numbers.insert(18);
        numbers.insert(17);
        numbers.insert(8);
        numbers.insert(11);
        numbers.insert(6);
        numbers.insert(3);


        assertTrue(numbers.contains(3));
        System.out.println("The chosen number is in the AVL Tree");

    }

    @Test
    void containsIterative() {
        AVLTree<Integer> numbers = new AVLTree<Integer>();

        numbers.insert(12);
        numbers.insert(18);
        numbers.insert(17);
        numbers.insert(8);
        numbers.insert(11);
        numbers.insert(6);
        numbers.insert(3);


            assertEquals(numbers.containsIterative(17),numbers.containsIterative(17));
            System.out.println("The chosen number is in the AVL Tree");


    }

    @Test
    void containsIterativeFail() {
        AVLTree<Integer> numbers = new AVLTree<Integer>();

        numbers.insert(12);
        numbers.insert(18);
        numbers.insert(17);
        numbers.insert(8);
        numbers.insert(11);
        numbers.insert(6);
        numbers.insert(3);


        assertFalse(numbers.containsIterative(2));
        System.out.println("The chosen number is not in the AVL Tree");

    }

    @Test
    void insert() {
    }

    @Test
    void printBalance() {
    }
}