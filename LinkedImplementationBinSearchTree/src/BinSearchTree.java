public class BinSearchTree<E extends Comparable<E>> {

    private class Node
    {
       public E data;
       public Node left;
       public Node right;
    }

    private Node root;

    public BinSearchTree()
    {
       root = null;
    }

    public void insertRecursive(E element)
    {
      Node newNode = new Node();
      newNode.data = element;
      newNode.left = null;
      newNode.right = null;


      if (root == null)
      {
          root = newNode;
      }
      else {
          insertSub(root, newNode);
      }
    }

    public void insertSub(Node node, Node newNode)
    {
       int result = node.data.compareTo(newNode.data);

       if(result > 0) {
           //Go left (Allowing Duplicates) - Positive
           if (node.left == null) {
               //In insert position
               node.left = newNode;
           } else {
               insertSub(node.left, newNode);
           }
       }

       else
       {
           if (node.right == null) {
               //In insert position
               node.right = newNode;
           } else {
               insertSub(node.right, newNode);
           }
       }
    }

    public void insertRecursiveNoDuplicates(E element)
    {



    }

    public void insertIterative(E element) {
        Node newNode = new Node();

        newNode.data = element;
        newNode.left = null;
        newNode.right = null;


        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        boolean finished = false;


        while (!finished)
        {
            if (element.compareTo(current.data) < 0)
            {
                current = current.left;

                if (current == null)
                {
                    current.left = newNode;
                   finished = true;
                }
                else
                    current = current.left;

            }
            else {
                current = current.right;
                if (current == null)
                {
                    current.right = newNode;
                    finished = true;
                }
                else
                    current = current.right;

            }
        }
    }

    private void print(Node node)
    {
      if(node != null)
      {
          print(node.left);
          System.out.println(node.data);
          print(node.right);
      }
    }


    //Recursive Public Call
    public void printSub()
    {
       print(root);
    }


    //Accessor
    public boolean contains(E element)
    {
        return contains(root,element);
    }

    private boolean contains(Node root, E element)
    {
       if(root == null)
           return false;

       if(element.compareTo(root.data) == 0)
       {
           return true;
       }
       else if(element.compareTo(root.data) < 0)
        {
            Node left = root.left;
            return (contains(left,element));
        }
       else
        {
            Node right = root.right;
            return (contains(right,element));
        }

    }


}
