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
 * @author devon-law
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot dave = new Robot(kw, 1, 1, Direction.WEST);

        //program solutions coded under here
        //while there's a wall infront
        while (!dave.frontIsClear()) {
            dave.turnLeft();
            dave.move();
            dave.turnLeft();
            dave.turnLeft();
            dave.turnLeft();





        }
    }
}
