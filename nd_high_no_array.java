package interview_que;

public class nd_high_no_array {

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 1, 7, 4 };
        System.out.println(check(arr));

    }

    public static int check(int arr[]) {
        int f = 0;
        int s = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                f = arr[i];
            } else if (arr[i] > arr[i + 1] && arr[i] < f) {
                s = arr[i];
            }
        }
        return s;

    }

}
