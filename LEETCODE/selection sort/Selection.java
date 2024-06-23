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
        selectionSort(arr,n);
    }
}
