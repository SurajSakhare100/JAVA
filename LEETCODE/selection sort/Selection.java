public class Selection {
    public static void selectionSort(int arr[], int n) {
		int temp=0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
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
		int m=5;
		int[] nums1Copy = new int[m];
		System.arraycopy(arr, 0, nums1Copy, 0,m);
        // selectionSort(arr,n);
		for (int i : nums1Copy) {
			System.out.println(i);
		}
    }
}
