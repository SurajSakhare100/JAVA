import java.util.ArrayList;
import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        // String name1 = new String("kunal");
        // String name2 = new String("kunal");
        // String str = "suraj";
        // String a = "d";
        // String c = str;
        // System.out.println(a.toString());
        // System.out.println(str==c);
        // System.out.println(name1==name2);
        // System.out.println(name1.endsWith(name2));
        // System.out.println(name1.charAt(4));
        // float f = 34.329333331f;
        // System.out.printf("f is %.2f",f);
        // System.out.printf("%.3f",Math.PI);
        // System.out.printf("i am %s and i am %s","suraj","cool");
        // System.out.println('a'+'b');
        // System.out.println("a"+"b");
        // System.out.println((char) ('a'+9));
        // System.out.println("kunal"+new Integer(89));
        // System.out.println("kunal"+new ArrayList<>());
        // System.out.println(new ArrayList<>()+"kunal"+89);
        // System.out.println(name1.concat(name2));
        // String alphabet = "";
        // for (int i = 0; i < 26; i++) {
        // char ch = (char) ('a' + i);
        // alphabet += ch +" ";
        // }
        // System.out.println(alphabet);
        // int[] nums={1,2,2,3,4,5,5};
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i+1; j < nums.length; j++) {
        // if(nums[i]==nums[j]){
        // System.out.println(nums[i]);
        // }
        // }
        // }
        String str="Nitifn";
        int n= str.length();
        int count =0;
        for (int i = 0; i < n/2; i++) {
            char start=str.charAt(i);
            char end=str.charAt(n-i-1);
            if(start!=end){
                count++;
            }
        }
        System.out.println(count);
        if(count==1){
            System.out.println(true);
        }
    }
}