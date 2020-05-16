package com.manish.ds.stack;

public class Stack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void push(T newData) {
        this.count++;

        if (root == null) {
            root = new Node<>(newData);
        } else {
            Node<T> oldRoot = root;
            this.root = new Node<>(newData);
            root.setNextNode(oldRoot);
        }
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public T pop() {

        T itemToPop = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;

        return itemToPop;
    }

    public T peek() {

        return this.root.getData();
    }
}
