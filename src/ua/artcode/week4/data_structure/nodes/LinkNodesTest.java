package ua.artcode.week4.data_structure.nodes;

import ua.artcode.week4.data_structure.dunamic.Node;
import ua.artcode.week4.utils.ITimeAction;
import ua.artcode.week4.utils.TimeCounter;

public class LinkNodesTest {
    public static void main(String[] args) {
        test1();

        test2();

        test3();

        test4();

        Node head = createChain(1000);

        long time1 = TimeCounter.count(() -> System.out.println(toStringR(head)));
        System.out.println(time1);

        long time2 = TimeCounter.count(() -> System.out.println(toString1(head)));
        System.out.println(time2);
        //  System.out.println(toString1(head));
        // System.out.println(toStringR(head));

    }

    public static String toString1(Node head){

        StringBuilder res = new StringBuilder();
        Node iter = head;

        while (iter != null) {
            res.append(iter.val).append("->");
            iter = iter.next;
        }
        return res.toString();
    }

    public static String toStringR(Node head){
        return head != null ?
                (head.val.toString() + "->" + toStringR(head.next)): "";
    }


    private static Node createChain(int size) {
        Node head = new Node(0, null);
        Node last = head;

        for (int i = 1; i < size; i++) {
            last.next = new Node(i, null);
            last = last.next;
        }
        return head;
    }

    private static void test4() {
        Node head = new Node(1, null);
        Node last = head;

        for (int i = 0; i < 10; i++) {
            last = new Node(i, last);
        }
    }

    private static void test3() {
        Node head = new Node(1, null);

        for (int i = 0; i < 10; i++) {
            head = new Node(i, head);
        }
    }

    private static void test2() {
        Node head = new Node(1, null);

        Node second = new Node(2, head);
        Node third = new Node(3, second);

        head = null;
        second = null;
    }

    private static void test1() {
        Node head = new Node(1, null);

        Node second = new Node(2, head);
        Node third = new Node(3, second);
    }
}
