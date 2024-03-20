package W3;
import W3.LinkedList.Node;
public class p1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node8 = new Node<>(8);
        Node<Integer> node9 = new Node<>(9);


        Node<Integer> head = node1;

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        int count = 1;

        System.out.println("Before removing loop: ");
        while(head != null && count < 13){
            System.out.println(head.data.toString());
            head = head.next;
            count++;
        }



        System.out.println("After removing loop: ");   
        if(list.hasLoop(node1)){
            head = node1;
            while(head != null){
                System.out.println(head.data.toString());
                head = head.next;
            }
        }
    }
}
