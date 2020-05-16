package com.manish.ds.stack;

public class App {

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(12);
        stack1.push(13);
        stack1.push(20);

        Integer peek = stack1.peek();
        System.out.println("Top Element is "+peek+" and the size is "+stack1.size());
        Integer pop = stack1.pop();
        System.out.println(pop+" popped");
        int size1 = stack1.size();
        System.out.println("Now the size is "+size1);
        Integer pop1 = stack1.pop();
        System.out.println(pop1+" popped");
        int size2 = stack1.size();
        System.out.println("Now the size is "+size2+" Is stack empty yet? "+stack1.isEmpty());

        int pop2 = stack1.pop();

        System.out.println(pop2+" is popped and now the size is "+stack1.size());

        System.out.println("Is stack empty now ? "+stack1.isEmpty());


    }
}
