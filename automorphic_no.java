package interview_que;

public class automorphic_no {
    public static void main(String args[]) {
        int n = 0;
        int sq = n * n;
        int l = sq % 10;
        int m = n % 10;
        // System.out.println(sq);
        // System.out.println(l);
        if (m == l) {
            System.out.println("automorphic no");
        } else {
            System.out.println(" not automorphic no");
        }
    }
}
