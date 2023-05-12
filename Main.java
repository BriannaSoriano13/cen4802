public class Main {


    static int fib(int n)
    {
        if (n==0||n==1)
            return 0;
        else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        System.out.println("The 10th term of the Fibonacci sequence is " + fib(10));

    }
}