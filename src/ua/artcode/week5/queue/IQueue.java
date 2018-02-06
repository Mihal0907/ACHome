package ua.artcode.week5.queue;

import java.util.Iterator;

public interface IQueue<E> extends Iterable {

    void enqueue (E obj);

    E dequeue();
}
