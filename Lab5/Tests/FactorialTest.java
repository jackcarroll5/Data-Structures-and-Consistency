import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void fact() {
        int n = Factorial.fact(5);
        assertEquals(120,n);

    }

    @Test
    void myPow() {
        int x = 6;
        int y = 2;

      int n = Factorial.myPow(x,y);
     assertEquals(36,n);

    }

    @Test
    void myPowIteration() {
        int x = 4;
        int y = 3;

        int n = Factorial.myPowIteration(x,y);
        assertEquals(64,n);

    }

    @Test
    void smallestRecursion() {
        int [] nos = {1,5,7,9,14};

        System.out.println("Smallest number is ");
        assertEquals(1,Factorial.smallestRecursion(nos, 4));

    }

    @Test
    void binSearchRecursion() {
        int [] nos = {2,5,7,9,14};

        assertEquals(2,Factorial.binarySearchAltRecursive(nos,7,0,4));

    }






}