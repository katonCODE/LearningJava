package DSAwork;
//week 3 work

public class LinkedSet<E extends Comparable> {
    SetNode<E> head;
    int size;

    public LinkedSet() {
        head = null;
        size = 0;
    }

    public void add(E data) {
        SetNode<E> newNode = new SetNode<>();
        newNode.data = data;
        if (size == 0) {
            head = newNode;
            size = 1;
        } else {
            if (!contains(data)) {
                SetNode currentNode = head;
                for (; currentNode.next != null; currentNode = currentNode.next)
                    ;
                currentNode.next = newNode;
                size++;
            }
        }
    }

    public boolean contains(E data) {
        if (head == null) {
            return false;
        }

        SetNode<E> currentNode = head;
        if (currentNode.data.equals(data)) {
            return true;
        }

        return false;
    }

    public String toStringRreversely(SetNode head) //returns a string which contains all Nodes’ data reversely
    // suggest using recursion
    {
        String outputString = "";
        
        if(head.next != null){
            outputString = toStringRreversely(head.next);
        }
    
    return outputString + head.data;
    }

    

    public String toString() {
        if (head == null){
            return "";
        }

        SetNode <E> currentNode = head;

        StringBuilder create = new StringBuilder();


        while(currentNode.next != null){
            create.append(currentNode.data);
            if (currentNode.next == null) {
                create.append("");
            }

            currentNode = currentNode.next;
        }



        return create.toString();
    }
}