/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.RobotSE;
import java.awt.Color;

/**
 *
 * @author Alex Fita
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall3.txt");
        RobotSE jim = new RobotSE(kw, 1, 1, Direction.WEST);
        //program solutions coded under here
        //Label and set Jim's color
        jim.setColor(Color.blue);
        jim.setLabel("Jim");
        //Make jim run beside the wall
        jim.turnLeft();
        //while loop for while he's beside a wall
        while (jim.isBesideThing(IPredicate.aWall)) {
            jim.move();
        }
        //once at the end he turns right
        jim.turnRight();


    }
}
