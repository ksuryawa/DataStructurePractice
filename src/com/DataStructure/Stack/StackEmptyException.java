package com.DataStructure.Stack;

public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String stack_is_empty) {
        super(stack_is_empty);
    }
}
