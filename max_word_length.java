package arrays;

import java.util.*;
import java.util.Scanner;

public class max_word_length {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        int n = arr.length;
        // for (int i = 0; i < n; i++) {
        // System.out.println(arr[i]);
        // }

        int max = 0;
        String big = "";
        String curr = "";
        for (int i = 0; i < n; i++) {
            curr = arr[i];
            int temp = curr.length();
            if (temp > max) {
                max = temp;
                big = curr;
            }

        }
        System.out.println(max);
        System.out.println(big);
    }
}
