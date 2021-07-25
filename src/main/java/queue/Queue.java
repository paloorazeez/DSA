package queue;

import queue.exception.QueueUnderflowException;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Queue <T> {
    private int maxsize;

    private T[] array;

    private int front;

    private int rear;

    public Queue(Class clazz, int size) {

        this.maxsize = size;
        this.array = (T[])Array.newInstance(clazz,size);
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(T item) {

            if(isFull())
                resize(this.array);
            this.array[++rear]=item;


    }

    public T dequeue() {

        if(front == maxsize-1)
        {
            front = 0;
            rear = -1;
            throw new QueueUnderflowException("queue underflow");
        }

        return this.array[front++];
    }

    public boolean isEmpty() {
        return (front == -1);
    }

    public boolean isFull() {
        return (maxsize-1 == rear);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for(int i = front; i<= rear; i++)
        {
            sb.append(this.array[i]);
            if(i != rear)
                sb.append(" ");
        }
        return sb.toString();
    }

    private void resize(T[] array) {
        int newlength = array.length *2;
        this.array = Arrays.copyOf(array, newlength);
    }
}
