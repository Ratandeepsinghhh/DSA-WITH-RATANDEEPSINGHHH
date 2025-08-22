import java.util.*;

public class subarray {
    public static void main(String[] args) {
        int arr1[]={2,4,6,8,10};
        int i,j,k;
        for(i=0;i<arr1.length;i++){
            for(j=i+1;j<arr1.length;j++){
               
                for( k=0;k<j+1;k++){
                   
                    System.out.print(arr1[k]+" " );   
                }
                System.out.println();
            }   
            System.out.println();
        }
    }
}
