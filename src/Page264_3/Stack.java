package Page264_3;

public class Stack {
    private int stack[];
    private int summit;

    Stack(int size){
        stack = new int[size];
        summit = 0;
    }

    void push(int n){
        if (summit == stack.length){
            System.out.println("Достигнут конец стека");
            return;
        }
        stack[summit] = n;
        summit++;
    }

    int pop(){
        if (summit == 0){
            System.out.println("Стек пуст");
            return -99999999;
        }
        summit--;
        return stack[summit];
    }
}
