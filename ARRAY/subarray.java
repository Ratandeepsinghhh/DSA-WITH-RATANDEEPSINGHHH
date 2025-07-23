import java.util.*;

public class subarray {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the numbe rof elments : ");
        int n=input.nextInt();
        int arr[]=new int[n];
        int total=0;
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print( " ( "+arr[k]+" ) ");
                    
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
