package question.set;

import java.util.*;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        print(hashSet, inputArr);
        print(linkedSet, inputArr);
        print(treeSet, inputArr);

    }

    private static void print(Set set, Object[] inputArr) {
        for (Object a : inputArr) {
            set.add(a);
        }
        System.out.println(set);
    }
}
