public class FactorialMain {

    public static void main(String[] args) {

        int n = Factorial.fact(5);
        System.out.println("Recursive: 5! is: " + n);
        System.out.println("Iterative: 5! is: " + n);

        int nIT = Factorial.factIt(5);
        System.out.println("Iterative: 5! is: " + nIT);

        int x = 6;
        int y = 2;

        int ans = Factorial.myPow(x,y);
        System.out.println("\nRecursive result of " + x + " to the power of " + y + " is " + ans);


        int [] nos = {2,5,7,9,14};
        System.out.println("Bin Search Result: " + Factorial.binSearchDisplay(nos,2));


        Factorial.fibonacciDisplay(10);


        //Recursive
        System.out.println("\n");
        //Factorial.fibonacciRecursDisplay(10);

        //Iterative
        System.out.println("\n");
       Factorial.fibonacciRecursiveDisplay(10);

    }
}
