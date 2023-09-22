package arrays;

public class repted_array {

    public static void repeated(int arr[]) {
        int n = arr.length;
        // int check[] = new int[n];
        // for (int i = 0; i < n; i++) {
        // check[i] = arr[i];
        // }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(i);
                    break;
                }
                break;
            }
        }
        // for (int i = 0; i < n; i++) {
        // System.out.println(check[i]);
        // }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 5, 3, 4, 3, 5, 6 };
        repeated(arr);
    }
}
