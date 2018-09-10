import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadLListAList {
    public static void main(String[] args) {


        //declare an ArrayList instance
        ArrayList<String> aWords = new ArrayList<String>();

        //declare a LinkedList instance
        LinkedList<String> lWords = new LinkedList<String>();


        //populate both lists with contents of a data file
        try
        {   // The name of the file which we will read from
            String filename = "words_alpha.txt";

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine())
            {
                // Read one string from the file
                String str = in.nextLine();
                // add str to ArrayList and LinkedList

                aWords.add(str);
                lWords.add(str);

            }
        }

        catch (FileNotFoundException e)
        {
            System.out.println("File not found");

        }



// call testGetForArrayList, testGetForLinkedList,
// testInsertForArrayList etc to test get, insert and remove for
// ArrayList and LinkedList.



       // timeGetForArrayList(aWords);

        //timeGetForLinkedList(lWords);



        long cTime = System.currentTimeMillis();
        timeIterateForArrayList(aWords);
        long timeA = System.currentTimeMillis();
        System.out.println("\nTime for iterating ArrayList: " + (timeA - cTime));


        cTime = System.currentTimeMillis();
        timeIterateForLinkedList(lWords);
        timeA = System.currentTimeMillis();
        System.out.println("\nTime for iterating LinkedList: " + (timeA - cTime));

       /* long nowTime = System.currentTimeMillis();
        timeInsertForArrayList(aWords);
        long timeUp = System.currentTimeMillis();
        System.out.println("\nTime for inserting ArrayList: " + (timeUp - nowTime));


        nowTime = System.currentTimeMillis();
        timeInsertForLinkedList(lWords);
        timeUp = System.currentTimeMillis();
        System.out.println("\nTime for inserting LinkedList: " + (timeUp - nowTime));*/


        /*long timeNow = System.currentTimeMillis();
        timeRemoveForArrayList(aWords);
        long timeEnd = System.currentTimeMillis();
        System.out.println("\nTime for inserting item in ArrayList: " + (timeEnd - timeNow));*/


       /* timeNow = System.currentTimeMillis();
        timeRemoveForLinkedList(lWords);
        timeEnd = System.currentTimeMillis();
        System.out.println("\nTime for removing item in LinkedList: " + (timeEnd - timeNow));*/

    }

    //static int reps = 10000;
    //static int quantity = reps / 10;

    /*public static void timeGetForList(List list) {

        int reps = 10000;
        int quantity = reps / 10;

        for (int i = 0; i < reps; i++) {
   // reps is the number of repetitions
    // declare reps as something large e.g. 10000
            for (int j = 0; j < quantity; j++)
                // declare quantity reps/10
                // depends on your list size
                list.get(j); // list is your list
            // (ArrayList or LinkedList)

        }
    }*/

    public static void timeGetForArrayList(ArrayList list) {

        int reps = 10000;
        int quantity = 1000;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < reps; i++) {
            for (int j = 0; j < quantity; j++)
                list.get(j);
        }

        System.out.println("\nTime for getting ArrayList: " + (System.currentTimeMillis() - startTime));
    }

    public static void timeGetForLinkedList(LinkedList list) {

        int reps = 10000;
        int quantity = 1000;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < reps; i++) {
            for (int j = 0; j < quantity; j++)
                list.get(j);
        }
        System.out.println("\nTime for getting LinkedList: " + (System.currentTimeMillis() - startTime));
    }

        /*public static void timeIterateForList(List list) {

            int reps = 10000;
            for(int i = 0; i < reps; i++) {
                Iterator it = list.iterator();
                while(it.hasNext())
                    it.next();
            }
        }*/

    public static void timeIterateForArrayList(ArrayList list) {

        int reps = 10000;
        for(int i = 0; i < reps; i++) {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }
    }

    public static void timeIterateForLinkedList(LinkedList list) {

        int reps = 10000;
        for(int i = 0; i < reps; i++) {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }
    }

        public static void timeInsertForArrayList(ArrayList list) {
           int reps = 10000; //Reps = list.size();
            int half = list.size()/2;
            String s = "test";
            ListIterator it = list.listIterator(half);
            for(int i = 0; i < reps * 10; i++)
                it.add(s);
        }


    public static void timeInsertForLinkedList(LinkedList list) {
        int reps = 10000;
        int half = list.size()/2;
        String s = "test";
        ListIterator it = list.listIterator(half);
        for(int i = 0; i < reps * 10; i++)
            it.add(s);
    }


   /* public static void timeInsertForList(List list) {
        int reps = 10000;
        int half = list.size()/2;
        String s = "test";
        ListIterator it = list.listIterator(half);
        for(int i = 0; i < reps * 10; i++)
            it.add(s);
    }*/

       /* public static void timeRemoveForList(List list) {
            ListIterator it = list.listIterator(3);
            while(it.hasNext()) {
                it.next();
                it.remove();
            }
        }*/

    public static void timeRemoveForArrayList(ArrayList list) {
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static void timeRemoveForLinkedList(LinkedList list) {
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static void testGetArrayList(ArrayList list)
    {
        timeGetForArrayList(list);
    }

    public static void testGetLinkedList(LinkedList list)
    {
       timeGetForLinkedList(list);
    }

    public static void testInsertForArrayList(ArrayList list) {
        timeInsertForArrayList(list);
    }


    public static void testInsertForLinkedList(LinkedList list) {
        timeIterateForLinkedList(list);
    }

    public static void testIterateForArrayList(ArrayList list) {
     timeIterateForArrayList(list);
    }

    public static void testIterateForLinkedList(LinkedList list) {
        timeIterateForLinkedList(list);
    }

    public static void testRemoveForArrayList(ArrayList list) {
       timeRemoveForArrayList(list);
    }

    public static void testRemoveForLinkedList(LinkedList list) {
       timeRemoveForLinkedList(list);
    }

}







