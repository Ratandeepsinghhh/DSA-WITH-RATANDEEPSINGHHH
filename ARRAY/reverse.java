
import java.util.*;
public class reverse {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int end=arr1.length-1;
        int start=0;
        while(start<end){
            int temp=arr1[end];
            arr1[end]=arr1[start];
            arr1[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
