package com.reubeniv;

import org.omg.Messaging.SyncScopeHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class UserInputService {
    public static String[] getGrid() {

        String lines = "";
        String[] grid = null;
        Scanner in = new Scanner(System.in);

        boolean gridIsComplete = false;
        while (!gridIsComplete){
            System.out.println("Enter line, squares separated with a ','");
            lines = in.nextLine();
            if(lines.split(",").length == 16){
                gridIsComplete = true;
            } else {
                System.out.println("ERROR - re-enter grid");
            }
        }

        grid = lines.split(",");
        System.out.println(grid[0] + " | " + grid[1] + " | " + grid[2] + " | " + grid[3]);
        System.out.println(grid[4] + " | " + grid[5] + " | " + grid[6] + " | " + grid[7]);
        System.out.println(grid[8] + " | " + grid[9] + " | " + grid[10] + " | " + grid[11]);
        System.out.println(grid[12] + " | " + grid[13] + " | " + grid[14] + " | " + grid[15]);

        return grid;
    }

    public static ArrayList<String> getWordsFromGrid(String[] grid){
        Queue<String> queue;

        // right
        // down
        // left
        // up

        return null;
    }

    private boolean isAWord(String string){
        boolean hasAVowel = false;
        boolean uAfterQ = false;
        boolean notEndInVorJ = false;

        // has a vowel
        hasAVowel = string.matches("[aeiou]");

        // if first letter is 'q' second must be 'u'
        uAfterQ = !string.contains("q"); // true if no q
        // if has q does a u follow?
        if (!uAfterQ) {
            uAfterQ = string.charAt(string.indexOf("q") + 1) == 'u';
        }


        // cannot end in v or j
        notEndInVorJ = (string.charAt(string.length() -1) != 'v') || (string.charAt(string.length() -1) != 'j');

        return (hasAVowel && uAfterQ && notEndInVorJ);
    }
}
