package Interview_Problems.Google;

import java.util.HashSet;

//Given two BST ,write fn that determines if they are equal.
//Tree may be of different shape

public class BinaryTreeCompare {
    public static void main(String[] args) {
        new BinaryTreeCompare().run();
    }
    
    public void run()
    {
        BinarySearchTree tree1 = new BinarySearchTree();

        tree1.add(tree1.root, tree1.createNode(10));
        tree1.add(tree1.root, tree1.createNode(11));
        tree1.add(tree1.root, tree1.createNode(12));
        scanTree(tree1.root, true);
        
        BinarySearchTree tree2 = new BinarySearchTree();

        tree2.add(tree2.root, tree2.createNode(11));
        tree2.add(tree2.root, tree2.createNode(15));
        tree2.add(tree2.root, tree2.createNode(11));
        scanTree(tree2.root, false);
    }

    HashSet<Integer> set = new HashSet<>();

    public void scanTree(Node node,boolean isSaved)
    {
        if(node == null)
            return;

        //called by tree1
        if (isSaved == true) {
            set.add(node.value);
        }
        else
        {
            //called by tree2
            if(!set.contains(node.value)){
                System.out.println("Tree are not equal");
            }
        }
        scanTree(node.left, isSaved);
        scanTree(node.right, isSaved);
    }


}

