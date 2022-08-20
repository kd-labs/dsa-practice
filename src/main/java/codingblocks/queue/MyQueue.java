package codingblocks.queue;

import java.util.Stack;

public class MyQueue {

    private int[] arr;
    private int front;
    private int size;

    MyQueue(int size) {
        this.arr = new int[size];
        this.front = -1;
        this.size = 0;
    }

    public boolean enqueue(int el) {
        if(this.size == this.arr.length) {
//            throw new QueueOverflowException();
        }
        if(this.front == -1) this.front = 0;
        this.arr[this.size++] = el;
        return true;
    }

    public int dequeue() {
        if(this.size == 0) {
//            throw new QueueUnderflowException();
        }
        int val = this.arr[this.front++];
        this.size--;
        return val;
    }

    public int peek() {
       if(this.size == 0) {
//           throw new QueueUnderflowException();
       }

       return this.arr[this.front];
    }

    public boolean isEmpty() {
        if(this.size == 0) return true;
        return false;
    }

    public boolean isFull() {
        if(this.size == this.arr.length) return true;
        return false;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
    }

}
