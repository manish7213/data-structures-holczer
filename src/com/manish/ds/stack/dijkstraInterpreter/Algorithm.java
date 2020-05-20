package com.manish.ds.stack.dijkstraInterpreter;

import java.util.Stack;

public class Algorithm {

    private Stack<String> operationStack = new Stack<>();
    private Stack<Double> valueStack = new Stack<>();

    public void interpretExpression(String expression) {

        String[] expressionArray = expression.split(" ");

        for (String s : expressionArray) {
            if (s.equals("(")) {
                //do nothing
            } else if (s.equals("*")) {
                this.operationStack.push(s);
            } else if (s.equals("+")) {
                this.operationStack.push(s);
            } else if (s.equals(")")) {
                String operation = this.operationStack.pop();

                if (operation.equals("+")) {
                    this.valueStack.push(this.valueStack.pop() + this.valueStack.pop());
                } else if (operation.equals("*")) {
                    this.valueStack.push(this.valueStack.pop() * this.valueStack.pop());
                }
            } else {
                this.valueStack.push(Double.valueOf(s));
            }
        }
    }

    public void result() {
        System.out.println(this.valueStack.pop());
    }
}
