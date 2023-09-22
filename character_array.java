package arrays;

import java.util.Scanner;

public class character_array {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of array element");
        int n = sc.nextInt();
        char arr[] = new char[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("array elemets are");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);

        }
    }

}
