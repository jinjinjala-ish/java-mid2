package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("야옹", 100);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제 1: 개 병원에 고양이 전달
        dogHospital.set(cat);  // 매개변수 체크 실패: 컴파일 오류 발생하지 않음. (Dog에 Cat이 들어감) - 타입 안전성 x

        //문제 2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멈멈", 200)); //다운 캐스팅 필요
        System.out.println("biggerDog = " + biggerDog);

    }
}
