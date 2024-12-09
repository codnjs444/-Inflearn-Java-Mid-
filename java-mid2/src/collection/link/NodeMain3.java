package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        System.out.println("모든 노드 탐색");
        printAll(first);

        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        int index = 0;
        Node indexNode = getNode(first, index);
        System.out.println("indexNode = " + indexNode);

        System.out.println("데이터 추가하기");
        add(first, "D");
        add(first, "E");
        add(first, "F");
        System.out.println(first);
    }


    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }


    private static Node getNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String parameter) {
        Node lastNode = getLastNode(node);
        lastNode.next = new Node(parameter);
    }
}
