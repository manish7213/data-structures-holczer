package com.manish.ds.BST;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data) {

        if (root == null) {
            root = new Node<T>(data);
        } else insertNode(data, root);
    }

    @Override
    public T getMinValue() {

        if(root == null)  return null;

        else {
            return getMin(root);
        }
    }
@Override
    public T getMaxValue() {

        if(root == null)  return null;

        else {
            return getMax(root);
        }
    }


    private void insertNode(T newData, Node<T> node) {

        if (newData.compareTo(node.getData()) < 0) {

            if (node.getLeftChild() != null) {
                insertNode(newData,node.getLeftChild());
            } else {
                Node<T> node1 = new Node<>(newData);
                node.setLeftChild(node1);
            }
        } else  {

            if (node.getRightChild() != null) {
                insertNode(newData,node.getRightChild());
            } else {
                Node<T> node2 = new Node<>(newData);
                node.setRightChild(node2);
            }
        }
    }

    @Override
    public void traverse() {

    }

    @Override
    public void delete(T data) {

    }


    private T getMax(Node<T> node) {

        if (node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }

        return node.getData();
    }


    private T getMin(Node<T> node) {
        if (node.getLeftChild() != null) {

            return getMin(node.getLeftChild());
        }
        return node.getData();
    }


}
