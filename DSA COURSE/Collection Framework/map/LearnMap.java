import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
  public static void main(String[] args) {
    Map<Integer,String> names= new HashMap<>() ;
     // time complexity is O(1)
    Map<Integer,String> treeNames= new TreeMap<>() ;
      // time complexity is O(logn)
    //key will be overide
    names.put(1,"rahul");
    names.put(2,"suraj");
    names.put(2,"raj");
    names.putIfAbsent(2,"rajiv");
    names.put(3,"dinu");
    // System.out.println(names.containsKey(3));
    // System.out.println(names);
    // for ( Map.Entry<Integer, String> e: names.entrySet()) {
    //     System.out.println(e);
    //     System.out.println(e.getKey());
    //     System.out.println(e.getValue());
    // }

    // for (Integer key : names.keySet()) {
    //     System.out.println(key);
    // }
    // for (String key : names.values()) {
    //     System.out.println(key);
    // }
    System.out.println(names.isEmpty());


    treeNames.put(1,"rahul");
    treeNames.put(3,"suraj");
    treeNames.put(2,"raj");
    treeNames.putIfAbsent(5,"rajiv");
    treeNames.put(4,"dinu");
    System.out.println(treeNames);
    System.out.println(treeNames.get(3));
  }
}
