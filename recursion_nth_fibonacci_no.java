package arrays;

public class recursion_nth_fibonacci_no {

    public static int fib(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int prev = fib(n - 1);
        int prevPrev = fib(n - 2);
        return prev + prevPrev;

    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));

    }
}
