package gui;

import javax.swing.JFrame;

import spelling.*;

public class TextEditorMain
{  
   public static void main(String[] args)
   {







      //Dictionary dictionary = new DictionaryArrayList("data/words_alpha.txt");







      //Dictionary dictionary = new DictionaryLinkedList("data/words_alpha.txt");















      //Dictionary dictionary = new DictionaryAVLTree("data/words_alpha.txt");






       /*long time = System.currentTimeMillis();
      Dictionary dictionary = new DictionaryTreeSet("data/words_alpha.txt");
       long end = System.currentTimeMillis();
       System.out.println("Time for TreeSet: " + (end - time));*/


       long time = System.currentTimeMillis();
       Dictionary dictionary = new DictionaryHashSet("data/words_alpha.txt");
       long end = System.currentTimeMillis();
       System.out.println("Time for HashSet: " + (end - time));



      JFrame frame = new TextEditorFrame(dictionary);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
