import java.util.ArrayList;

public class Paint {
    public static boolean isFeasible(ArrayList<Integer> list,int n, int k, int maxTime) {
       
        int total = 0;
        int paintersRequired = 1;

        for (int i = 0; i < n; i++) {
            total += list.get(i);

            if (total > maxTime) {
                total = list.get(i);
                paintersRequired++;

                if (paintersRequired > k) {
                    return false;
                }
            }
        }

        return true;
    }
    
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        int n = boards.size();
        int sum = 0;
        int maxBoardLength = 0;

        // Calculate the sum of all board lengths and find the maximum board length
        for (int board : boards) {
            sum += board;
            maxBoardLength = Math.max(maxBoardLength, board);
        }

        // Initialize binary search bounds
        int low = maxBoardLength;
        int high = sum;
        int result = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(boards, n, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }
}
