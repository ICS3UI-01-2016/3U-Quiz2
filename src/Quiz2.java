/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Dhana Anvic Fabelena!!!!
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot kris = new Robot(kw, 1, 1, Direction.WEST);
        
        //goal is to move kris to the end of the wall
        while (!kris.frontIsClear()){
            kris.turnLeft();
            kris.move();
            if(kris.frontIsClear()){
            kris.turnLeft();
            kris.turnLeft();
            kris.turnLeft();
            
                        
            }
            
            
 
 
            
        }
    }
}




    
    
       
    
    

