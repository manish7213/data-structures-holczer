package com.manish.ds.stackAndQueuesProblems;


import java.util.Stack;

public class QueueUsingStackRecursive {

    private Stack<Integer> stack = new Stack<>();

    public void enque(int item) {

        stack.push(item);
    }

    public int deque() {

        if (stack.size() == 1) {
            return stack.pop();
        }

        int item = stack.pop();
        int dequedElement = deque();
        enque(item);
        return dequedElement;
    }
}

class QueueUsingStackRecursiveTest {

    public static void main(String[] args) {
        QueueUsingStackRecursive queue = new QueueUsingStackRecursive();
        queue.enque(10);
        queue.enque(40);
        queue.enque(70);
        queue.enque(100);

        System.out.println("Popped element is : " + queue.deque());
        System.out.println("Popped element is : " + queue.deque());
        System.out.println("Popped element is : " + queue.deque());
        System.out.println("Popped element is : " + queue.deque());
    }


}




