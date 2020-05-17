package com.manish.ds.stack.stackWithArrays;

public class App {

    public static void main(String[] args) {

        Stack<Integer> stack1 = new Stack<>();

        stack1.push(12);
        stack1.push(90);
        stack1.push(13);
        stack1.push(73);

        System.out.println("Stack size is "+stack1.size());
        System.out.println(stack1.pop()+" is popped and now size is "+stack1.size());
        System.out.println(stack1.pop()+" is popped and now size is "+stack1.size());
        System.out.println(stack1.pop()+" is popped and now size is "+stack1.size());
        System.out.println(stack1.pop()+" is popped and now size is "+stack1.size());
        System.out.println("Is Empty yet? "+stack1.isEmpty());
    }
}
