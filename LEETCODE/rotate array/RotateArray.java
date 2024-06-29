import java.util.ArrayList;

public class RotateArray {
    public static void rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        // Normalize k to ensure it is within the bounds of the array length
        k = k % n;
        if (k < 0) {
            k += n;
        }
        
        // Create a new list to store rotated values
        ArrayList<Integer> rotated = new ArrayList<>(n);
        
        // Copy the rotated elements to the new list
        for (int i = 0; i < n; i++) {
            rotated.add(arr.get((i + k) % n));
        }
        
        // Print the rotated array
        for (Integer val : rotated) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(12);
        temp.add(3);
        temp.add(1);
        temp.add(67);
        temp.add(90);
        rotateArray(temp, 2); // Rotate by 2 positions
    }
}
