package com.reubeniv;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DictionaryService dictionaryService = new DictionaryService("./src/usa.txt");
        List<String> dictionary = dictionaryService.getDictionary();

        // take input
        String[] grid = UserInputService.getGrid();

        // build list of words (bfs)

        // find in library
    }
}
