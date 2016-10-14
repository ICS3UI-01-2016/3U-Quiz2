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

/**
 *
 * @author Tyler.M!!!!
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        RobotSE karl = new RobotSE(kw, 1, 1, Direction.WEST);

        //Make karel go to end of wall
        karl.turnLeft();
        while (karl.isBesideThing(IPredicate.aWall)) {
            karl.move();
            if (!karl.isBesideThing(IPredicate.anyWall)) {
            karl.turnRight();
            
                
            
            }
        }

    }
}
