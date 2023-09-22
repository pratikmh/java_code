package pattern;

public class name_star {
    public static void main(String args[]) {
        String s = "pratik";

        int n = (s.length() / 2) + 2;
        for (int i = 0; i <= n; i++) {
            System.out.print("*" + " ");
        }
        System.out.println();
        System.out.println("*" + " " + s + "   " + "*");
        for (int j = 0; j <= n; j++) {
            System.out.print("*" + " ");
        }

    }

}