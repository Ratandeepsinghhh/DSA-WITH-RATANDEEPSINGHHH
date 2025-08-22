import java.util.*;


public class LinearSearch {
    public static int Search ( int arr1[] , int target) {
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==target){
                return i+1;
            }                                                                                                                                                                       
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int arr[]=new int[10];

        System.out.print("Enter the elements of array :");
    
        for(int i=0;i<10;i++){
            arr[i]=input.nextInt();
        }


        //making a target that needs to be searched
        int target;
        System.out.println("enter the element that needs to be searched");
        target=input.nextInt();

        int index= Search(arr,target);
        if(index==-1){
            System.out.println("TARGET NOT FOUND");
        }
        else{
            System.out.println("Target is at :" + index);
        }

        
    }
}
