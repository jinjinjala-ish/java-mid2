package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {

        Node node1 = new Node("A");
        node1.next = new Node("B");
        node1.next.next = new Node("C");

        System.out.println("모든 노드 탐색하기");
        System.out.println("1 = " + node1.item);
        System.out.println("2 = " + node1.next.item);
        System.out.println("3 = " + node1.next.next.item);

        Node x = node1;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
