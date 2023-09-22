package arrays;

import java.util.Scanner;

public class user_input_2d_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of columns");
        int m = sc.nextInt();
        System.out.println("enter the no of rows");
        int n = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("array elemets are");
        for (int y = 0; y < n; y++) {
            for (int z = 0; z < m; z++) {
                System.out.print(arr[y][z] + "");
            }
            System.out.println();

        }
        // linear searching of 2d matrix
        int find = 7;
        for (int y = 0; y < n; y++) {
            for (int z = 0; z < m; z++) {
                if (arr[y][z] == find) {
                    System.out.println(y + "" + "" + z);
                    break;
                }
            }

        }

    }
}
