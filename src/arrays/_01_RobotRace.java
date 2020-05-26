package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
	Robot[] robots= new Robot [5];
	
	//3. use a for loop to initialize the robots.
	for (int i = 0; i < robots.length; i++) {
		robots [i] = new Robot(150*i+100,540);
		robots [i].setSpeed(10);
		
	}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	Random rand = new Random();
	
	
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	boolean racing = true;
	while (racing ) {
		for (int i = 0; i < robots.length; i++) {
		int speed =rand.nextInt(100);
		robots [i].move(speed);
		if (robots [i].getY()<=100) {
		robots [i].setSpeed(0);
		racing=false;
		robots[i].sparkle();
		
		}
		}
	
		
	}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}