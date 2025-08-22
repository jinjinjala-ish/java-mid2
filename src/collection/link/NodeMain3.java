package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node1 first = new Node1("A");
        first.next = new Node1("B");
        first.next.next = new Node1("C");

        System.out.println(first);

        System.out.println("모든 노드 탐색하기");
        printAll(first);

        System.out.println("마지막 노드 조회하기");
        Node1 last = getLastNode(first);
        System.out.println(last);

        System.out.println("특정 인덱스의 노드 조회하기");
        int index = 2;
        Node1 indexOf = getNode(first, 2);
        System.out.println(indexOf);

        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
        add(first, "F");
        System.out.println(first);
    }

    private static void printAll(Node1 node) {
        Node1 x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node1 getLastNode(Node1 node) {
        Node1 x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node1 getNode(Node1 node, int index) {
        Node1 x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node1 node, String param) {
     /*   Node1 x = node;
        while (x.next != null) {
            x = x.next;
        }
        x.next = new Node1(param);*/
        Node1 lastNode = getLastNode(node);
        lastNode.next = new Node1(param);
    }
}
