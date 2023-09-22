package arrays;
import java.math.*;;
public class max_min_array {
    public static void main(String[] args) {
        int a[]={35,20,20,15,40,42,32};
        int max=a[0];
        for (int i=0; i<7;i++){
            if(a[i]>max){
                max=a[i];
            }

        }
        int min=a[0];
        for (int i=0; i<7;i++){

            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
        
        

        
    }
    
}
