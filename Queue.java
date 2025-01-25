/**
 *  @assignment THE FINAL PROJECT
 *
 *  @author      STUDENT'S NAME: MOHMMED R H HIREZ
 *               STUDENT'S NO:   1 2022 0519
 *
 *  @instructor  Dr. Eyad El-Masri
 *
 *  @course      BSAI2121 Data Structures and Algorithm Analysis - Lab
 *
 *  @date        25 Jan 2025
 */

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.front());
        System.out.println("Is Queue Empty? " + queue.isEmpty());
        queue.enqueue(40);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is Queue Empty? " + queue.isEmpty());
    }

    private LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(int value) {
        list.addLast(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.removeFirst();
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public boolean contains(int value) {
        return list.contains(value);
    }

    public void clear() {
        list.clear();
    }
}
