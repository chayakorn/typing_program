/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingprogram;

/**
 *
 * @author Chayakorn
 */
public class StockWord {

    private String[] wordEasy = {"car", "cat", "raw", "man", "for", "are", "how", "on", "see", "our", "way", "off", "we", "as", "own", "as", "did", "its", "big", "who", "saw", "has", "well", "had", "sea"};
    private String[] wordMedium = {"list", "left", "does", "around", "talk", "song", "than", "until", "well", "mother", "page", "write", "thing", "example", "place", "state", "enough", "this", "play", "second", "while", "year"};
    private String[] wordHard = {"America", "Indian", "IBM", "following", "political", "proposal", "business", "Association", "Stock", "Saturday", "together", "Board", "toward", "credit", "Although", "DOS", "Democratic", "Bank", "figures", "reahed", "package", "Inc", "effect", "reason"};

    public StockWord() {

    }

    public String[] getWordEasy() {
        return wordEasy;
    }

    public String[] getWordMedium() {
        return wordMedium;
    }

    public String[] getWordHard() {
        return wordHard;
    }

    @Override
    public String toString() {
        String j = "All Words\nEasy";
        for (int i = 0; i < wordEasy.length; i++) {
            j += " " + wordEasy[i];
        }
        j += "\nMedium";
        for (int k = 0; k < wordMedium.length; k++) {
            j += " " + wordMedium[k];
        }
        j += "\nHard";
        for (int l = 0; l < wordHard.length; l++) {
            j += " " + wordHard[l];
        }
        return j;
    }

}
