package com.java.lambdaexpression;

public class LambdaExpression {

    public static void main(String[] args) {
        Laptop dell = () -> System.out.println("Dell class");
        // dell.view();

        Laptop hp = () -> System.out.println("hp class");
        //hp.view();

        Laptop lenova = () -> System.out.println("lenova class");
        //lenova.view();
        print(dell);
        print(hp);
        print(lenova);
    }

        static  void print(Laptop laptop){
                laptop.view();

        }

    }
