/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/**
 *
 * @author schum0689
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall3.txt");
        RobotSE rick = new RobotSE (kw, 1, 1, Direction.WEST);
        
        // program solutions coded under here
       
        // Loop actions and check if you need to move again
        do {
           // Turn to move
           rick.turnLeft();
           // Move
           rick.move();
           // Turn to check for a wall
           rick.turnRight();
        }while(!rick.frontIsClear());
        // If there is no wall, stop
        
        
    }   
}
