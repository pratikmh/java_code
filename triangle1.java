package pattern;

public class triangle1 {
    public static void main(String args[]) {

        int n = 5;

        for (int i = 0; i <= n; i++) {
            for (int a = i; a <= n; a++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
        for (int k = 0; k <= n - 1; k++) {
            System.out.print("*" + "  ");
        }
    }
}