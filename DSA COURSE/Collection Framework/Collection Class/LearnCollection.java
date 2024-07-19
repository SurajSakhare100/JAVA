import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        System.out.println(list.size());
        list.add(4);
        list.add(14);
        list.add(23);
        list.add(89);
        list.add(89);
        System.out.println(list);

        System.out.println("min element is " + Collections.min(list));
        System.out.println("min element is " + Collections.max(list));
        System.out.println("min element is " + Collections.frequency(list, 89));
        Collections.reverse(list);
        System.out.println(list);
    }
}
