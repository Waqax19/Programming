package OOP;


class NodeOne
{
    int item;
    NodeOne left, right;

    public NodeOne(int key)
    {
        item = key;
        left = right = null;
    }
}
public class PreOrder
{

    NodeOne root;

    PreOrder()
    {
        root = null;

    }

    void postOrder(NodeOne nodeOne)
    {
        if(nodeOne == null)
        {
            return;
        }

        postOrder(nodeOne.left);

        postOrder(nodeOne.right);

        System.out.println(nodeOne.item);

    }


    public static void main(String[] args)
    {
        PreOrder tree = new PreOrder();

        tree.root = new NodeOne(1);
        tree.root.left = new NodeOne(12);
        tree.root.right = new NodeOne(9);

        tree.root.left.left = new NodeOne(5);
        tree.root.left.right = new NodeOne(6);


        System.out.println("Pre Order Traversal ");
        tree.postOrder(tree.root);

    }
}

