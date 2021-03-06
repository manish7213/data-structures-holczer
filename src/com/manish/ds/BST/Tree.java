package com.manish.ds.BST;

public interface Tree<T> {

    public void insert(T data);
    public void traverse(String type);
    public void delete(T data);
    public T getMaxValue();
    public T getMinValue();
}
