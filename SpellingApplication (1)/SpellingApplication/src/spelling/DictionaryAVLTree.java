package spelling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*****************************************************
*��� Title: AVLTree
*��� Author: 
*    Site owner/sponsor: Rosetta code
*��� Date: 11 October 2017
*��� Code version: edited 11 October 2017, at 14:46
*��� Availability: https://rosettacode.org/wiki/AVL_tree
*    (Accessed 24 November 2017)
*    Modified: 1. Uses generic type for data instead of int
*     2. Added add method - to match Dictionary interface
*     3. Added contains method - to match Dictionary interface         

*****************************************************/

public class DictionaryAVLTree implements Dictionary {
    private AVLTree<String> dictionary;

    public DictionaryAVLTree() {
        load("SpellingApplication/words_alpha.txt");
    }

    @Override
    public void load(String fileName) {
        dictionary = new AVLTree();
        try {
            // Prepare to read from the file, using a Scanner object
            File file = new File(fileName);
            Scanner in = new Scanner(file);

            // Read each word until end of file is reached
            while (in.hasNextLine()) {
                // Read one word from the file
                String word = in.nextLine();
                dictionary.add(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    @Override
    public boolean isWord(String s) {
        return dictionary.contains(s);
    }

    @Override
    public boolean addWord(String word) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
