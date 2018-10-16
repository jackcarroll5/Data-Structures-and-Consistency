import java.util.*;

public class Stacking {


    public static void main(String[] args) {

        String str = "({})";
        if (str.isEmpty()) {
            System.out.println("Empty String");
            return;
        }

        System.out.println("Matching Parenthesis: " + isBalanced(str));

    }

    private static boolean isOpen(char ch) {
        String expression = "";
        Stack<Character> stackChar = new Stack<Character>();

        boolean balanced = true;
        int index = 0;

        while (balanced && index < expression.length()) {
            ch = expression.charAt(index);

            if (ch == '[' || ch == '(' || ch == '{') {
                stackChar.push(ch);
            }
        }

     return true;
    }

    private static boolean isClose(char ch)
    {

        Stack<Character> stackChar = new Stack<Character>();

        boolean balanced = true;


        if(ch == ']' || ch == ')' || ch == '}') {
            if (stackChar.isEmpty()) {
                balanced = false;
            }
        }

        return true;
    }

    private static boolean areMatching(char c1, char c2)
    {
         if (c1 == '(' && c2 == ')')
             return true;
         else if((c1 == '{' && c2 == '}'))
        return true;
        else if((c1 == '[' && c2 == ']'))
        return true;
        else
        return false;
    }

    public static boolean isBalanced (String expression)
    {
        if (expression.isEmpty())
            return true;


        //Stack<Character> stackChar = new Stack<Character>();

        Deque<Character> stackChar = new LinkedList<>();


         boolean balanced = true;
         int index = 0;

         while (balanced && index < expression.length())
         {
             char ch = expression.charAt(index);

             if (ch == '[' || ch == '(' || ch == '{')
             {
                stackChar.push(ch);
             }
          else if(ch == ']' || ch == ')' || ch == '}')
             {
                 if (stackChar.isEmpty())
                 {
                     balanced = false;
                 }
                 else {
                     if ((stackChar.peek() == '(' && ch == ')')
                             || ( stackChar.peek() == '{' && ch == '}')
                             || ( stackChar.peek() == '[' && ch == ']'))
                     {
                         stackChar.pop();
                     }
                     else {
                         balanced = false;
                     }
                 }
             }
              index++;
         }

         if (balanced && stackChar.isEmpty())
             return true;
         else
             return false;

    }



}



