package arrays;

public class recursion_power {
    public static int power(int p, int n) {
        if (p == 0) {
            return 1;
        }
        int prevPower = power(p - 1, n);
        return n * prevPower;

    }

    public static void main(String args[]) {
        int n = 2;
        int p = 3;
        System.out.println(power(p, n));
    }
}
