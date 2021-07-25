package stack;

import stack.exception.StackUnderflowException;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack<T> {

    private int maxSize;
    private T[] array;
    private int top;

    public Stack(Class<T> clazz, int size) {
        this.maxSize = size;
        this.array = (T[])Array.newInstance(clazz, size);
        this.top = -1;
    }

    public void push(T item) {
        if(this.isFull())
        {
            resize(this.array);
        }
        this.array[++top] = item;

    }

    private void resize(T[] array) {
        int newlength = array.length *2;
        this.array = Arrays.copyOf(array, newlength);
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for(int i=top;i>-1;i--)
        {
            sb.append(array[i]);
            if(i>0)
                sb.append(" ");
        }
        return sb.toString();
    }

    public T pop() {
        if(this.isEmpty())
            throw new StackUnderflowException("Stack underflow");
        return array[top--];
    }

    public T peak() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (maxSize-1 == top);
    }
}
