package sorting;
import java.util.*;

public class bubblesorting {
    //bubble sort algorithm
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
   
    public static void main(String[] args) {
        // Scanner class for taking input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = input.nextInt(); // for the size of array
        int arr[] = new int[n];

        // taking input of elements 
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        
        bubblesort(arr);

        // printing sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
