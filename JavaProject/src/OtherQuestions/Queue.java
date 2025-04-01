package OtherQuestions;

/// quite interesting how circular queues work
/// basically, it enables us to use a queue in an array despite limited capacity size
/// the line tail (or head) = (tail + 1) % INITIAL_CAPACITY enables the value at head
/// or value at tail to constantly shift and use space that is no longer occupied meaning
///  the tail of the queue could be at index 398 w hile the head is at index 10 and the 
/// queue would work perfecty fine
/// 


public class Queue <E> {
    private final int INITIAL_CAPACITY = 200;
    private int head;
    private int tail;
    private int numElements;
    private E[] elements;

    public Queue(){
        head = 0;
        tail = 0;
        numElements = 0;
        elements = (E[]) new Object[INITIAL_CAPACITY];

    }

    public boolean enqueue(E object){
        if(numElements < INITIAL_CAPACITY){
            elements[ (tail) ] = object;
            tail = (tail + 1) % INITIAL_CAPACITY;

            numElements++;
            return true;

          

        }

        return false;
    }

    public E dequeue(){
        if (numElements > 0){
            numElements--;
            head = (head + 1) % INITIAL_CAPACITY;
            return elements[ (head) ];
            
        }

        return null;
    }

    public boolean isEmpty(){
        return numElements == 0;
    }
    
}
