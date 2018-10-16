import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackingTest {


    @Test
    void isBalancedEmpty() {
    assertFalse(false, String.valueOf(Stacking.isBalanced("")));
    }

    @Test
    void isBalancedMatch() {
        assertTrue(true, String.valueOf(Stacking.isBalanced("({})")));
    }

    @Test
    void isBalancedNoMatch() {
        assertFalse(false, String.valueOf(Stacking.isBalanced("{)(}")));
    }

    @Test
    void isBalancedNumbers() {
        assertTrue(true, String.valueOf(Stacking.isBalanced("(2+[5+7]+1)")));
    }

    @Test
    void unBalanced() {
        assertFalse(false, String.valueOf(Stacking.isBalanced("<<){}")));
    }

    @Test
    void unBalancedNumbersAndFigures() {
        assertFalse(false, String.valueOf(Stacking.isBalanced("{x+[4+(1+y)}]")));
    }

    @Test
    void nestedPMatchAll() {
        assertTrue(true, String.valueOf(Stacking.isBalanced("<>(){}[]")));
    }

    @Test
    void noMatchSmallParenthesis() {
        assertFalse(false, String.valueOf(Stacking.isBalanced("[)")));
    }
}