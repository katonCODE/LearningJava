package BinarySearchTree;

public class StringBinaryTree {
    BTreeNode root;

    public StringBinaryTree() {

    }

    public StringBinaryTree(String[] list) {
        for (int i = 0; i < list.length; i++) {
            add(list[i]);
        }
    }

    public void add(String toAdd) {
        if (root == null) {
            root = new BTreeNode();
            root.data = toAdd;
        } else {
            BTreeNode newNode = new BTreeNode();
            newNode.data = toAdd;
            add(root, newNode);
        }
    }

    private void add(BTreeNode root, BTreeNode newNode) {
        if (root.compareTo(newNode) > 0) {
            if (root.left != null) {
                add(root.left, newNode);
            } else {
                root.left = newNode;
            }
        } else {
            if (root.right != null) {
                add(root.right, newNode);
            } else {
                root.right = newNode;
            }
        }
    }

    public void linkParent() {
        linkParent(root);
    }

    private BTreeNode linkParent(BTreeNode root) {
        BTreeNode current;

        if (root.left != null) {
            current = root.left;
            root.left.parent = root;
            linkParent(current);
        }

        if (root.right != null) {
            current = root.right;
            root.right.parent = root;
            linkParent(current);
        }

        return root;
    }

    public void traverse() {
        traverse(root);
    }

    private void traverse(BTreeNode root) {
        if (root.left != null) {
            traverse(root.left);
        }

        System.out.println(root);

        if (root.right != null) {
            traverse(root.right);
        }
    }

    public void LCA(BTreeNode node1, BTreeNode node2) {
        LCA(root, node1, node2);
    }

    private void LCA(BTreeNode root, BTreeNode node1, BTreeNode node2) {

        int node1SB = node1.compareTo(root);
        int node2SB = node2.compareTo(root);

        if (node1SB < 0 && node2SB > 0 || node2SB < 0 && node1SB > 0) {
            System.out.println(root);
        }

        if (node1SB < 0 && node2SB < 0) {
            LCA(root.left, node1, node2);
        }

        if (node1SB > 0 && node2SB > 0) {
            LCA(root.right, node1, node2);
        }

    }

}
