package src;

import java.util.ArrayList;
import java.util.HashMap;

public class PairsTesting {
    // private Words pairs;
    private ArrayList<String> words;
    private ArrayList<String> inputArray;
    private HashMap<String, ArrayList<String>> combos;
    private HashMap<String, ArrayList<String>> nextPairs;

    public PairsTesting() {
        // this.pairs = new Words();
        this.words = new ArrayList<String>();
    }

    public void getPairs(ArrayList<String> inputArr) {
        inputArray = inputArr;
        getWords();
        getCombos();
        getNextPairs();
        for (String word : words) {
            int comboSize = combos.get(word).size();
            int nextSize = nextPairs.get(word).size();
            String comboMatch = replaceSqBracks(combos.get(word).toString());
            String nextMatch = replaceSqBracks(nextPairs.get(word).toString());
            System.out.println(word + ": " + comboSize + " combo-pairs " + comboMatch + " AND " + nextSize
                    + " next-to-pairs " + nextMatch);

        }

    }

    private String replaceSqBracks(String string) {
        return string.replace("[", "").replace("]", "");
    }

    public void getWords() {
        for (String string : inputArray) {
            if (!words.contains(string)) {
                words.add(string);
            }

        }
    }

    private void getNextPairs() {
        String word;
        nextPairs = new HashMap<String, ArrayList<String>>();
        ArrayList<String> matches = new ArrayList<String>();

        for (int index = 0; index < inputArray.size() - 1; index++) {

            word = inputArray.get(index);
            if (!nextPairs.containsKey(word)) {
                matches = new ArrayList<String>();
                nextPairs.put(word, matches);

            } else {
                if (!((nextPairs.get(word).size()) == 0)) {
                    matches = nextPairs.get(word);
                } else {
                    matches = new ArrayList<String>();
                }
            }

            if (word.equalsIgnoreCase(inputArray.get(index + 1))) {
                matches.add("(" + index + "," + (index + 1) + ")");

            }

            nextPairs.put(word, matches);

        }

        // for (String i : nextPairs.keySet()) {
        // System.out.println(i + ": " + nextPairs.get(i));
        // }
    }

    private void getCombos() {

        int counter = 0;
        String word;
        combos = new HashMap<String, ArrayList<String>>();
        ArrayList<String> matches = new ArrayList<String>();

        for (int index = 0; index < inputArray.size() - 1; index++) {
            word = inputArray.get(index);
            if (!combos.containsKey(word)) {
                matches = new ArrayList<String>();
                combos.put(word, matches);

            } else {
                if (!((combos.get(word).size()) == 0)) {
                    matches = combos.get(word);
                } else {
                    matches = new ArrayList<String>();
                }
            }

            for (int i = index + 1; i < inputArray.size(); i++) {
                if (word.equalsIgnoreCase(inputArray.get(i))) {
                    matches.add("(" + index + "," + i + ")");

                }
            }
            combos.put(word, matches);

        }
        // for (String i : combos.keySet()) {
        // System.out.println(i + ": " + combos.get(i));
        // }

    }

}
