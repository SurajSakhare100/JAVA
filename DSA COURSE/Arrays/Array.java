import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] arr1=new int[5];
        // int[] arr2={2,3,4,5,9};
        // int[] arr=Arrays.copyOf(arr2,arr2.length);
        // System.out.println(Arrays.toString(arr));
      
        // for (int i : arr1) 
        //     System.out.print(i+" ");
        
        // for (int i : arr2) 
        //     System.out.print(i+" ");
        
        // String[] str1=new String[5];
        // String[] str2={"l","k","d","hello"};
        // for (String string : str1) {
        //     System.out.print(string+" ");
        // }
        // str2[3]=null;
        // for (String string : str2) {
        //     System.out.print(string+" ");
        // }
        // System.out.println(Arrays.toString(arr2));
        // for (int i : arr2) {
        //     System.out.print(i+" ");
        // }
        Scanner in =new Scanner(System.in);
        // String[] str3 =new String[4];
        // for (int i=0;i<str3.length;i++ ) {
        //     str3[i]=in.next();
        // }
        // System.out.println(Arrays.toString(str3));
        // int[][] arrMatrix=new int[3][4];
        // System.out.println(arrMatrix.length);
        // for (int rows = 0; rows < 3; rows++) {
        //     for (int col = 0; col< 3; col++) {
        //         arrMatrix[rows][col]=in.nextInt();
        //     }
        // }for (int i = 0; i < 3; i++) {
            
        //     System.out.println(Arrays.toString(arrMatrix[i]));
        // }
        // for (int[] is : arrMatrix) {
        //     System.out.println(Arrays.toString(is));
        // }

        int[] newarr={1,2,3,4,5,6,7};
        int start=0,end=newarr.length-1;
        while(start<end){
            swap(newarr,start,end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(newarr));

    }

    static void swap(int[] index,int start,int end){
        int temp=index[start];
        index[start]=index[end];
        index[end]=temp;

    }
}
