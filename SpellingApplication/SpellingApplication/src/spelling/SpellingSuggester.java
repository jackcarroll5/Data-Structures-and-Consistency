package spelling;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SpellingSuggester {

    private Dictionary dictionary;

    public SpellingSuggester(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getSuggestions(String word, int numSuggestions) {
        System.out.println("Started checking spelling suggestions");

        List<String> listOfSuggestions = new ArrayList();
        boolean finished = false;
        int numOfWordsFound = 0;
        Queue<String> queue = new LinkedList();
        queue.add(word);

        while (!queue.isEmpty() && !finished) {
            String current = queue.remove();
            List<String> list = edits(current);

            int index = 0;
            while (!finished && index < list.size())
            {
                String s = list.get(index);
                index++;
                queue.add(s);
                listOfSuggestions.add(s);
                numOfWordsFound++;

                if (numOfWordsFound == numSuggestions)
                {
                    finished = true;
                }
            }
        }
        return listOfSuggestions;
    }

    public List<String> getSuggestionsUpdated(String word, int numSuggestions) {
        System.out.println("Started checking spelling suggestions");

        Queue<String> queue = new LinkedList();
        List<String> listOfSuggestions = new ArrayList();
        boolean finished = false;
        int numOfWordsFound = 0;
        queue.add(word);

        while (!queue.isEmpty() && !finished) {
            String current = queue.remove();
            List<String> list = edits(current);

            int index = 0;
            while (!finished && index < list.size()) {
                String s = list.get(index);
                index++;
                queue.add(s);
                listOfSuggestions.add(s);
                numOfWordsFound++;

                if (numOfWordsFound == numSuggestions) {
                    finished = true;
                }
            }
        }
        return listOfSuggestions;
    }

    private List<String> edits(String word) {
        List<String> list = new ArrayList();

        // get replacements
        List<String> listReplacemets = replacements(word);
        List<String> listDeletions = deletions(word);
        List<String> listInsertions = insertions(word);

        list.addAll(listReplacemets);
        list.addAll(listDeletions);
        list.addAll(listInsertions);

        return list;
    }

    private List<String> replacements(String word) {
        // All replacements of a letter in word

        List<String> list = new ArrayList();

        for (int i = 0; i < word.length(); i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (word.charAt(i) != c) {
                    String s = word.substring(0, i) + String.valueOf(c) + word.substring(i + 1);
                    if (dictionary.isWord(s)) {
                        list.add(s);
                        System.out.println(s);
                    }
                }
            }
        }
        return list;
    }

    private List<String> deletions(String word) {
        // All deletions of a letter in word
        List<String> list = new ArrayList();

        int length = word.length();

        for (int i = 0; i < length; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                String s = word.substring(0, i) + String.valueOf(c) + word.substring(i + 1,length);
                if (dictionary.isWord(s)) {
                    list.add(s);
                    System.out.println(s);
                }

            }

            if(dictionary.isWord(word.substring(0,length)))
            {
                list.add(word.substring(0,length));
            }
        }
        return list;
    }

    private List<String> insertions(String word) {
        // All insertions of a letter in word

        List<String> list = new ArrayList();

        for (char c = 'a'; c <= 'z'; c++) {
            String front = c + word;
            String back = word + c;

            if (dictionary.isWord(front)) {
                list.add(front);
                System.out.println(front);
            }

            if (dictionary.isWord(back)) {
                list.add(back);
                System.out.println(back);
            }

        }
        return list;
    }
}
