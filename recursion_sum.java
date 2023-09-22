package arrays;

public class recursion_sum {

    public static int summ(int n) {
        if (n == 0) {
            return 0;
        }
        int temp = summ(n - 1);
        return temp + n;
    }

    public static void main(String args[]) {

        int n = 4;
        System.out.println(summ(n));

    }

}
