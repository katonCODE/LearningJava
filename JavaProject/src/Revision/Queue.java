package Revision;

import java.util.NoSuchElementException; // For handling empty queue operations

public class Queue<E> {

    // Inner Node class for the linked list
    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<E> head; // Front of the queue
    private Node<E> tail; // End of the queue
    private int size; // Number of elements in the queue

    // Constructor
    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Adds an item to the end of the queue.
     * 
     * @param item The item to add.
     */
    public void enqueue(E item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot enqueue null item.");
        }
        Node<E> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; // Link current tail to the new node
            tail = newNode; // Update tail to be the new node
        }
        size++;
    }

    /**
     * Removes and returns the item from the front of the queue.
     * 
     * @return The item at the front of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty, cannot dequeue.");
            // If you absolutely MUST return null instead of throwing an exception
            // (like your previous error implied your custom queue did):
            // return null;
        }
        E itemToDequeue = head.data;
        head = head.next; // Move head to the next node
        size--;

        // If the queue becomes empty after dequeuing, update tail as well
        if (isEmpty()) {
            tail = null;
        }
        return itemToDequeue;
    }

    /**
     * Returns the item at the front of the queue without removing it.
     * 
     * @return The item at the front of the queue.
     * @throws NoSuchElementException if the queue is empty.
     */
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty, cannot peek.");
            // If you need to return null:
            // return null;
        }
        return head.data;
    }

    /**
     * Checks if the queue is empty.
     * 
     * @return true if the queue is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0; // Or head == null
    }

    /**
     * Returns the number of items in the queue.
     * 
     * @return The size of the queue.
     */
    public int size() {
        return size;
    }

    // Optional: A simple toString for debugging
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue (front to back): [");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}