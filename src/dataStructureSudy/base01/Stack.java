package dataStructureSudy.base01;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack = new ArrayList<T>();

    /**
     * push
     */
    public void push(T item) {
        stack.add(item);
    }

    /**
     * pop
     */
    public T pop() {

        if(stack.isEmpty()) {
            return null;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();

        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.pop());
        myStack.push(3);

        
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
