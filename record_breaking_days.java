package arrays;

public class record_breaking_days {

    public static void record(int arr[]) {
        int n=arr.length;
        int cnt=0;
        int i=0;
        if(arr[i]>arr[i+1]){
            cnt++;
            i++;
        }
        while(i<n-1){
            int check=0;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    check++;
                }
            if(arr[i]>arr[i+1]&&check==i){
            cnt++;
            }
        }
            i++;
        }
        int ck=0;
        for(int k=0;k<i;k++){
        if(arr[i]>arr[k]){
            ck++;
        }
        if(ck==i){
            cnt++;
        }
    }
        System.out.println(cnt);
    }
    public static void main(String[] args){
        int arr[]={1,2,9,2,8};
        record(arr);
    }
}
// -------------------------
// {1,3,0,2,6,7,0,8}
//    ^       ^   ^       these three are record breaking days...because previous all days are less thanthat days and next day of that day(only one day) is also less.