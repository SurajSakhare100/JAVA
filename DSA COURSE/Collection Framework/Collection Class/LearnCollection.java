import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        // System.out.println(list.size());
        list.add(8);
        list.add(11);
        list.add(7);
        list.add(15);
        list.add(2);
        // System.out.println(list);

        // System.out.println("min element is " + Collections.min(list));
        // System.out.println("min element is " + Collections.max(list));
        // System.out.println("min element is " + Collections.frequency(list, 89));
        int minimumDiff = Integer.MAX_VALUE;

        Collections.sort(list);
        int n = 5, m = 3;
        for (int i = n - 1; i >= m - 1; i--) {
            System.out.println(i-m+1);
            int diff = list.get(i) - list.get(i - m + 1);
            if (diff < minimumDiff) {
                minimumDiff = diff;
            }
        }
        System.out.println(minimumDiff);

    }
}
