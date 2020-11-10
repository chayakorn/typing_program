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
public class Player {
    private String name;
    private int points;
    
    public Player(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPoints(){
        return points;
    }
    public void setPoints(int points){
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", points=" + points + '}';
    }
    
        
    
    
}
