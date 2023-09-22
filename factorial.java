package interview_que;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));

    }

    // public static long factorial(long n) {
    // if (n == 1) {
    // return 1;
    // }
    // return n * factorial(n - 1);

    // }
    public static int factorial(int n) {

        for (int i = n - 1; i > 0; i--) {
            n = n * i;
            // System.out.println(n);
        }
        return n;
    }

}
