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


public class SingleLinkedList<T>{
    
    public static void main(String[] args) {
        SingleLinkedList<Integer> list = new SingleLinkedList<>();
        System.out.println(list.toString());

        list.add_firest(5);
        System.out.println(list.toString());

        list.add_firest(4,3,1,0);
        System.out.println(list.toString());

        list.add_last(6,7,8);
        System.out.println(list.toString());

        list.add_at(2, 2);
        System.out.println(list.toString());

    }

    private Node<T> head, tail;
    public int  size = 0;

    private class Node<T>{
        T value;
        Node<T> next;

        Node(T value){
            this.value = value;
        }
    }

    public boolean is_empty() {return size == 0;}

    public void add_firest(T value){
        Node<T> new_node = new Node<>(value);
        size++;

        if(head == null){
            head = tail = new_node;
            return;
        }

        new_node.next = head;
        head = new_node;   
    }


    public void add_firest(T ... values) {
        for(T value : values) add_firest(value);
    }

    public void add_last(T value) {
        Node<T> new_node = new Node<>(value);
        size++;

        if (head == null) { 
            head = tail = new_node;
            return;
        }

        tail.next = new_node;
        tail = new_node;

    }

    public void add_last(T... values) {
        for (T value : values) add_last(value);
    }

    public void add_at(int index, T value){
        
        
        if (index > size+1){
            System.out.println("OUT OF BOUND!");
            return;
        }

        else if (index == size+1) {
            add_last(value);
            return;
        }

        else if (index == 0) {
            add_firest(value);
            return;
        }
        
        Node<T> new_node = new Node<>(value);
        Node<T> node = head , next_node = head.next;

        for (int i = 0; i < index -1; i++, node = node.next);
        next_node = node.next;

        node.next = new_node;
        new_node.next = next_node;

    }

    public void add_at(int index, T... values) {
        for (T value : values) add_at(index, value);
    }

    public T removeFirst(){ 
        if(is_empty()) {
            System.out.println("EMPTY!");
            return null;
        }

        T value = head.value;
        head = head.next;
        size--;
        return value;
     }



     public T removeLast() {
         if (is_empty()) {
             System.out.println("EMPTY!");
             return null;
         }

        T value = tail.value;

        Node<T> new_tail = head;
        for (; new_tail != tail ; new_tail = new_tail.next);
        tail = new_tail;
        size--;
        return value;
    }

    @Override
    public String toString() {
        String text = "[";

        for(Node<T> node = head ; node != null; node = node.next ){
            if (node.next == null) return text + node.value.toString() + "]";
            text += node.value.toString() + ", ";

        }

        return "[]";
    }


}