package question.set;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,2,3,4,5));
        Set<Integer> set2 = new HashSet<>(List.of(3,4,5,6,7));


        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합: " + union);

        Set<Integer> interSection = new HashSet<>(set1);
        interSection.retainAll(set2);
        System.out.println("교집합: " + interSection);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("차집합: " + difference);
    }
}
