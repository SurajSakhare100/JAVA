public class Peak {
    public static int peak(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (arr[mid] < arr[mid+1]) {
                left = mid+1;
            }
            else {
                right = mid;
            }
            mid= left + (right - left) / 2;;
        }

        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2,11, 9, 6, 3, 2,1 };
        int result = peak(arr);
        System.out.println(result);
    }
}
