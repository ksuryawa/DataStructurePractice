package com.DataStructure.Stack;

public class Stack {
    private int size;
    private int[] stackArray;
    private int top;//top of stack

    public Stack(int size) {
        this.size = size;
        stackArray=new int[size]; //Stack Array creation
        top=-1; //Initialize stack with -1
    }

    /**
     *
     * @return true if stack is empty
     */
    public boolean isEmpty()
    {
        return (top==-1);
    }

    /**
     *
     * @return true if stack is full
     */
    public boolean isFull()
    {
        return (top==size-1);
    }

    /**
     *
     * @param value
     * Push item into stack, it will put item on the top of stack
     */
    public void push(int value)
    {
        if(isFull())
            throw new StackFullException("Stack is full");

        stackArray[++top]=value;
    }

    /**
     *
     * @return pop stack value
     * Pop item form stack, it will pop item form the top of stack
     */

    public int pop()
    {
        if(isEmpty())
            throw new StackEmptyException("Stack is empty");
        return stackArray[top--];
    }

    public void display()
    {
        for (int i = 0; i < top; i++) {
            System.out.print(stackArray[i] + "  ");

        }
    }

}
