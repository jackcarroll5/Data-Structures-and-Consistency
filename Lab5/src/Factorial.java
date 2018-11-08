// Factorial.java
// Recursive factorial method

import java.lang.reflect.Array;

public class Factorial {
   
   // Recursive definition of method factorial
   public static int fact(int n)
   {      
      if ( n == 1 || n == 0 )  // base case
         return 1;
      else {
         int result1 = fact(n-1); 
         int result2 = n * result1;
         return result2;
         //return n * fact(n-1);
      }
   }

    // Iterative definition of method factorial
    public static int factIt(int n)
    {
       int product = 1;

       for (int i = 1; i <= n; i++)
       {
           product *= i;
       }

       return product;
    }


   public static int myPow(int x, int y)
   {
       if(y == 0)
       {
           return 1;
       }
       else
       {
           int res1 = myPow(x, y - 1);
           int res2 = x * res1;
           return res2;
       }
   }

  public static int myPowIteration(int x, int y)
  {
      int res = 1;

      if(y == 0)
      {
          return res;
      }
      else {

         for (int i = 0; i < y; i++)
         {
             res = res * x;
         }
         return res;
      }

  }


  public static int smallestRecursion(int[] nos, int y)
  {
      if(y == 1)
      {
          return nos[0];
      }
      else
      {

          int smallestCurrent = smallestRecursion(nos, y - 1);

          if (nos[y] < smallestCurrent)
          {
              smallestCurrent = nos[y];
          }

          return smallestCurrent;
      }
  }

    public static int binarySearchRecursive(int[] a, int currentSize, int searchKey) {
        int l = 0;
        int r = currentSize - 1;
        boolean found = false;

        while (!found && l <= r)
        {
            int m = ((l + r) / 2);

            if (searchKey == a[m])
            {
                found = true;
            }
            else if (searchKey < a[m])
            {
                r = m - 1;
            }
            else
            {
                l = m + 1;
            }
        }

        int m = ((l + r) / 2);

        if (found)
        {
            return m;
        }
        else
        {
            return -1;
        }
    }

    public static int binarySearchAltRecursive(int[] a, int searchKey, int low, int high) {

        int mid = low + (high + low) / 2;

        if(high <= low) {
             return -1;
        }

                if (searchKey < a[mid]) {
                    return binarySearchAltRecursive(a, searchKey, low, mid - 1);
                }

                if (searchKey > a[mid]) {
                    return binarySearchAltRecursive(a, searchKey, mid + 1, high);
                }

                    if(searchKey == a[mid]) {
                        return mid;
                    }

        return -1;
    }

    public static int binSearchDisplay(int[] array, int key)
    {
        return binarySearchAltRecursive(array,key,0,array.length - 1);
    }

    //Insertion method
    public static int fibonacci(int n)
    {
        if(n == 0)
        {
            return 0;
        }

        if(n == 1)
        {
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++)
        {
           nth = first + second;
           first = second;
            second = nth;
        }
        return nth;
    }

    public static void fibonacciDisplay(int no)
    {
        for (int i = 0; i < no; i++)
            System.out.print(fibonacci(i) + " ");
    }

    public static int fibonacciRecursive(int n)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static void fibonacciRecursDisplay(int no)
    {
        for (int i = 0; i < no; i++)
            System.out.print(fibonacciRecursive(i) + " ");
    }

    public static int fibonacciRecurs(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int f1 = 1;
        int f2 = 1;
        int fib = 1;

        for(int i = 3; i <= n; i++)
        {
            fib = f1 + f2;
            f1 = f2;
            f2 = fib;
        }
       return fib;
    }

    public static void fibonacciRecursiveDisplay(int no)
    {
        for (int i = 0; i < no; i++)
            System.out.print(fibonacciRecurs(i) + " ");
    }

        public static int binarySearch(int[] a, int currentSize, int searchKey) {
        int l = 0;
        int r = currentSize - 1;
        boolean found = false;

        while (!found && l <= r)
        {
            int m = ((l + r) / 2);

            if (searchKey == a[m])
            {
                found = true;
            }
            else if (searchKey < a[m])
            {
                r = m - 1;
            }
            else
            {
                l = m + 1;
            }
        }

        int m = ((l + r) / 2);

        if (found)
        {
            return m;
        }
        else
        {
            return -1;
        }
    }

    public static int binarySearchAlt(int[] a, int searchKey) {

        int low = 0;
        int high = a.length - 1;

        if(low <= high)
        {
            //Check fixed point in array
            while (low <= high)
            {
                int mid = low + (high + low) / 2;

                if (searchKey < a[mid])
                    high = mid - 1;

                else if (searchKey > a[mid])
                    low = mid + 1;

                else
                    //if(searchKey == a[mid])
                    return mid;
            }
        }
        return -1;
    }


}

