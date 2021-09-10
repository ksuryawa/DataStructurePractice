package com.DataStructure.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(6);

        stack.push(17);
        stack.push(20);
        stack.push(15);
        System.out.println("\n*** Stack After Push ***");
        stack.display();
        stack.push(27);
        stack.push(10);
        stack.push(25);

        System.out.println("\n*** Stack After Push ***");
        stack.display();

        System.out.println("\n**************************\n");
        System.out.print("Poped Items :: ");
        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");

        System.out.println("\n\n*** Stack After Pop ***");
        stack.display();

    }
}
