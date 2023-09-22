package arrays;

import java.util.Scanner;

public class unique_no {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                System.out.println(arr[i]);
            }

        }
    }
}
