package generic.ex3;

import generic.animal.Dog;
import generic.animal.Cat;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("냐옹", 100);


        //개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제 1: 개 병원에 고양이 전달
        //dogHospital.set(cat);  //타입 안전성 x

        //문제 2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멈멈", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
