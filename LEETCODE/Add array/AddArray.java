import java.util.ArrayList;

public class AddArray {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        int carry = 0;
        for (int i = n-1; i >=0; i--) {
            if (carry == 1) {
                sum = a[i] + b[i] + 1;
                carry=0;
            } else {
                sum = a[i] + b[i];
            }
            carry = sum / 10;
            sum = sum % 10;
            arr.add(sum);
        }
        // int[] ans=new int[arr.size()];
        int[] ans=new int[3];

        int k=arr.size()-1;

        // for(int i:arr){
        //     ans[k--]=i;
        // }
        for (int i : arr) {
            System.out.println(arr.get(i));
        }
        // for (int i : ans) {
        //     System.out.println(ans[i]);
        // }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 3, 3, 9 };
        int[] arr2 = {  1,2, 3 };
        findArraySum(arr1, arr1.length, arr2, arr2.length);
    }
}
