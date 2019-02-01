public class Factorial
{
    public int Factorial (int n, String type)
    {
        int x;
        x= factorial_iterative(n);
        return x;
    }

    public int factorial_iterative(int n)
    {
        int total = 1;
        for (int i = 1; i <= n; i++)
        {
            total *= i; 
        }
        return total;
    }
 
    public int factorial_recursive(int n)
    {
        System.out.println("fact recursive");

        if (n <= 1)
        {
            return 1;
        }

        return n * factorial_recursive(n - 1);
    }
}