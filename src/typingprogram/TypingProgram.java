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
public class TypingProgram {

    private static Scanner input = new Scanner(System.in);
    private static String menu = "Typing Test\n" + "1.Play\n2.Option\n3.ScoreBoard\n4.ShowAllWord\n\n\n0.exit";
    private static int select, selectdifficult;
    private static String ans;

    public static void main(String[] args) {
        TypingGame game = new TypingGame();

        do {
            System.out.println(menu);
            select = input.nextInt();
            switch (select) {
                case 1:

                    System.out.println("Select difficult\n 1.Easy\n 2.Medium\n 3.Hard");
                    selectdifficult = input.nextInt();
                    switch (selectdifficult) {
                        case 1:
                            game.playWordEasy();

                            break;
                        case 2:
                            game.playWordMedium();

                            break;
                        case 3:
                            game.playWordHard();

                            break;
                    }
                    break;
                case 2:
                    game.setTimeout();
                    break;
                case 3:
                    System.out.println(game.getScoreBoard());
                    break;
                case 4:
                    System.out.println(game.showAllWord());
                    break;
            }

        } while (select != 0);
    }

}
