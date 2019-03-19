package gui;

import javax.swing.JFrame;

import spelling.*;

/**
   This program displays the growth of an investment. 
*/
public class TextEditorMain
{  
   public static void main(String[] args)
   {  
      Dictionary dictionary = new DictionaryLinkedList();
       //Dictionary dictionary = new DictionaryTreeSet();
       //Dictionary dictionary = new DictionaryHashSet();
       //Dictionary dictionary = new DictionaryAVLTree();


      JFrame frame = new TextEditorFrame(dictionary);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
