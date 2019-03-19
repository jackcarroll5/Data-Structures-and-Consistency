package gui;

import javax.swing.JFrame;
import spelling.Dictionary;
import spelling.DictionaryHashSet;
import spelling.DictionaryLinkedList;
import spelling.DictionaryTreeSet;

/**
   This program displays the growth of an investment. 
*/
public class TextEditorMain
{  
   public static void main(String[] args)
   {  
      Dictionary dictionary = new DictionaryLinkedList();
      //Dictionary dictionary = new DictionaryHashSet();
      //Dictionary dictionary = new DictionaryTreeSet();
      JFrame frame = new TextEditorFrame(dictionary);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
