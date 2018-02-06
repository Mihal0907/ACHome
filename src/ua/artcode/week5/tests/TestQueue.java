package ua.artcode.week5.tests;

import ua.artcode.week5.queue.ArrayQueue;
import ua.artcode.week5.queue.IQueue;

public class TestQueue {
    public static void main(String[] args) {
        IQueue<Integer> queue = new ArrayQueue<>();


        queue.enqueue(34);
        queue.enqueue(34);
        queue.enqueue(2);

        queue.dequeue();

        for (Object ell : queue) {
            System.out.println(ell);
        }


    }
}
