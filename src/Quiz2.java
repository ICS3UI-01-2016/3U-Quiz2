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
 * @author Beshoy Awad
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.WEST);

        //program solutions coded under here

        //make karel check the left wall everytime while he is moving
        while (!karel.frontIsClear()) {
            karel.turnLeft();
            karel.move();
            karel.turnRight();
        }
    }
}
