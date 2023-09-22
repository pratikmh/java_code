package arrays;

public class subarray_addition {
    public static void arr_add(int arr[]) {
        int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                total=total+arr[j];
                 
            }
            total=total+arr[i];
        }
        System.out.println("total of subarrays="+total);
    }
    public static void main(String args[]) {
        int arr[]={1,2,2};
        arr_add(arr);
        
    }
    
}
