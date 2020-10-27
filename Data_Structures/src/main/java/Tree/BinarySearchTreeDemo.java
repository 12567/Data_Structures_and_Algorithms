package Tree;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.add(bst.root, bst.createNode(10));
        bst.add(bst.root, bst.createNode(12));
        bst.add(bst.root, bst.createNode(11));
        bst.add(bst.root, bst.createNode(13));
        bst.add(bst.root, bst.createNode(6));

        bst.search(11, bst.root);

    }
}
