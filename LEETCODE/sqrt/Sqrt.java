public class Sqrt {
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        long ans = -1;  // Use long to handle overflow for larger values of x
        while (left <= right) {
            long mid = left + (right - left) / 2;  // Mid should be long
            long square = mid * mid;  // Square should be long to prevent overflow
            if (square == x) {
                return (int) mid;  // Target found, return the square root
            } else if (square < x) {
                ans = mid;  // Update the answer
                left = (int) mid + 1;  // Move to the right half
            } else {
                right = (int) mid - 1;  // Move to the left half
            }
        }
        return (int) ans;  // Return the integer part of the square root
    } 
    public static float prec(int n,int p,int temp){
        float factor=1;
        float ans=temp;
        for (int i = 0; i < p; i++) {
            factor=factor/10;
            for (float j = ans; j*j < n; j+=factor) {
                ans=j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=11;
        int temp=mySqrt(n);
        
        System.out.println(prec(n,2,temp));
    }
}
    

