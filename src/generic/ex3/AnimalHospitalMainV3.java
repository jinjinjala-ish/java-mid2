package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
        //AnimalHospitalV3<Integer> catHospital = new AnimalHospitalV3<>(); //타입제한

        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("야옹", 100);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제 1: 개 병원에 고양이 전달
        //dogHospital.set(cat);  // 매개변수 체크 실패: 컴파일 오류 발생하지 않음. (Dog에 Cat이 들어감) - 타입 안전성 x

        //문제 2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = /*(Dog)*/dogHospital.bigger(new Dog("멈멈", 200)); //다운 캐스팅 필요 없음
        System.out.println("biggerDog = " + biggerDog);

    }
}
