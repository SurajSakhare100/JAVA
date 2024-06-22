import java.util.ArrayList;

public class Book {
    public static boolean check(int mid, ArrayList<Integer> list, int m,int q) {
        int i = 0;
        int stdCount = 1;
        int pageCount = 0;
        while (i<q) {
            if (mid >= (list.get(i) + pageCount)) {
                pageCount += list.get(i);
            } else {
                stdCount++;
                if(stdCount>m || (list.get(i) >mid)){
                    return false;
                }
                pageCount = list.get(i) ;
            }
            i++;
        }
        return true;
    }
    public static int findPages(ArrayList<Integer> list, int n, int m) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        int low = 0;
        int high = sum;
        int mid = low + (high - low) / 2;
        int ans = -1;
        if(m>n){
            return ans;
        }
        while (low < high) {
            if (check(mid, list, m,n)) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
            mid = low + (high - low) / 2;
        }
       return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> pages = new ArrayList<>();
        pages.add(12);
        pages.add(34);
        pages.add(67);
        pages.add(90);
        int student = 2;
        int books = 4;
        int ans = findPages(pages, student, books);
        System.out.println(ans);
    }
}
