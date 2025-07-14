package generic.ex5;

import generic.animal.Animal;
import generic.animal.Dog;
import generic.animal.Cat;

public class WildCardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCarEx.printGenericV1(dogBox);
        WildCarEx.printWildcardV1(dogBox);

        WildCarEx.printGenericV2(dogBox);
        WildCarEx.printWildCardV2(dogBox);

        Dog dog = WildCarEx.printAndReturnGeneric(dogBox);
        Animal dogWildcard = WildCarEx.printAndReturnWildcard(dogBox);

    }
}
