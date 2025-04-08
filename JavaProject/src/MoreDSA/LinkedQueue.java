package MoreDSA;

public class LinkedQueue<E> {

    public Node<E> head;
    public Node<E> tail;
    public int numElements;

    public LinkedQueue() {
        head = null;
        tail = null;
        numElements = 0;
    }

    public boolean enqueue(E element) {

        Node<E> toQue = new Node<>();
        toQue.data = element;

        if (numElements == 0 || head == null) {
            head = toQue;
            tail = toQue;
            numElements++;
            return true;
        } else {
            toQue.prev = tail;
            tail.next = toQue;
            tail = toQue;
            numElements++;
            return true;
        }

    }

    public E dequeue() {
        Node<E> toReturn = head;
        E returnData = toReturn.data;

        if (numElements == 0) {
            return null;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }

        return returnData;

    }

    public int size() {
        return numElements;
    }

}
