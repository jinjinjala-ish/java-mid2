package collection.array;

import java.util.Arrays;

public class MyArrayList3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object value) {
        elementData[size] = value;
        size++;
    }

    public void add(int index, Object value) {
        if (size == elementData.length) {
            grow();
        }

        //코드 추가
        //데이터 이동
        shiftRightFrom(index); //인덱스로부터 다 오른쪽으로 이동
        elementData[index] = value;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }


    void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
      /*  //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
        Object[] newArr = new Object[newCapacity];
        for (int i = 0; i < elementData.length; i++) {
            newArr[i] = elementData[i];
        }
        elementData = newArr; //참조 변경 (Object elementData = new elementData[newCapacity])*/

   /*     Object[] newArr = Arrays.copyOf(elementData, newCapacity);  //newCapacity크기를 가진 배열을 만들고, 거기에 elementData값들을 넣은 게 newArr 배열
        elementData = newArr;*/

        elementData = Arrays.copyOf(elementData, newCapacity);

    }

    public int size() {
        return size;
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object value) {
        Object oldValue = get(index);
        elementData[index] = value;
        return oldValue;
    }

    //코드 추가
    public Object remove(int index) {
        Object oldValue = get(index);
        shiftLeftFrom(index);
        size--;
        elementData[size] = null;
        return oldValue;
    }

    //코드추가
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i+1] = elementData[i];
        }
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size = " + size + ", capacity = " + elementData.length;
    }
}
