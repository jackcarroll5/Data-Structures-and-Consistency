//Singly LinkedList

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CP3LinkedList<B>
{
    //Implement LinkedList
    private class Node
    {
       public B data;
       public Node next;
    }

    private Node first;

    public CP3LinkedList()
    {
        first = null;
    }

    public B getFirst()
    {
        if(first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public void addFirst(B element)
    {
        Node node = new Node();
        node.data = element;

        node.next = null;

       // if (first == null)
       // {
         //   //node.next = null;
            //first = node;
       // }
        //else {
            //node.next = first;
            //first = node;
       // }

      first = node;
    }

    public B removeFirst()
    {
        if (first == null){
            throw new NoSuchElementException();
        }
        //Store first Node
        B element = first.data;
        first = first.next;
        return element;
    }

    public boolean isEmpty(){
        /*if(first == null)
        return true;
        else
            return false;*/

        return first == null;
    }
}
