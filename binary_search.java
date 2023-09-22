package arrays;
public class binary_search {
    public static void searching(int arr[],int f,int l,int key){
        int mid=(f+l)/2;
        while(f<=l){
            if(arr[mid]<key){
                f=mid+1;
            }
            else if(arr[mid]>key){
                l=mid-1;
            }
            else{
                System.out.println("found at index:"+mid);
                break;
            }
           mid=(f+l)/2; 
        }
        if(f>l){
            System.out.println("not found");
        }
    }

    public static void main(String args[]) {
        int arr[]={10,20,30,45,50,60,65};
        int f=0;
        int l=arr.length-1;
        int key=65;
        searching(arr,f,l,key);
    }
}
