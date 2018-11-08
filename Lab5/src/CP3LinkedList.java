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
       public Node previous;

    }

    private Node first;
    private Node last;

    public CP3LinkedList()
    {
        first = null;
        last = null;
    }

    public B getFirst()
    {
        if(first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    public B getLast()
    {
        if(last == null) {
            throw new NoSuchElementException();
        }
        return last.data;
    }

    public void addFirst(B element)
    {

        Node node = new Node();
        node.data = element;

        node.next = first;

        if (first != null)
        {
        node.next = first;
        first.previous = node;
            //first = node;
        }
        else {
            last = node;
            node.previous = null;
            //first = node;
       }
      first = node;
    }

    public void addLast(B element)
    {

        Node node = new Node();
        node.data = element;
        node.next = null;
        last.next = node;

         if (first == null)
         {
          first = node;
         }
         else {
             node.previous = null;
         }

          if(last != null) {
           last.next = node;
           node.previous = last;
         }
        last = node;
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

    public void print() {
        Node current = first;
       while (current != null){
           System.out.println(current.data);
        current = current.next;
    }
    }


    //Recursive Version
    private void printSub(Node head)
    {
       if(head != null)
       {
           System.out.println(head.data);
           printSub(head.next);
       }
       else {
           System.out.println(" ");
       }

    }

    public void printSub()
    {
        printSub(first);
    }

    public void printRev()
    {
       printSubReverse(first);
    }

    //Recursive Version
    private void printSubReverse(Node head)
    {
        if(head != null)
        {
            printSubReverse(head.next);
            System.out.println(head.data);
        }
        else {
            System.out.println(" ");
        }

    }

   /* public void printReverse()
    {


    }*/

    public int size()
    {
      int size = 0;

      Node current = first;

      while (current != null)
      {
          size++;
          current = current.next;
      }

      return size;
    }


    public static void main(String[] args) {

        CP3LinkedList<String> team = new CP3LinkedList<String>();
        team.addFirst("Man City");
        team.addFirst("Man Utd");
        team.addFirst("Chelsea");

        System.out.println("List in order: ");
        team.printSub();//Expected = Chelsea, Man Utd, Man City

        team.print();//Iterative

        System.out.println("List in reverse order: ");
        team.printRev();



    }

}
