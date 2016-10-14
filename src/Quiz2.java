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
 * @author petet9087
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall3.txt");
        RobotSE lang = new RobotSE(kw, 1, 1, Direction.WEST);
        //program solutions coded under here
       // get lang to check for the wall and move
        while(!lang.frontIsClear()){
            lang.turnLeft();
            lang.move();
            lang.turnRight();
        }
        
    }
    
}
