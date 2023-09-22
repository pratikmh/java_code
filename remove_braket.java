package interview_que;

public class remove_braket {

    public static void main(String args[]) {
        String str = "))()))(((";
        int n = str.length();
        char arr[] = new char[n + 1];
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == '(' && str.charAt(i + 1) == ')') {
                for (int j = 0; j < n; j++) {
                    arr[j] = str.charAt(i);
                    arr[j + 1] = str.charAt(i + 1);
                    j++;
                }

            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k]);

        }
    }
}
