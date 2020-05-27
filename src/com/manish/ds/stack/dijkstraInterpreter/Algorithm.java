package com.manish.ds.stack.dijkstraInterpreter;


import java.util.Stack;

public class Algorithm {

    private Stack<String> operationStack = new Stack<>();
    private Stack<Integer> valueStack = new Stack<>();

    public void interpretExpression(String expression) {

        String[] exp = expression.split(" ");

        for (String s : exp) {

            if (s.equals("(")) {
                //do nothing
            } else if (s.equals("+")) {
                operationStack.push(s);
            } else if (s.equals("*")) {
                operationStack.push(s);
            } else if (s.equals(")")) {
                String opration = operationStack.pop();
                if (opration.equals("+")) {
                    valueStack.push(valueStack.pop() + valueStack.pop());
                } else if (opration.equals("*")) {
                    valueStack.push(valueStack.pop() * valueStack.pop());
                }
            } else {
                valueStack.push(Integer.parseInt(s));
            }

        }
    }

    public void result() {
        System.out.println(this.valueStack.pop());
    }
}


