package interview_que;

import java.util.*;

public class vowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to check");
        String str = sc.nextLine();
        System.out.println(check(str));

    }

    public static boolean check(String str) {
        return (str.toLowerCase()).matches(".*[p].*");

    }
}

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// System.out.println("enter string to check");
// String str = sc.nextLine();
// if (str.toLowerCase().matches(".*[aeiou].*")) {
// System.out.println("vowels present");
// } else {
// System.out.println("vowels not present");
// }

// }
// }
