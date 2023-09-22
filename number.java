package pattern;

public class number {
    public static void main(String[] args) {
        int rows = 8;
        int c = 65;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (c) + " ");
                c++;
            }
            System.out.println();
        }
        // // prints lower half pattern
        // for (int i = rows - 1; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }
    }

}