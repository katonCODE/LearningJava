package BinarySearchTree;

public class BstTest {

    public static void main(String[] args) {
        String[] elements = "cow, fly, dog, bat, fox, cat, eel, ant".split(", ");
        StringBinaryTree bTree = new StringBinaryTree(elements);
        bTree.traverse();

        System.out.println();
        bTree.linkParent();
        bTree.traverse();

        BTreeNode node1 = bTree.root.left;
        BTreeNode node2 = bTree.root.right;

        System.out.println();

        bTree.LCA(node1, node2);

    }

}
