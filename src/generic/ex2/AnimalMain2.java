package generic.ex2;

import generic.animal.Animal;
import generic.animal.Dog;
import generic.animal.Cat;
import generic.ex1.GenericBox;

public class AnimalMain2 {
    public static void main(String[] args) {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멈멈", 100);
        Cat cat = new Cat("냐옹", 100);

        GenericBox<Animal> animalBox = new GenericBox<>();
        animalBox.set(dog);
        Animal animalDog = animalBox.get();
        System.out.println("Dog = " + animalDog);

        animalBox.set(cat);
        Animal animalCat = animalBox.get();
        System.out.println("Cat = " + animalCat);
    }
}
