package pattern;

public class pyramid {
    public static void main(String args[]) {

        int n = 4;
        for (int i = 0; i <= n; i++) {

            for (int k = n; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {

            for (int k = i; k <= n; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}
