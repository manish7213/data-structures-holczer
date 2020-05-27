package com.manish.ds.stackAndQueuesProblems;


import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> enqueStack = new Stack<>();
    private Stack<Integer> dequeueStack = new Stack<>();
    private int count;
    public void enque(int item) {

        enqueStack.push(item);
        count++;
    }

    public int deque() {

        if (!dequeueStack.isEmpty()) {
            return dequeueStack.pop();
        } else {

            while (!enqueStack.isEmpty()) {
                dequeueStack.push(enqueStack.pop());
            }
        }

        return dequeueStack.pop();
    }

    public int size(){
        return count;
    }


}

class Test {

    public static void main(String[] args) {

        QueueUsingStack queueUsingStack = new QueueUsingStack();
        System.out.println("Queue size is "+queueUsingStack.size());
        queueUsingStack.enque(10);
        queueUsingStack.enque(20);
        queueUsingStack.enque(30);
        queueUsingStack.enque(40);
        queueUsingStack.enque(50);
        System.out.println("Queue size is "+queueUsingStack.size());
        System.out.println("Popped element is : "+queueUsingStack.deque());
        System.out.println("Popped element is : "+queueUsingStack.deque());
        System.out.println("Popped element is : "+queueUsingStack.deque());
        System.out.println("Popped element is : "+queueUsingStack.deque());
        System.out.println("Popped element is : "+queueUsingStack.deque());


    }
}
