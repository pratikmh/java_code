package arrays;
import java.util.Scanner;
public class searching_array {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of array element");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array elemets are");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        System.out.println("enter no to be search");
        int a=sc.nextInt();
        for(int j=0;j<n;j++){
            if(arr[j]==a){
                System.out.println("no is present at index:"+j);
            }
            // System.out.println("no is not in array");
        }
    
            
            
    }

    }
    

