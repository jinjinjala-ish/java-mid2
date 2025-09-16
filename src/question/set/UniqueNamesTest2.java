package question.set;

import java.util.*;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

       /*
        List<Integer> list = List.of(inputArr);
        Set<Integer> set = new LinkedHashSet<>(list);
        */
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer s : set) {
            System.out.println(s);
        }

    }
}
