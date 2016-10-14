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
 * @author mmanok5757
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall3.txt");
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.WEST);

        //program solutions coded under here
        // make karel check if there is a wall if fron of him
        while (!karel.frontIsClear()) {
            // if there is a wall, make karel turn left
            karel.turnLeft();
            // make karel move once to next street
            karel.move();
            // make him check if there is a wall to his right
            karel.turnRight();
        }
    }
}
