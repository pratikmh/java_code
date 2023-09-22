package interview_que;

import java.util.*;

// import java.util.Scanner;
class Pratik {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to reverse");
        String str1 = sc.nextLine();
        String str2 = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            str2 = str2 + str1.charAt(i);
        }
        System.out.println(str2);
        sc.close();
    }
}

// Scanner sc=new Scanner(System.in);
// System.out.println("enter a");
// String a=sc.nextLine();
// String b="";

// for(int i=a.length()-1;i>=0;i--){
// b=b+a.charAt(i);

// }
// System.out.println(b);
// sc.close();
// }
// }