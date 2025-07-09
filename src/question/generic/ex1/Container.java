package question.generic.ex1;

public class Container<T> {

    private T value;


    public boolean isEmpty() {
      return value == null;
    }

    public void setItem(T value) {
        this.value = value;
    }

    public T getItem() {
        return value;
    }


}
