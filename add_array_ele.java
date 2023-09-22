package interview_que;

public class add_array_ele {
    public static void main(String args[]) {
        int arr[] = { 1, 4, 6, 7 };
        int tot = 0;
        for (int i = 0; i < arr.length; i++) {
            tot = arr[i] + tot;
        }
        System.out.println(tot);
    }

}
