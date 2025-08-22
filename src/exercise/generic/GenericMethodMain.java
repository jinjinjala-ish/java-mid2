package exercise.generic;

public class GenericMethodMain {
    GenericMethod genericMethod = new GenericMethod();

    Integer result = GenericMethod.<Integer>genericMethod(10);

    String string = GenericMethod.<String>genericMethod("hello");

}
