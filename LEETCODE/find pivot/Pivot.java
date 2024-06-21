public class Pivot {
    public static int pivot(int arr [],int n){
        int low=0,high=n-1;
        int mid=low+(high-low)/2;
        while(low<high){
            if(arr[mid]<arr[0]){
                high=mid;
            }
            else if(arr[mid]>=arr[0]){
                low=mid+1;
            }
            mid=low+(high-low)/2;
        }
        return low;
    }
    public static void main(String[] args) {
        int [] arr={9,10,11,17,1,2};
        int pivot=pivot(arr,arr.length);
        System.out.println(pivot);
    }
}
