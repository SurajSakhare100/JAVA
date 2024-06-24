public class Insertion {
    public static void insertion(int[] arr,int n){
        for (int i = 1; i < n; i++) {
            int temp=arr[i];
            int j = i-1;
            for ( ;j >=0; j--) {
                if(temp<arr[j]){
                    arr[j+1]=arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1]=temp;
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
 
    }
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        int n=arr.length;
        insertion(arr,n);
    }
}

