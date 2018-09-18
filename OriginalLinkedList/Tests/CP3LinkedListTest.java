import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class CP3LinkedListTest {

    CP3LinkedList<String> namelist = new CP3LinkedList<String>();


    @Test
    void getFirst() {
        CP3LinkedList<String> list = new CP3LinkedList<String>();
      list.addFirst("Gary");
      list.addFirst("Ellie");

     assertEquals("Ellie",list.getFirst());

    }

    @Test
    void addFirst() {
    namelist.addFirst("Jenny");
    }

    @Test
    void removeFirst() {
    namelist.addFirst("Cathy");

     namelist.removeFirst();

    }

    @Test
    void isEmpty() {
   CP3LinkedList<String> list = new CP3LinkedList<String>();
   //Empty List
   assertTrue(list.isEmpty());

   //List with name
   list.addFirst("Mikey");
   assertFalse(list.isEmpty());
    }
}