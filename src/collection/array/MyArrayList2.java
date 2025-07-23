package collection.array;

import java.util.Arrays;

public class MyArrayList2 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList2() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public void add(Object value) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = value;
        size++;
    }

    //코드 추가
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
