package com.manish.ds.linkedList;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    Node<T> root = null;
    int size;
    @Override
    public void insert(T data) {
        ++size;
        if (root == null) {
            Node<T> newNode = new Node<>(data);
            this.root = new Node<>(data);
        } else {
            insertDataArBegining(data);
        }
    }

    //O(1)
    private void insertDataArBegining(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    //O(N)
    private void inserDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() == null) {
            inserDataAtEnd(data,node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {
        if (root == null) {
            return;
        }
        --size;
        if (this.root.getData().compareTo(data) == 0) {
            this.root = this.root.getNextNode();
        } else {
            remove(data,root,root.getNextNode());
        }

    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        while (actualNode != null) {
            if (actualNode.getData().compareTo(data) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {
        if (root == null) {
            return;
        }

        Node<T> actualNode = this.root;
        while (actualNode != null) {
            System.out.print(actualNode+" => ");
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Node<T> findMiddleNode() {
         Node<T> slowPtr = this.root;
         Node<T> fastPtr = this.root;

         while (fastPtr.getNextNode() != null && fastPtr.getNextNode().getNextNode() != null ) {
             fastPtr = fastPtr.getNextNode().getNextNode();
             slowPtr = slowPtr.getNextNode();
         }

         return slowPtr;
    }


}
