package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T z) {
        System.out.println("animal.classname: " + animal.getClass());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }
}
