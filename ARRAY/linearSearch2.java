import java.util.*;

public class linearSearch2 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; 
        int target = 15;
        int index = -1;

        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                index = i;
                break;
            }
        }

        
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}

