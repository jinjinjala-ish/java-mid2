package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox intgerBox = new ObjectBox();
        intgerBox.set(10);
        Integer integer = (Integer) intgerBox.get(); //다운캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); //다운캐스팅
        System.out.println("str = " + str);
    }
}
