import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**14/10/2016
 * Quiz 2
 * @author micla1676
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
       //integer to count walls
        int wallnumber = 0;
        
        while(!karel.frontIsClear()){
        //while path is not clear, turn left, move, then turn right.
            //add 1 to wall number
            wallnumber = wallnumber + 1;
            //turn left
            karel.turnLeft();
            //move
            karel.move();
            //turn right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            
        }
        //if path is clear, print the wallnumber, and break out of the loop.  

            //print wallnumber
            System.out.println(wallnumber);

        }
        }
    
    

    
