package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T타입 결정
        integerBox.set(10);
        //integerBox.set("문자");  //Integer 타입만 허용, 컴파일 오류

        Integer integer = integerBox.get(); //Integer 타입 반환(캐스팅 필요 없음)

        GenericBox<String> stringBox = new GenericBox<String>();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("integer = " + integer);
        System.out.println("str = " + str);

        //타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Integer> integerBox2 = new GenericBox<>();
    }
}


