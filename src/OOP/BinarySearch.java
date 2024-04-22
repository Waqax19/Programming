package OOP;

public class BinarySearch
{

    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;


    public Node search(Node root, int data)
    {
        if (root == null)
            return null;

        if (root.key == data)
        {
            return root;//the value we were looking for is present at the root node , return that
        }

        if(root.key < data)
        {
            return search(root.right, data);
        }

        return search(root.left, data);
    }

    public static void main(String[] args)
    {

    }
}
