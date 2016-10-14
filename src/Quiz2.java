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
 * @author Candice Woodall
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);

        //program solutions coded under here
        //check if wall in front
        while (!karel.frontIsClear()) {
            karel.turnLeft();
            karel.move();
            //check if wall on the right
            while (karel.frontIsClear()) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                //make karel stop if no wall in front
                if (karel.frontIsClear()) {
                    break;
                }
            }
        }

    }
}
