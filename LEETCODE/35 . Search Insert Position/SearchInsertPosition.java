/**
 * SearchInsertPosition
 * Easy
 */
public class SearchInsertPosition {
    
    // Solution class containing the searchInsert method
    class Solution {
        public int searchInsert(int[] nums, int target) {
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
            
            // If the target is not found, left is the insertion point
            return left;
        }
    }
    
    public static void main(String[] args) {
        // Example usage:
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        Solution solution = searchInsertPosition.new Solution();
        
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println(solution.searchInsert(nums, target));  // Output: 2
        
        target = 2;
        System.out.println(solution.searchInsert(nums, target));  // Output: 1
        
        target = 7;
        System.out.println(solution.searchInsert(nums, target));  // Output: 4
        
        target = 0;
        System.out.println(solution.searchInsert(nums, target));  // Output: 0
    }
}
