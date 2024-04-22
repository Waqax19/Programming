package OOP;

    class Node
    {
        int data;
        Node left = null, right = null;

        Node(int data)
        {
           this.data = data;
        }


    }
public class BinaryInsertion
{
    public static void inOrder(Node root)
    {
        if (root == null)
        {
            return;
        }

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }


    public static Node insert(Node root, int key)
    {
        if (root == null)
            return new Node(key);

        if (key < root.data)
        {
            root.left = insert(root.left, key);
        }

        else
        {
            root.right = insert(root.right, key);
        }

        return root;
    }


    public static Node getMinimumKey(Node curr)
    {
        while (curr.left != null)
        {
            curr = curr.left;
        }
        return curr;
    }


    public static Node deleteNode(Node root, int key) {
        Node parent = null;

        Node curr = root;

        while (curr != null && curr.data != key) {
            parent = curr;

            if (key < curr.data) {
                curr = curr.left;

            } else {
                curr = curr.right;
            }
        }

        if (curr == null) {
            return root;
        }


        //case 1 : Node to be deleted has only one child, meaning it is a parent node
        if (curr.left != null && curr.right != null) {
            if (curr != root) {
                if (parent.left == curr) {
                    parent.left = null;
                } else
                    parent.right = null;
            } else {
                root = null;
            }
        }

        //case 2 : when the node we want to delete has 2 children

        else if (curr.left != null && curr.right != null) {
            Node successor = getMinimumKey(curr.right);

            int val = successor.data;

            deleteNode(root, successor.data);

            curr.data = val;
        }

        //case 3 : node to be deleted has only one child
        else {
            Node child = (curr.left != null) ? curr.left : curr.right;

            if (curr != root) {
                if (curr == parent.left) {
                    parent.left = child;

                } else {
                    parent.right = child;
                }
            }
        }

        return root;
    }




        public static Node constructTree(int[] keys)
    {
        Node root = null;

        for (int key : keys)
        {
            root = insert(root , key);
        }

        return root;
    }


    public static void main(String[] args)
    {
        int[] keys = {15,10,20,8,12,16,25};

        Node root = constructTree(keys);


        root = deleteNode(root , 16);
        inOrder(root);

    }


}
