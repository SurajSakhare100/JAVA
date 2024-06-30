import java.util.Arrays;

public class AgressiveCows {
    public static boolean check(int mid, int[] stalls, int m, int n) {
        int count = 1;
        int lastPosition = stalls[0];
        
        for (int i = 1; i < n; i++) {
            if (stalls[i] - lastPosition >= mid) {
                count++;
                lastPosition = stalls[i];
                if (count >= m) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        
        int n = stalls.length;
        int low = 1; // Minimum possible distance
        int high = stalls[n - 1] - stalls[0]; // Maximum possible distance
        int maxMinDist = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (check(mid, stalls, k, n)) {
                maxMinDist = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return maxMinDist;
    }
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        int k = 3;
        
        int result = aggressiveCows(stalls, k);
        System.out.println("Maximum minimum distance: " + result);
    }
}
