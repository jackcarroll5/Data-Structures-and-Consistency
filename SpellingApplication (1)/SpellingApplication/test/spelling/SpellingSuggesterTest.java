/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spelling;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SpellingSuggesterTest {

    public SpellingSuggesterTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSuggestions method, of class SpellingSuggester.
     */
    @Test
    public void testGetSuggestions() {
        System.out.println("getSuggestions");

        String word = "gost";

        //Test with LinkedList dictionary
        Dictionary dictionary = new DictionaryLinkedList();
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 10);

        List<String> expResult = new ArrayList();
        expResult.add("cost");
        expResult.add("dost");
        expResult.add("host");
        expResult.add("lost");
        expResult.add("most");
        expResult.add("post");
        expResult.add("tost");
        expResult.add("wost");
        expResult.add("gast");
        expResult.add("gest");

        assertEquals(expResult, result);

        //Test with TreeSet dictionary
        /*dictionary = new DictionaryTreeSet();
        spellingSuggester = new SpellingSuggester(dictionary);
        result = spellingSuggester.getSuggestions(word, 10);
        
        assertEquals(expResult, result);
        
        //Test with HashSet dictionary
        dictionary = new DictionaryHashSet();
        spellingSuggester = new SpellingSuggester(dictionary);
        result = spellingSuggester.getSuggestions(word, 10);

        assertEquals(expResult, result);




        //Test with AVLTree dictionary
        dictionary = new DictionaryAVLTree("words_alpha.txt");
        spellingSuggester = new SpellingSuggester(dictionary);
        result = spellingSuggester.getSuggestions(word, 10);

        assertEquals(expResult, result);*/

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetSuggestionsUpdate() {
        System.out.println("getSuggestions");

        String word = "testinh";

        //Test with LinkedList dictionary
        Dictionary dictionary = new DictionaryLinkedList();
        //Dictionary dictionary = new DictionaryTreeSet();
        //Dictionary dictionary = new DictionaryHashSet();
        //Dictionary dictionary = new DictionaryAVLTree();
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 15);

        List<String> expResult = new ArrayList();
        expResult.add("testing");
        expResult.add("besting");
        expResult.add("festing");
        expResult.add("jesting");
        expResult.add("nesting");
        expResult.add("resting");
        expResult.add("vesting");
        expResult.add("westing");
        expResult.add("zesting");
        expResult.add("tasting");
        expResult.add("teeting");
        expResult.add("tenting");
        expResult.add("festing");
        expResult.add("jesting");
        expResult.add("nesting");


        assertEquals(expResult, result);
    }

    @Test
    public void testGetSuggestionsUpdated() {
        System.out.println("getSuggestions");

        String word = "testinh";

        //Test with LinkedList dictionary
        Dictionary dictionary = new DictionaryLinkedList();
        //Dictionary dictionary = new DictionaryTreeSet();
        //Dictionary dictionary = new DictionaryHashSet();
        //Dictionary dictionary = new DictionaryAVLTree();
        SpellingSuggester spellingSuggester = new SpellingSuggester(dictionary);
        List<String> result = spellingSuggester.getSuggestions(word, 15);

        List<String> expResult = new ArrayList();
        expResult.add("testing");
        expResult.add("besting");
        expResult.add("festing");
        expResult.add("jesting");
        expResult.add("nesting");
        expResult.add("resting");
        expResult.add("vesting");
        expResult.add("westing");
        expResult.add("zesting");
        expResult.add("tasting");
        expResult.add("teeting");
        expResult.add("tenting");
        expResult.add("basting");
        expResult.add("busting");
        expResult.add("beating");


        assertEquals(expResult, result);
    }
}
