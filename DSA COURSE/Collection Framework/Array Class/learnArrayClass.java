import java.util.Arrays;

public class learnArrayClass {
    public static void main(String[] args) {
        int  [] arr={1,2,4,5,6};
        System.out.println(Arrays.binarySearch(arr,4));
        int [] newarr ={4,5,1,3,6};
        Arrays.sort(newarr);
        for (int i : newarr) {
            System.out.print(i+ " ");
        }
        System.out.println("");
        Arrays.fill( newarr,23);
        for (int i : newarr) {
            System.out.print(i+ " ");
        }
    }
}
