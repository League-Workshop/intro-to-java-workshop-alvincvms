package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot wallE = new Robot();
	wallE.penDown();
	wallE.setSpeed(1000);
	for (int c = 0; c > -1; c++) {
		wallE.move(c);
		wallE.turn(90);
	}



	}
}
