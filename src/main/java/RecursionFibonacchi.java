public class RecursionFibonacchi {

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n > 1)
            return fibonacci(n-1) + fibonacci(n-2);
        return  1 + fibonacci(n-1);

        // Complete the function.
    }

    public static void main(String args[])
    {
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(10));

    }
}
