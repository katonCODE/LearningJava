package OtherQuestions;

public class Stack<E> {
    private final int INITIAL_CAPACITY = 200;
    private int numElements;
    private E[] elements;

    public Stack() {
        numElements = 0;
        elements = (E[]) new Object[INITIAL_CAPACITY];
    }

    public boolean push(E object) {
        if (numElements < INITIAL_CAPACITY) {
            elements[numElements++] = object;

            return true;
        }

        return false;
    }

    public E pop(){
        if(numElements > 0){
            return elements[(--numElements)];
            //need to decrease number of elements before returning otherwise it may 
            //return out of bounds or return the wrong element
            
        }

        return null;
    }

    public boolean isEmpty(){
        return numElements == 0;
    }

}
