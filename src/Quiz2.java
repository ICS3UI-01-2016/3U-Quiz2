/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;

/**
 *
 * @author YOUR_NAME_HERE!!!!
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall2.txt");
        Robot karel = new Robot(kw, 1, 1, Direction.WEST);
        
        //program solutions coded under here
        if (karel.frontIsClear()){
        }else{
            karel.turnLeft();
        } 
       while(karel.isBesideThing(IPredicate.aWall)){
           karel.move();
           
           }
       }
    }
    

