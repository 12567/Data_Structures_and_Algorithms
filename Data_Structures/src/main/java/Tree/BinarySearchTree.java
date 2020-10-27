package Tree;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree()
    {
        root = null;
    }
    public Node createNode(int value)
    {
        return new Node(value, null, null);
    }
    public void add(Node start, Node newNode)
    {
        if(root == null)
        {
            root = newNode;
            return;
        }
        if(newNode.value > start.value)
        {
            if(start.right == null)
                start.right = newNode;
            add(start.right, newNode);
        }

        if(newNode.value < start.value)
        {
            if(start.left == null)
                start.left = newNode;
            add(start.left, newNode);
        }
    }
    public void search(int value, Node start)
    {
        if(start ==  null)
        {
            System.out.println("Node is not found");
            return;
        }
        if(start.value == value)
        {
            System.out.println("Node is found");
            return;
        }
        if(value > start.value)
        {
            search(value, start.right);
        }
        if(value < start.value)
        {
            search(value, start.left);
        }
    }
}
