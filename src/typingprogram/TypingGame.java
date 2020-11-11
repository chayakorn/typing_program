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

    private Player[] player = {new Player()};
    private long time;
    private StockWord stockword = new StockWord();
    private Scanner input = new Scanner(System.in);
    private int points;
    private long playtime = 0;
    private Historyplay history = new Historyplay(0);

    public TypingGame() {

    }

    public void playWordEasy() {
        System.out.println("Input Your Name: \n");
        Player p1 = new Player();
        p1.setName(input.next());
        int playerpoints = 0;

        expandPlayer();

        time = System.currentTimeMillis();
        String[] word = stockword.getWordEasy();
        String wordIn = word[(int) (Math.random() * word.length)];
        long timeout;
        if (playtime <= 0) {
            playtime = 60000;
        }
        do {
            System.out.println("TYPING ALL THIS");
            System.out.println("\n\n\n\n\n");
            System.out.println(wordIn);
            String ans = input.next();
            if (ans.equals(wordIn)) {
                p1.setPoints(playerpoints++);
                wordIn = word[(int) (Math.random() * word.length)];

            }
            timeout = System.currentTimeMillis();
            System.out.println("\n\n\n\n\n");

        } while (timeout - time <= playtime);
        System.out.println("Your Score: " + p1.getPoints());
        history.append(new History(p1.getName(), p1.getPoints()));
        for (int i = 0; i < player.length; i++) {
            if (player[i] == null) {
                player[i] = p1;
            }
        }

    }

    public void playWordMedium() {
        System.out.println("Input Your Name: \n");
        Player p1 = new Player();
        p1.setName(input.next());
        int playerpoints = 0;

        expandPlayer();

        time = System.currentTimeMillis();
        String[] word = stockword.getWordEasy();
        String wordIn = word[(int) (Math.random() * word.length)];
        long timeout;
        if (playtime <= 0) {
            playtime = 60000;
        }
        do {
            System.out.println("TYPING ALL THIS");
            System.out.println("\n\n\n\n\n");
            System.out.println(wordIn);
            String ans = input.next();
            if (ans.equals(wordIn)) {
                p1.setPoints(playerpoints++);
                wordIn = word[(int) (Math.random() * word.length)];

            }
            timeout = System.currentTimeMillis();
            System.out.println("\n\n\n\n\n");

        } while (timeout - time <= playtime);
        System.out.println("Your Score: " + p1.getPoints());
        history.append(new History(p1.getName(), p1.getPoints()));
        for (int i = 0; i < player.length; i++) {
            if (player[i] == null) {
                player[i] = p1;
            }
        }
    }

    public void playWordHard() {
        System.out.println("Input Your Name: \n");
        Player p1 = new Player();
        p1.setName(input.next());
        int playerpoints = 0;

        expandPlayer();

        time = System.currentTimeMillis();
        String[] word = stockword.getWordEasy();
        String wordIn = word[(int) (Math.random() * word.length)];
        long timeout;
        if (playtime <= 0) {
            playtime = 60000;
        }
        do {
            System.out.println("TYPING ALL THIS");
            System.out.println("\n\n\n\n\n");
            System.out.println(wordIn);
            String ans = input.next();
            if (ans.equals(wordIn)) {
                p1.setPoints(playerpoints++);
                wordIn = word[(int) (Math.random() * word.length)];

            }
            timeout = System.currentTimeMillis();
            System.out.println("\n\n\n\n\n");

        } while (timeout - time <= playtime);
        System.out.println("Your Score: " + p1.getPoints());
        history.append(new History(p1.getName(), p1.getPoints()));
        for (int i = 0; i < player.length; i++) {
            if (player[i] == null) {
                player[i] = p1;
            }
        }
    }

    public void setTimeout() {
        System.out.println("Input Timeout(second): ");
        this.playtime = input.nextLong() * 1000;

    }

    public StockWord showAllWord() {
        return stockword;
    }

    public Historyplay getScoreBoard() {
        return history;
    }

    public void expandPlayer() {
        Player[] neoPlayer = new Player[player.length + 1];
        for (int i = 0; i < player.length; i++) {
            neoPlayer[i] = player[i];
        }
        player = neoPlayer;
    }

}
