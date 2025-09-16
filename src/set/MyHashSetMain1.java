package set;

public class MyHashSetMain1 {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("set");
        set.add("B");
        set.add("SET");
        System.out.println(set);

        System.out.println("B".hashCode());
        System.out.println("SET".hashCode());
        System.out.println("set".hashCode());


        //검색
        String searchValue = "s";
        boolean result = set.contains(searchValue);
        System.out.println(result);
    }
}
