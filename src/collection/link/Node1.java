package collection.link;

public class Node1 {

    Object item;
    Node1 next;

    public Node1(Object item)
    {
        this.item = item;
    }

    //IDE 생성 toString
 /*   @Override
    public String toString() {
        return "Node1{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();  //루프에서 문자를 더할 때 StringBuilder사용
        Node1 x = this;
        sb.append("[");
        while (x != null) {
            sb.append(x.item);
            if (x.next != null) {
                sb.append("->");
            }
            x = x.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
