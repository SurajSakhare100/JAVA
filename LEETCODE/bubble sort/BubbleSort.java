public class BubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int j = 0; j <n; j++) {
			System.out.print(arr[j]+" ");
		}

    }
    public static void main(String[] args) {
        int [] arr={64,25,12,22,11};
        int n=arr.length;
        bubbleSort(arr, n);
    }
}
