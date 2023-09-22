package arrays;

public class sorting {
// ----------------------------------------------------
    public static void selection(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                }
            }
        }
    }
// ------------------------------------------------------
public static void bubble(int arr[]) {
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            }
        }
    }
}
// ------------------------------------------------------
    public static void display_array(int arr[])
     {
        int n=arr.length;
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
     }
// -------------------------------------------------------  

    public static void main(String[] args){
        int arr[]={2,5,1,7,2,4,8};
        // selection(arr);
        // bubble(arr);
        display_array(arr);
    }
}
