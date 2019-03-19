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

        // etc
         
        assertEquals(expResult, result);
        
        //Test with TreeSet dictionary
        /*Dictionary dic = new DictionaryLinkedList();
        SpellingSuggester spellingSugg = new SpellingSuggester(dic);
        List<String> res = spellingSugg.getSuggestions(word, 10);

        List<String> expRes = new ArrayList();
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
        // etc

        assertEquals(expRes, res);
        
        //Test with HashSet dictionary
        Dictionary diction = new DictionaryLinkedList();
        SpellingSuggester spellingSuggest = new SpellingSuggester(diction);
        List<String> resultActual = spellingSuggest.getSuggestions(word, 10);

        List<String> expectResult = new ArrayList();
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
        // etc

        assertEquals(expectResult, resultActual);*/

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
