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
public class Historyplay {

    private History[] Allplayer;
    private int count = 0;

    public Historyplay(int size) {
        this.Allplayer = new History[size > 0 ? size : 100];
    }

    public Historyplay append(History player) {
        if (count < Allplayer.length) {
            Allplayer[count++] = player;
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        String i = "****Score Board****\n";
        for(int j = 0;j<count;j++){
            i += "\n"+Allplayer[j];
        }
        return i;
    }
    
    

}
