package ua.artcode.week5.queue;

import java.util.Iterator;

public class ArrayQueue<T> implements IQueue<T> {


    private T[] mas = (T[]) new Object[10];

    private int head;
    private int tail;
    private int size;

    @Override
    public void enqueue(T obj) {
        if (size > mas.length){
            System.err.println("Error");
            return;
        }
        mas[tail++] = obj;
        size++;
    }

    @Override
    public T dequeue() {
        if (size == 0){
            System.err.println("Queue is empty");
        }
        T ret = mas[head++];
        size--;
        return ret;
    }


    @Override
    public Iterator<T> iterator() {
        return new MyArrayQueueIterator();
    }

    private class MyArrayQueueIterator implements Iterator<T>{

        int curr = head;

        @Override
        public boolean hasNext() {
            return curr < tail;
        }

        @Override
        public T next() {
            T ret = mas[curr++];
            return ret;
        }
    }
}
