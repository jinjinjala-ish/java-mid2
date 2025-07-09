package generic.ex4;

import generic.animal.Dog;
import generic.animal.Cat;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍", 100);
        Cat cat = new Cat("냐옹", 100);

        AnimalMethod.<Dog>checkup(dog);
        AnimalMethod.<Cat>checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger) ;
    }
}
