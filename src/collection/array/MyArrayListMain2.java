package collection.array;


public class MyArrayListMain2 {
    public static void main(String[] args) {
        MyArrayList2 list = new MyArrayList2();
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        System.out.println(list);
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("==기능사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));
        System.out.println("list.set(2,'z') = " + list.set(2, "z"));
        System.out.println(list);

        System.out.println("==범위초과==");
        list.add("d");
        list.add("e");
        System.out.println(list);
        //범위 초과, capacity가 늘어나지 않으면 예외 발생


        //추가
        list.grow();

        list.add("f");
        System.out.println(list);

    }
}
