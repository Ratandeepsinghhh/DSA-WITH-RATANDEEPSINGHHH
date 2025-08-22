import java.util.*;

public class largest_smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int large,index;
        index=0;
        large = Integer.MIN_VALUE;
        int small =Integer.MAX_VALUE;
        int arr[] = new int[10];

        System.out.println("Enter the elmnents of array :");

        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] > large) {
                large = arr[i];
                index=i+1;
            }
        }
        System.out.println("largest number is :" + large);
        System.out.println("Position : "+index);
        index=0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < small) {
                small = arr[i];
                index=i+1;
            }
        }
        System.out.println("Smallest number is :" + small);
        System.out.println("Position : "+index);
    }

}
