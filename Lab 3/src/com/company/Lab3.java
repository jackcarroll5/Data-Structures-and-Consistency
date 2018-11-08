package com.company;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler

        List<String> arrList = new ArrayList();
        List<String> linkList = new LinkedList();

        //populate both lists with contents of a data file
        try {   // The name of the file which we will read from
            String filename = "words_alpha.txt"; //file in project folder
            //String filename = "C:\\Users\\t00012345\\Desktop\\words_alpha.txt"; //can have file in any folder

            // Prepare to read from the file, using a Scanner object
            File file = new File(filename);
            Scanner in = new Scanner(file);

            // Read each line until end of file is reached
            while (in.hasNextLine()) {
                // Read one string from the file
                String str = in.nextLine();

                // add str to ArrayList and LinkedList
                arrList.add(str);
                linkList.add(str);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }

        // call testGetForArrayList, testGetForLinkedList,  testInsertForArrayList etc to test get, insert and remove for ArrayList and LinkedList.
        long startTime = System.currentTimeMillis();
        testGetForArrayList(arrList);
        long endTime = System.currentTimeMillis();
        long timeTaken = endTime-startTime;
        System.out.println("time for ArrayList get "+ timeTaken);

        startTime = System.currentTimeMillis();
        testGetForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList get "+ timeTaken);



        startTime = System.currentTimeMillis();
        timeIterateForArrayList(arrList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("\ntime for ArrayList Iterate "+ timeTaken);

        startTime = System.currentTimeMillis();
        timeIterateForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList Iterate "+ timeTaken);



        startTime = System.currentTimeMillis();
        timeInsertForArrayList(arrList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("\ntime for ArrayList Insert "+ timeTaken);

        startTime = System.currentTimeMillis();
        timeInsertForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList Insert "+ timeTaken);



        startTime = System.currentTimeMillis();
        timeRemoveForArrayList(arrList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("\ntime for ArrayList Remove "+ timeTaken);

        startTime = System.currentTimeMillis();
        timeRemoveForLinkedList(linkList);
        endTime = System.currentTimeMillis();
        timeTaken = endTime-startTime;
        System.out.println("time for LinkedList Remove "+ timeTaken);



        string = JOptionPane.showInputDialog("Hit return to continue..."); // for using the profiler
    }

    public static void testGetForArrayList(List list) {
        testGetForList(list);
    }

    public static void testGetForLinkedList(List list) {
        testGetForList(list);
    }

    public static void timeIterateForArrayList(List list) {

        int reps = 1000;
        for(int i = 0; i < reps; i++) {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }
    }

    public static void timeIterateForLinkedList(List list) {

        int reps = 1000;
        for(int i = 0; i < reps; i++) {
            Iterator it = list.iterator();
            while(it.hasNext())
                it.next();
        }
    }

    public static void timeInsertForArrayList(List list) {
        int reps = 1000; //Reps = list.size();
        int half = list.size()/2;
        String s = "test";
        ListIterator it = list.listIterator(half);
        for(int i = 0; i < reps * 10; i++)
            it.add(s);
    }


    public static void timeInsertForLinkedList(List list) {
        int reps = 1000;
        int half = list.size()/2;
        String s = "test";
        ListIterator it = list.listIterator(half);
        for(int i = 0; i < reps * 10; i++)
            it.add(s);
    }

    public static void timeRemoveForArrayList(List list) {
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static void timeRemoveForLinkedList(List list) {
        ListIterator it = list.listIterator(3);
        while(it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static void testGetForList(List list) {
        int reps = 15000;
        for (int i = 0; i < reps; i++) {
// reps is the number of repetitions
// declare reps as something large e.g. 10000
            int quantity = reps / 10;
            for (int j = 0; j < quantity; j++) // declare quantity reps/10
            // depends on your list size
            {
                list.get(j); // list is your list
            }			        // (ArrayList or LinkedList)

        }
    }

}
