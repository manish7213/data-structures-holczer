package com.manish.ds.stack.stackWithArrays;

public class Stack<T> {

    private T[] stack;
    private int numberOfItems;

    public Stack() {
        this.stack = (T[]) new Object[1];
    }

    public void push(T data) {

        if (numberOfItems == this.stack.length){
            resize(2*this.stack.length);
        }

        this.stack[numberOfItems++] = data;
    }

    public T pop() {
        T itemsToPop = this.stack[--numberOfItems];

        if (numberOfItems == 0 && numberOfItems == this.stack.length / 4) {
            resize(this.stack.length / 2);
        }
        return itemsToPop;
    }

    public T peek() {

        return this.stack[numberOfItems-1];
    }
    public boolean isEmpty() {
        return this.numberOfItems == 0;
    }

    public int size() {

        return this.numberOfItems;
    }

    private void resize(int capacity) {
        T[] stackCopy = (T[]) new Object[capacity];
        for (int i = 0 ; i < numberOfItems ; i++) {
            stackCopy[i] = stack[i];
        }

        this.stack = stackCopy;
    }
}
