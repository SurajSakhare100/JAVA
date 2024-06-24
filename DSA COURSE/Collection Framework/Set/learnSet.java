import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class learnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // time complexity is O(1)
        Set<Integer> linkedSet = new LinkedHashSet<>();
        // time complexity is O(1)
        Set<Integer> treeSet = new TreeSet<>();
        // time complexity is O(logn)
        // set.add(34);
        // set.add(67);
        // set.add(21);
        // set.add(98);
        // set.add(98);
        // set.add(45);
        // System.out.println(set);
        // set.remove(21);
        // System.out.println(set);
        // System.out.println(set.contains(98));
        // System.out.println(set.size());
        // set.clear();
        // System.out.println(set);

        // linkedHashSet is ==linkedlist + set
        // add in continuos manner and no duplicate allows

        // linkedSet.add(34);
        // linkedSet.add(67);
        // linkedSet.add(21);
        // linkedSet.add(98);
        // linkedSet.add(98);
        // linkedSet.add(45);
        // System.out.println(linkedSet);

        // treeSet is == tree + set
        // array is in sorted manner and no duplicate allows
        // use binarysearch tree
        treeSet.add(34);
        treeSet.add(67);
        treeSet.add(21);
        treeSet.add(98);
        treeSet.add(98);
        treeSet.add(45);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }

}