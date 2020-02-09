package spelling;

import gui.TextEditorFrame;
import org.junit.jupiter.api.Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import spelling.Dictionary;
import spelling.SpellChecker;
import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest extends JFrame {

    private JTextArea textArea;
    private Dictionary dictionary;
    private static final int TEXT_AREA_ROWS = 10;
    private static final int TEXT_AREA_COLUMNS = 50;

 public void SpellChecker(Dictionary dictionary)
    {
        this.dictionary = dictionary;

        setTitle("Spelling Checker Application");
        textArea = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLUMNS);
        textArea.setEditable(true);  // textArea can be edited

        JScrollPane scrollPane = new JScrollPane(textArea);
        JPanel panel = new JPanel(new GridLayout(1, 2)); // to allow 2 buttons
        getContentPane().add(scrollPane, "Center");
        getContentPane().add(panel, "South");
        pack();
    }

    private class MyWindowListener implements WindowListener {
        @Override
        public void windowOpened(WindowEvent e) {
        }

        @Override
        public void windowClosing(WindowEvent e) {
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("ending");
            System.exit(0);
        }

        @Override
        public void windowIconified(WindowEvent e) {
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
        }

        @Override
        public void windowActivated(WindowEvent e) {
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
        }
    }

    @Test
    void doSpellCheckArrayList() {
        dictionary = new DictionaryArrayList();
        List<String> wordsMissspelt;
        List<String> expResult;
        SpellChecker(dictionary);

        try {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                        fileChooser.getSelectedFile().getName());
            }

            File inputFile = fileChooser.getSelectedFile();
            Scanner in = new Scanner(inputFile);
            String line;

            textArea.setText(" ");
            while (in.hasNextLine())
            {
                line = in.nextLine();
                textArea.append(line);
                textArea.append("\n");
                System.out.println(line);
            }

            String text = textArea.getText();
            SpellChecker spellChecker = new SpellChecker(dictionary);
            wordsMissspelt = spellChecker.doSpellCheck(text);

            System.out.println("\nMisspellings:");
            System.out.println(wordsMissspelt);
            assertEquals(wordsMissspelt,wordsMissspelt);
        }
        catch (FileNotFoundException exc) {
            System.out.println("File not found");
            exc.printStackTrace();
            System.exit(1);
        }
    }

    @Test
    void doSpellCheckLinkedList() {
        dictionary = new DictionaryLinkedList();
        List<String> wordsMissspelt;
        SpellChecker(dictionary);

        try {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                        fileChooser.getSelectedFile().getName());
            }

            File inputFile = fileChooser.getSelectedFile();
            Scanner in = new Scanner(inputFile);
            String line;

            textArea.setText(" ");
            while (in.hasNextLine())
            {
                line = in.nextLine();
                textArea.append(line);
                textArea.append("\n");
                System.out.println(line);
            }

            String text = textArea.getText();
            SpellChecker spellChecker = new SpellChecker(dictionary);
            wordsMissspelt = spellChecker.doSpellCheck(text);

            System.out.println("\nMisspellings:");
            System.out.println(wordsMissspelt);
            assertEquals(wordsMissspelt,wordsMissspelt);
        }
        catch (FileNotFoundException exc) {
            System.out.println("File not found");
            exc.printStackTrace();
            System.exit(1);
        }
    }



    @Test
    void doSpellCheckAVLTree() {
        dictionary = new DictionaryAVLTree();
        List<String> wordsMissspelt;
        SpellChecker(dictionary);

        try {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                        fileChooser.getSelectedFile().getName());
            }

            File inputFile = fileChooser.getSelectedFile();
            Scanner in = new Scanner(inputFile);
            String line;

            textArea.setText(" ");
            while (in.hasNextLine())
            {
                line = in.nextLine();
                textArea.append(line);
                textArea.append("\n");
                System.out.println(line);
            }

            String text = textArea.getText();
            SpellChecker spellChecker = new SpellChecker(dictionary);
            wordsMissspelt = spellChecker.doSpellCheck(text);

            System.out.println("\nMisspellings:");
            System.out.println(wordsMissspelt);
            assertEquals(wordsMissspelt,wordsMissspelt);
        }
        catch (FileNotFoundException exc) {
            System.out.println("File not found");
            exc.printStackTrace();
            System.exit(1);
        }
    }



    @Test
    void doSpellCheckTreeSet() {
        dictionary = new DictionaryTreeSet();
        List<String> wordsMissspelt;
        SpellChecker(dictionary);

        try {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                System.out.println("You chose to open this file: " +
                        fileChooser.getSelectedFile().getName());
            }

            File inputFile = fileChooser.getSelectedFile();
            Scanner in = new Scanner(inputFile);
            String line;

            textArea.setText(" ");
            while (in.hasNextLine())
            {
                line = in.nextLine();
                textArea.append(line);
                textArea.append("\n");
                System.out.println(line);
            }

            String text = textArea.getText();
            SpellChecker spellChecker = new SpellChecker(dictionary);
            wordsMissspelt = spellChecker.doSpellCheck(text);

            System.out.println("\nMisspellings:");
            System.out.println(wordsMissspelt);
            assertEquals(wordsMissspelt,wordsMissspelt);

        }
        catch (FileNotFoundException exc) {
            System.out.println("File not found");
            exc.printStackTrace();
            System.exit(1);
        }
    }







}