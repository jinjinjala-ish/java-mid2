package question.generic.ex2;

public class Pair<I, S> {

    private I value1;
    private S value2;

    public void setFirst(I value1) {
        this.value1 = value1;
    }

    public I getFirst() {
        return value1;
    }

    public void setSecond(S value2) {
        this.value2 = value2;
    }

    public S getSecond() {
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
