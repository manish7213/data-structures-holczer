package com.manish.ds.stack.dijkstraInterpreter;

public class App {

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        String exp = "( ( 1 + 2 ) * ( 2 + 1 ) )";
        algorithm.interpretExpression(exp);
        algorithm.result();
    }

}
