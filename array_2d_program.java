package arrays;

public class array_2d_program {

    public static void main(String args[]) {

        int arr[][] = { { 3, 4, 6, 8, 7 },
                { 4, 6, 7, 9, 6 },
                { 3, 2, 5, 0, 9 },
                { 1, 4, 0, 9, 0 } };
        int n = arr.length;
        int m = arr[0].length;
        int fr = 0, lr = n - 1, fc = 0, lc = m - 1;
        while (fr <= lr) {
            for (int col = fc; col <= lc; col++) {
                System.out.print(arr[fr][col]);
            }
            fr++;
            for (int row = fr; row <= lr; row++) {
                System.out.print(arr[row][lc]);
            }
            lc--;
            for (int col = lc; col >= fc; col--) {
                System.out.print(arr[lr][col]);
            }
            lr--;
            for (int row = lr; row >= fr; row--) {
                System.out.print(arr[row][fc]);
            }
            fc++;

        }
    }

    // int n = arr.length;
    // System.out.println(n);

    // for (int i = 0; i < 4; i++) {
    // for (int j = 0; j < 4; j++) {
    // System.out.print(arr[i][j]);
    // }
    // System.out.println();
    // }

}

// -----------------------------------------

// -->-->--->--> |
// ^-->-->-->--> v
// | ^--->-->-| | |
// ^ | <--- v v v
// | <--<--<-- _| |
// <--<--<--<---v