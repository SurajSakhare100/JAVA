public class Zeros {
    public static void moveZeroes(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
           for (int j = 0; j < arr.length-1; j++) {
            int temp=-1;
            if(arr[j]==0){
                temp=arr[j+1];
                arr[j+1]=arr[j];
                arr[j]=temp;
            }
           }
        }
    }
    public static void main(String[] args) {
        int [] arr ={0,1,0,3,12};
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i+ " ");
        }
    }
}
