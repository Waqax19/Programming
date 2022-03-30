package BinarySearch;

public class BinarySTree
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

    BinarySTree()
    {
        root = null;
    }

    Node insertKey(Node root, int key)
    {
        if (root == null)
        {

            root = new Node(key);
            return root;
        }


        //traverse to the right place and insert the node
        if(key < root.key)
        {
            root.left = insertKey(root.left , key);
        }

        else if (key > root.key)
        {
            root.right = insertKey(root.right , key);
        }

        return root;

    }



    void inOrder(Node root)
    {
        if (root != null)
        {
            inOrder(root.left);

            System.out.println(root.key +" -> ");

            inOrder(root.right);
        }
    }


    Node deleteSomeKey(Node root , int key)
    {
        if (root == null)
        {
            return root;
        }

        //find the node that need to be deleted
        if (key < root.key)
            root.left = deleteSomeKey(root.left, key);

        else if (key > root.key)
            root.right = deleteSomeKey(root.right, key);

        else
        {
            if (root.left == null)
            {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left;
            }

            //place the successor in it's position
            root.key = minValue(root.right);

            root.right = deleteSomeKey(root.right , root.key);
        }
        return root;
    }

    void deleteKey(int key)
    {
        root = deleteSomeKey(root, key);
    }


    void inORder()
    {
        inOrder(root);
    }

    void insert(int key)
    {
        root = insertKey(root, key);
    }

    //find the successor node (inOrder)
    int minValue(Node root)
    {
        int min = root.key;

        while (root.left != null)
        {
            min = root.left.key;

            root = root.left;
        }

        return min;
    }


    public static void main(String[] args)
    {
        BinarySTree tree = new BinarySTree();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.println("InOrder traversal : ");
        tree.inORder();

        System.out.println("After deleting 10 ");
        tree.deleteKey(10);

        System.out.println("InOrder Traversal ");
        tree.inORder();






    }

}
