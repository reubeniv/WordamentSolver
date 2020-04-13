package com.reubeniv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Scanner;

public class DictionaryService {
    private List<String> dictionary;

    public DictionaryService(String fileName){
        dictionary = new ArrayList<>();
        setDictionary(fileName);
    }

    private void setDictionary(String fileName){
        try {
            File dictionaryFile = new File(fileName);
            Scanner myReader = new Scanner(dictionaryFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dictionary.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public List<String> getDictionary(){
        return dictionary;
    }
}
