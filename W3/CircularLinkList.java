package W3;

public class CircularLinkList<T> {
    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private int size;
    private Node<T> pointer;
    private Node<T> head;
    private Node<T> tail;

    public CircularLinkList() {
        size = 0;
        head = null;
        pointer = null;
    }

    public T josephus(int k) {
        if (size == 0) {
            return null;
        }

        Node<T> current = head;
        Node<T> previous = tail;

        while (size > 1) {
            for (int i = 0; i < k; i++) {
                previous = current;
                current = current.next;
            }
        }
        return head.data;
    }
}
