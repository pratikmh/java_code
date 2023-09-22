package arrays;
import java.util.*;

public class longest_subarray{

    public static void long_subarray(int arr[]) {
        int df=arr[1]-arr[0];
        int cnt=2;
        int ans=2;
        int n=arr.length;
        for(int i=1;i<n-1;i++){
            if(df==(arr[i+1]-arr[i])){
                cnt++;
                ans=Math.max(cnt,ans);
            }
            else{
                df=(arr[i+1]-arr[i]);
                cnt=2;
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args){
        int arr[]={0,2,5,6,2,0,11};
        long_subarray(arr);
    }
}