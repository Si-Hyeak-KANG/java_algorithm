package dataStructureSudy.base01;

import java.util.ArrayList;

public class Queue<T> {

    private ArrayList<T> queue = new ArrayList<T>();

    /**
     * enqueue
     */
    public void enqueue(T item) {
        queue.add(item);
    }

    /**
     * dequeue -> 큐에 데이터가 없을 경우, null을 리턴
     */
    public T dequeue() {

        if(queue.isEmpty()) {
            return null;
        } else {
            return queue.remove(0);
        }

    }

    public StringBuilder look() {

        StringBuilder sb = new StringBuilder();

        if(queue.isEmpty()) {
            sb.append(0);
        } else {
            for (int i = 0; i < queue.size(); i++) {
                Integer t = (Integer) queue.get(i);
                sb.append(t + ", ");
            }
        }
        return sb;
    }

    public boolean isEmpty() {
        return  queue.isEmpty();
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new Queue<Integer>();

        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println(myQueue.look()); // 1,2,3

        System.out.println(myQueue.dequeue()); // 1
        System.out.println(myQueue.look()); // 2, 3

        System.out.println(myQueue.dequeue()); // 2
        System.out.println(myQueue.look()); // 3

        System.out.println(myQueue.dequeue()); // 3
        System.out.println(myQueue.look()); //0

        System.out.println(myQueue.dequeue()); // null


    }

}
