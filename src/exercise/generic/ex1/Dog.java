package exercise.generic.ex1;

public class Dog extends Animal{

    public Dog(String name, int size) {
        super(name, size);
    }

    @Override
    public void sound() {
        System.out.println("mung mung");
    }
}
