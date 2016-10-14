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
 * @author Shezar Khan!!!!
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall3.txt");
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.WEST);

        //get karel to move
        while (!karel.frontIsClear()) {
            karel.turnLeft();
            karel.move();
            karel.turnRight();
        }

    }
}
