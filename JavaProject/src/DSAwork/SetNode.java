package DSAwork;

//part of DSAquiz3
public class SetNode<E extends Comparable> implements Comparable<SetNode> {
    public E data;
    public SetNode<E> next;

    @Override
    public int compareTo(SetNode node) {
        return this.data.compareTo(node.data);
    }
}

