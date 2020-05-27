package com.manish.ds.queue;

public class App {

    public static void main(String[] args) {

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(13);

        System.out.println("Size of queue is "+queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }
}
