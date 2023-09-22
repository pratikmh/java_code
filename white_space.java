package interview_que;

import java.util.Scanner;

public class white_space {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String str1 = sc.nextLine();
        String str2 = str1.replaceAll(" ", "");
        // String str2 = str1.strip();
        System.out.println(str2);

    }
}