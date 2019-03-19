/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelling;

import java.util.ArrayList;
import java.util.List;

//Use this for profiling
public class TestMain {
    public static void main(String[] args) {
        String word = "gost";
         
        //Test with LinkedList dictionary
        long nowTime = System.currentTimeMillis();
        Dictionary dictionary = new DictionaryLinkedList();
        testLinkedList(word, dictionary);
        long timeUp = System.currentTimeMillis();
        System.out.println("\nTime for LinkedList Test: " + (timeUp - nowTime));
        
        //Test with TreeSet dictionary
        long time = System.currentTimeMillis();
        dictionary = new DictionaryTreeSet();
        testTreeSet(word, dictionary);
        long timeEnd = System.currentTimeMillis();
        System.out.println("\nTime for TreeSet Test: " + (timeEnd - time));
                
        //Test with HashSet dictionary
        long nowT = System.currentTimeMillis();
        dictionary = new DictionaryHashSet();
        testHashSet(word, dictionary);
        long timeE = System.currentTimeMillis();
        System.out.println("\nTime for HashSet Test: " + (timeE - nowT));

        long timeNow = System.currentTimeMillis();
        dictionary = new DictionaryAVLTree();
        testAVLTree(word, dictionary);
        long timeOut = System.currentTimeMillis();
        System.out.println("\nTime for AVL Tree Test: " + (timeOut - timeNow));
        
    }
    
    //Use the following method for profiling
    private static void testLinkedList(String word, Dictionary dictionary) {
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 10);
        System.out.println(result);
    }

    private static void testTreeSet(String word, Dictionary dictionary) {
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 10);
        System.out.println(result);
    }

    private static void testHashSet(String word, Dictionary dictionary) {
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 10);
        System.out.println(result);
    }

    private static void testAVLTree(String word, Dictionary dictionary) {
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 10);
        System.out.println(result);
    }
     
}

