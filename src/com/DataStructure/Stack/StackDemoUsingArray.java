package com.DataStructure.Stack;

import java.util.Scanner;

class Stack {
    private final int size;
    private final int[] stackArray;
    private int top;//top of stack

    public Stack(int size) {
        this.size = size;
        stackArray = new int[size]; //Stack Array creation
        top = -1; //Initialize stack with -1
    }

    /**
     * @return true if stack is empty
     */
    boolean isEmpty() {
        return top == -1;
    }

    /**
     * @return true if stack is full
     */
    boolean isFull() {
        return top == size - 1;
    }

    /**
     * @param value Push item into stack, it will put item on the top of stack
     */
    void push(int value) {
        if (isFull())
            throw new StackFullException("Stack is full");

        stackArray[++top] = value;
    }

    /**
     * @return pop stack value
     * Pop item form stack, it will pop item form the top of stack
     */

    int pop() {
        if (isEmpty())
            throw new StackEmptyException("Stack is empty");
        return stackArray[top--];
    }

    /**
     * Display all elements in stack Array
     */
    void display() {
        for (int i = 0; i < top+1; i++) {
            System.out.print(stackArray[i] + "  ");
            System.out.println();
        }
    }

    /**
     *
     * @return Top most item from stack
     */
    int peek() {
        if (top == -1)
            return -1;
        return (stackArray[top]);
    }

}

public class StackDemoUsingArray
{

    public static void main(String[] args) {

        Stack stack = new Stack(10);

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n******** MENU *******");
            System.out.println("\n1.PUSH");
            System.out.println("\n2.POP");
            System.out.println("\n3.DISPLAY");
            System.out.println("\n4.PEEK");
            System.out.println("\n5.IS EMPTY?");
            System.out.println("\n6.IS FULL?");
            System.out.println("\n7.EXIT");
            System.out.println("\nEnter ur choice : ");
            switch (in.nextInt()) {
                case 1:
                    System.out.println("\nEnter the value ");
                    stack.push(in.nextInt());
                    break;
                case 2:
                    System.out.println("\nPopped element : " + stack.pop());
                    break;

                case 3:
                    System.out.println("\nStack Elements : " );
                    stack.display();
                    break;
                case 4:
                    System.out.println("\nTop element of stack: " + stack.peek());
                    break;
                case 5:
                    System.out.println("\nIs empty? : " + stack.isEmpty());
                    break;
                case 6:
                    System.out.println("\nIs full? : " + stack.isFull());
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOOPS..Wrong Choice!");
                    break;
            }
            System.out.println("\nDo you want to continue(y/Y)... ");
        } while (in.next().charAt(0) =='y' || in.next().charAt(0) =='Y');

    }
}

