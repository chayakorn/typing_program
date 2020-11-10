/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingprogram;

import java.util.Scanner;

/**
 *
 * @author Chayakorn
 */
public class TypingGame {

    private Player player;
    private long time;
    private StockWord stockword = new StockWord();
    private Scanner input = new Scanner(System.in);
    private int points;
    private long playtime = 0;
    private Historyplay history = new Historyplay(0);

    public TypingGame() {
        player = new Player();

    }

    public void playWordEasy() {
        System.out.println("Input Your Name: \n");
        String playerName=playerSetname();
        time = System.currentTimeMillis();
        String[] word = stockword.getWordEasy();
        String wordIn = word[(int) (Math.random() * word.length)];
        long timeout;
        if(playtime<=0)
            playtime = 60000;
        do {
            System.out.println("TYPING ALL THIS");
            System.out.println("\n\n\n\n\n");
            System.out.println(wordIn);
            String ans = input.next();
            if (ans.equals(wordIn)) {
                points++;
                wordIn = word[(int) (Math.random() * word.length)];

            }
            timeout = System.currentTimeMillis();
            System.out.println("\n\n\n\n\n");

        } while (timeout - time <= playtime);
        System.out.println("Your Score: "+points);
        player.setPoints(points);
        history.append(new History(playerName,points));

    }
    public void playWordMedium() {
        System.out.println("Input Your Name: \n");
        String playerName=playerSetname();
        time = System.currentTimeMillis();
        String[] word = stockword.getWordMedium();
        String wordIn = word[(int) (Math.random() * word.length)];
        long timeout;
        if(playtime<=0)
            playtime = 60000;
        do {
            System.out.println("TYPING ALL THIS");
            System.out.println("\n\n\n\n\n");
            System.out.println(wordIn);
            String ans = input.next();
            if (ans.equals(wordIn)) {
                points++;
                wordIn = word[(int) (Math.random() * word.length)];

            }
            timeout = System.currentTimeMillis();
            System.out.println("\n\n\n\n\n");

        } while (timeout - time <= playtime);
        System.out.println("Your Score: "+points);
        player.setPoints(points);
        history.append(new History(playerName,points));

    }
    public void playWordHard() {
        System.out.println("Input Your Name: \n");
        String playerName =playerSetname();
        time = System.currentTimeMillis();
        String[] word = stockword.getWordHard();
        String wordIn = word[(int) (Math.random() * word.length)];
        long timeout;
        if(playtime<=0)
            playtime = 60000;
        do {
            System.out.println("TYPING ALL THIS");
            System.out.println("\n\n\n\n\n");
            System.out.println(wordIn);
            String ans = input.next();
            if (ans.equals(wordIn)) {
                points++;
                wordIn = word[(int) (Math.random() * word.length)];

            }
            timeout = System.currentTimeMillis();
            System.out.println("\n\n\n\n\n");

        } while (timeout - time <= playtime);
        System.out.println("Your Score: "+points);
        player.setPoints(points);
        history.append(new History(playerName,points));

    }
    

    public void setTimeout() {
        System.out.println("Input Timeout(second): ");
        this.playtime=input.nextLong()*1000;
        
    }
    public StockWord showAllWord(){
        return stockword;
    }
    public String playerSetname(){
        player.setName(input.next());
        return player.getName();
    }
    public Historyplay getScoreBoard(){
        return history;
    }

}
