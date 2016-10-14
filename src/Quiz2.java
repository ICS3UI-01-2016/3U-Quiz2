/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author Feazan Ayyaz
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot dino = new Robot(kw, 1, 1, Direction.WEST);
        
        //program solutions coded under here
        // make robot move if front is clear
       while (dino.frontIsClear()){
           dino.move();
       }    
       // make robot do actions which will allow it to check if there are is a wall furthur down
         while (!dino.frontIsClear()){
             // make robot turn left
               dino.turnLeft();
               dino.move();
               dino.turnLeft();
               dino.turnLeft();
               dino.turnLeft();
           }  
         }
    }

