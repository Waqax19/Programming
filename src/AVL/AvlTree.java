package AVL;


class Node
{
    int item, height;

    Node left, right;


    Node(int d)
    {
        item = d;
        height = 1;
    }
}

public class AvlTree
{
    Node root;

    int height(Node node)
    {
        if (node == null)
        {
            return 0;
        }

        return node.height;
    }

    int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    Node rightRotation(Node node)
    {
        Node a = node.left;
        Node b = a.right;

        a.right = node;

        node.left = b;

        node.height = max(height(node.left), height(node.right)) + 1;
        a.height = max(height(a.left), height(a.right)) + 1;

        return a;
    }

    Node leftRotation(Node nodeLeftRotation)
    {
        Node a = nodeLeftRotation.right;
        Node b = a.left;

        a.left = nodeLeftRotation;

        nodeLeftRotation.right = b;

        nodeLeftRotation.height = max(height(nodeLeftRotation.left), height(nodeLeftRotation.right)) + 1;
        a.height = max(height(a.left), height(a.right)) + 1;

        return a;
    }


    //get the balance factor
    int getBalanceFactor(Node node)
    {
        if (node == null)
            return 0;

        return height(node.left) - height(node.right);
    }




    Node insertion(Node node, int item)
    {
        if(node == null)
        {
            return new Node(item);
        }


        if(item < node.item)
        {
            node.left = insertion(node.left, item);
        }

        else if(item > node.item)
        {
            node.right = insertion(node.right, item);
        }

        else
            return node;

        //update the balance factor

        node.height = 1 + max(height(node.left), height(node.right));

        int balanceFactor = getBalanceFactor(node);


        if (balanceFactor > 1)
        {
            if (item < node.left.item)
            {
                return rightRotation(node);
            }

            else  if (item > node.left.item)
            {
                node.left = leftRotation(node.left);
                return rightRotation(node);
            }
        }


        if (balanceFactor < -1)
        {
            if (item > node.right.item)
            {
                return leftRotation(node);
            }

            else  if (item < node.right.item)
            {
                node.right = rightRotation(node.right);
                return leftRotation(node);
            }
        }

        return node;
    }

    Node nodeWithMinimumVal(Node node)
    {
        Node current = node;

        while (current.left != null)
        {
            current = current.left;

        }

        return current;
    }

    //delete the node
    Node deleteNode(Node root, int item)
    {
        //find the node you want to delete and remove it
        if (root == null)
            return root;

        if (item < root.item)
        {
            root.left = deleteNode(root.left, item);
        }

        else if (item > root.item)
        {
            root.right = deleteNode(root.right, item);
        }

        else
        {
            if ((root.left == null) || (root.right == null))
            {
                Node temp = null;

                if (temp == root.left)
                    temp = root.right;

                else
                    temp = root.left;

                if (temp == null)
                {
                    temp = root;
                    root = null;
                }

                else
                    root = temp;
            }

            else
            {
                Node temp = nodeWithMinimumVal(root.right);
                root.item = temp.item;
                root.right = deleteNode(root.right, temp.item);
            }
        }


        if (root == null)
            return root;


        //update the balance factor
        root.height = max(height(root.left), height(root.right)) + 1;

        int balanceFactor = getBalanceFactor(root);

        if (balanceFactor > 1)
        {
            if (getBalanceFactor(root.left) >= 0)
            {
                return rightRotation(root);
            }

            else
            {
                root.left = leftRotation(root.left);
                return rightRotation(root);
            }
        }

        if(balanceFactor < -1)
        {
            if (getBalanceFactor(root.right) <= 0)
            {
                return leftRotation(root);
            }
            else
            {
                root.right = rightRotation(root.right);

                return leftRotation(root);
            }
        }

        return root;
    }


    void preOrder(Node node)
    {
        if (node != null)
        {
            System.out.println(node.item);

            preOrder(node.left);
            preOrder(node.right);
        }
    }

    //print the tree
    private void  printTree(Node curr, String indent, boolean last)
    {
        if (curr != null)
        {
            System.out.println(indent);

            if (last)
            {
                System.out.println("R...............");
                indent += "     ";
            }

            else
            {
                System.out.println("L...............");
                indent += "| ";
            }

            System.out.println(curr.item);
            printTree(curr.left, indent, false);
            printTree(curr.right, indent, true);

        }

    }


    public static void main(String[] args)
    {
        AvlTree tree = new AvlTree();

        tree.root = tree.insertion(tree.root, 33);
        tree.root = tree.insertion(tree.root, 13);
        tree.root = tree.insertion(tree.root, 53);
        tree.root = tree.insertion(tree.root, 9);
        tree.root = tree.insertion(tree.root, 21);
        tree.root = tree.insertion(tree.root, 61);
        tree.root = tree.insertion(tree.root, 8);
        tree.root = tree.insertion(tree.root, 11);

        tree.printTree(tree.root , "", true);



        tree.root = tree.deleteNode(tree.root,13);

        System.out.println("Deleteion of a node ...");

        tree.printTree(tree.root, "", true);


    }


}
