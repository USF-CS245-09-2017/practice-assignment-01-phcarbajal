public class Fibonacci
{
   public int Fibonacci (int n, String type)
   {
        int x= fibonacci_iterative(n);
        return x;
   } 

   public int fibonacci_iterative(int n)
   {
       if (n <= 1)
       {
           return n;
       }
       
       int fib = 1;
       int prevFib = 1;
       
       for (int i = 2; i < n; i++)
       {
           int temp = fib;
           fib += prevFib;
           prevFib = temp;
       }
       return fib;
   }

   public int fibonacci_recursive(int n)
   {
        System.out.println("fib recursive");

        if (n <= 1)
        {
            return 0;
        }

        return fibonacci_recursive(n - 1) + fibonacci_recursive( n - 2);
   }
}