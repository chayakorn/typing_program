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
public class History {
    private int points;
    private String name;
    
    public History(String name,int points){
        this.name = name;
        this.points = points;
        
    }
    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }

    @Override
    public String toString() {
        return "Player: " + name + " Score: " + points;
    }
    
    
    
}
