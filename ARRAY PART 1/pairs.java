import java.util.Scanner;

public class pairs{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        int n=input.nextInt();
        int arr1[]=new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<n;i++){
            arr1[i]=input.nextInt();
        }


        System.out.println("Unique pairs are:");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print("(" + arr1[i] + "," + arr1[j] + ") ");
            }
            System.out.println();
        }
    }
}

