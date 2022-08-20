package codingblocks.stack;

import java.util.ArrayList;

public class MyStack<T> {

    private ArrayList<T> arr;
    private int tos = -1;

    private int size;

    MyStack(int size) {
        this.size = size;
        this.arr = new ArrayList<>(size);
    }

    public boolean push(T el) throws StackOverflowException {

        // guard clause
        if(tos == this.size) throw new StackOverflowException();
        this.arr.add(++tos, el);
        return true;
    }

    public T pop() throws StackUnderflowException{

        if(this.tos == -1) {
            throw new StackUnderflowException();
        }
        T val = this.arr.get(this.tos);
        this.arr.add(this.tos, null);
        this.tos--;
        return val;

    }

    public T peek() {

        return this.tos > -1 ? this.arr.get(this.tos) : null;

    }

    public boolean isEmpty() {
        return tos > -1;
    }

}

class StackOverflowException extends Exception {

    StackOverflowException() {
        super();
    }
}

class StackUnderflowException extends Exception {

    StackUnderflowException() {
        super();
    }
}
