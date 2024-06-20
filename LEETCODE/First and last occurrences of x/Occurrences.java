import java.util.ArrayList;

public class Occurrences {
    ArrayList<Integer> find(int arr[], int n, int x) {
        int left = 0;
        int right = n - 1;
        int num1 = -1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                right = mid - 1;
                num1 = mid;
            } else if (arr[mid] < x) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        left = 0;
        right = n - 1;
        int num2 = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                left = mid + 1;
                num2 = mid;
            } else if (arr[mid] < x) {
                left = mid + 1; // Search the right half
            } else {
                right = mid - 1; // Search the left half
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);
        return list;

    }

//another approach with two pointers

// ArrayList<Integer> find(int arr[], int n, int x)
// {
//     ArrayList<Integer> list = new ArrayList<>();
//     int left = 0, right = n-1;
//     list.add(-1);
//     list.add(-1);
         
//     while(left <= right) {
//         if(arr[left] == x && arr[right] == x) {
//             list.add(0,left);
//             list.add(1,right);
//             break;
//         }
//         if(arr[left] != x ) left++;
        
//         if(arr[right] != x ) right--;
//      }
//     return list;
// }
}
