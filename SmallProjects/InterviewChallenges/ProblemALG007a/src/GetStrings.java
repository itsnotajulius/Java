package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GetStrings {
    private String input;
    private ArrayList<String> inputArray;
    private List<String> anotherList;

    public ArrayList<String> scanText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input String Please:");
        input = sc.nextLine() + " ";
        inputArray = new ArrayList<String>();
        anotherList = Arrays.asList(input.split(" "));
        inputArray.addAll(anotherList);
        return inputArray;

    }

    public GetStrings() {
        this.input = "";
        this.inputArray = new ArrayList<String>();
    }

    public String getInput() {
        return input;
    }

    public ArrayList<String> getInputArray() {
        return inputArray;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setInputArray(ArrayList<String> inputArray) {
        this.inputArray = inputArray;
    }

}
