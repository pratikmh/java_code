package pattern;

public class triangle {

    public static void main(String args[]) {

        int n = 4;
        // for (int i = 0; i <= n; i++) {
        // System.out.print("*" + " ");
        // }
        // System.out.println(" ");
        System.out.println("*");
        for (int k = 0; k <= n - 2; k++) {
            System.out.print("*");
            for (int j = -2; j <= k - 2; j++) {
                System.out.print("  ");
            }

            System.out.println("*");
        }

        for (int i = 0; i <= n; i++) {
            System.out.print("*" + " ");
        }
    }
}