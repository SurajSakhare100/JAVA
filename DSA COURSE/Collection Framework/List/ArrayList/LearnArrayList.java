import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(2);
        // list.add(5);
        // list.add(1);
        // list.add(2,"lol");
        // newList.add("pune");
        // newList.add("pimpri");
        // list.addAll(3,newList);
        // // System.out.println(list.get(0));
        // list.remove(3);
        // list.remove(String.valueOf("pune"));
        // list.set(0, "jadu");
        // System.out.println(list);
        // System.out.println( list.contains("lol"));

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        // for (String string : list) {
        // System.out.println(string);
        // }
        // Iterator<String> it=list.iterator();

        // while (it.hasNext()) {
        // System.out.print(it.next()+" ");
        // }
        // list.clear();
        // System.out.println(list);
             
        list.add(17);
        list.add(20);
        list.add(11);
        list.add(9);
        list.add(12);
        list.add(6);
        ArrayList<Integer> list2 = new ArrayList<>(list);
        list2.sort(null);
        System.out.println(list);
        System.out.println(list2);
        // for (int i = 3; i >=0; i--) {
        //     if (list2.get(i) < list2.get(3 - i) && list.indexOf(list2.get(3 - i)) > list.indexOf(list2.get(i))) {
        //         System.out.println(list2.get(i));
        //     }

        // }
        int n=list.size();
        int low=list2.get(0);
        for (int i = 0; i < n; i++) {
            if(low<list2.get(n-i-1) && list.indexOf(list2.get(n-i-1)) > list.indexOf(low)){
                System.out.println(list2.get(n-i-1)-low);
            }
        }
    }
}
