package gui;

import javax.swing.JFrame;

import spelling.*;

public class TextEditorMain
{  
   public static void main(String[] args)
   {

       long cTime = System.currentTimeMillis();
       Dictionary dictionary = new DictionaryArrayList();
        long timeA = System.currentTimeMillis();
        System.out.println("\nTime for Dictionary with Array List: " + (timeA - cTime));


      /*long cTime = System.currentTimeMillis();
      Dictionary dictionary = new DictionaryLinkedList();
      long timeA = System.currentTimeMillis();
      System.out.println("\nTime for Dictionary with Linked List: " + (timeA - cTime));*/


      /*long cTime = System.currentTimeMillis();
      Dictionary dictionary = new DictionaryAVLTree();
      long timeA = System.currentTimeMillis();
      System.out.println("\nTime for Dictionary with AVL Tree: " + (timeA - cTime));*/

       /*long cTime = System.currentTimeMillis();
      Dictionary dictionary = new DictionaryTreeSet();
      long timeA = System.currentTimeMillis();
      System.out.println("\nTime for Dictionary with Tree Set: " + (timeA - cTime));*/

      JFrame frame = new TextEditorFrame(dictionary);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
