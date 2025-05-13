package BinarySearchTree;

public class BTreeNode {
    String data;
    BTreeNode parent;
    BTreeNode left;
    BTreeNode right;

    public int compareTo(BTreeNode node) {
        return data.compareTo(node.data);
    }

    public String toString() {
        String toReturn = "Node = " + data +
                " Parent = " + (parent == null ? "null" : parent.data) +
                " Left = " + (left == null ? "null" : left.data) +
                " Right = " + (right == null ? "null" : right.data);
        return toReturn;
    }

}
