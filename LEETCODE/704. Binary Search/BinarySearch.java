public class BinarySearch {
    
    // Solution class containing the search method
    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                
                if (nums[mid] == target) {
                    return mid;  // Target found, return its index
                } else if (nums[mid] < target) {
                    left = mid + 1;  // Search the right half
                } else {
                    right = mid - 1;  // Search the left half
                }
            }
            
            // If the target is not found, return -1
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1, 2, 3, 5, 6};
        
        int result = obj.search(arr, 6);
        System.out.println(result);  // Output: 4 (index of 6 in the array)
        
        result = obj.search(arr, 4);
        System.out.println(result);  // Output: -1 (4 is not in the array)
    }
}
