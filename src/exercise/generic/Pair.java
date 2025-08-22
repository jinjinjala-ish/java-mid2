package exercise.generic;

public class Pair<T, V> {

    private T value1;
    private V value2;

    public void setFirst(T value1) {
        this.value1 = value1;
    }

    public void setSecond(V value2) {
        this.value2 = value2;
    }

    public T getFirst() {
        return value1;
    }

    public V getSecond() {
        return value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
