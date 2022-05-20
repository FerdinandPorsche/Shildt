package Page380_10;

import Page376_378_exercise.QueueEmptyException;

public class Stack {
    private int stack[];
    private int summit;

    Stack(int size){
        stack = new int[size];
        summit = 0;
    }

    void push(int n) throws StackFullException {
        if (summit == stack.length){
            throw new StackFullException(stack.length);
        }
        stack[summit] = n;
        summit++;
    }

    int pop() throws StackEmptyException {
        if (summit == 0){
            throw new StackEmptyException();
        }
        summit--;
        return stack[summit];
    }
}
