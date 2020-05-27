package com.manish.ds.stackAndQueuesProblems;


import java.util.Stack;

public class MaxInStack {


    private int findMaxIfStackIsGiven(Stack<Integer> mainStack) {

        Stack<Integer> maxStack = new Stack<>();

        if (maxStack.isEmpty()) {
            maxStack.push(mainStack.peek());
        }
        while (!mainStack.isEmpty()) {
            if (mainStack.peek() > maxStack.peek()) {
                maxStack.push(mainStack.pop());
            } else if (mainStack.peek() <= maxStack.peek()) {
                maxStack.push(maxStack.peek());
                mainStack.pop();
            }
        }

        return maxStack.pop();
    }

    public static void main(String[] args) {

        MaxInStack maxInStack = new MaxInStack();

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(18);
        stack.push(9);
        stack.push(8);
        stack.push(29);

        System.out.println(maxInStack.findMaxIfStackIsGiven(stack));


    }


}
