package src;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        GetStrings gs = new GetStrings();
        PairsTesting pt = new PairsTesting();
        pt.getPairs(gs.scanText());

    }
}
