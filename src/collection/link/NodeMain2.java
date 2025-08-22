package collection.link;

public class NodeMain2 {
    public static void main(String[] args) {
        Node1 first = new Node1("A");
        first.next = new Node1("B");
        first.next.next = new Node1("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);
    }
}
