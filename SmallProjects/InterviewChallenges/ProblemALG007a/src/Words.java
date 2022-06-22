package src;

import java.util.ArrayList;

public class Words {
    private String word;
    private ArrayList<String> combos;
    private ArrayList<String> next_to_pairs;

    public Words() {
        this.word = "";
        this.combos = new ArrayList<String>();
        this.next_to_pairs = new ArrayList<String>();
    }

}
