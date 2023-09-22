package interview_que;

import java.util.*;

public class prime_number {
    public static void main(String args[]) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }

    public static boolean check(int n) {
        for (int i = 0; i < n / 2; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}