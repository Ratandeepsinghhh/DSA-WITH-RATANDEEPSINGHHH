import java.util.*;

public class BinarySearch {
    public static int search(int arr[], int target) {
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid+1;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr1[] = {1,2,3,4,55,66,111,465,666,777,888};
        int target = 66;

        System.out.println("The position of target is : " + search(arr1, target));

    }
}
