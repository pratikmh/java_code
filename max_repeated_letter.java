package interview_que;

import java.util.Scanner;

public class max_repeated_letter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        String str = sc.nextLine();
        int cnt = 1;
        int max = 1;
        char letter = ' ';
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    cnt++;

                }
                // System.out.println(cnt);
            }
            if (cnt > max) {
                max = cnt;
                letter = str.charAt(i);
            }
            cnt = 1;
        }
        System.out.println(max);
        System.out.println(letter);
    }
}
