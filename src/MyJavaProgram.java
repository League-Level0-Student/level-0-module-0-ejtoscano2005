import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {

	public static void main(String[] args) {

		// START HERE
		
		Robot pickles = new Robot("mini");
		
		
		
		String input = JOptionPane.showInputDialog("What color do you like the most?");
		
		if(input.equalsIgnoreCase("red")){
			pickles.setPenColor(Color.RED);}
		
		if(input.equalsIgnoreCase("blue")){
			pickles.setPenColor(Color.BLUE);}
		
		if(input.equalsIgnoreCase("green")){
			pickles.setPenColor(Color.GREEN);}
		
		if(input.equalsIgnoreCase("yellow")){
			pickles.setPenColor(Color.YELLOW);}
		
		if(input.equalsIgnoreCase("orange")){
			pickles.setPenColor(Color.ORANGE);}
		
		if(input.equalsIgnoreCase("indigo")){
			pickles.setPenColor(75,0,130);}
		
		if(input.equalsIgnoreCase("violet")){
			pickles.setPenColor(238,130,238);}
		
		for (int i = 0; i < 5; i++) {pickles.sparkle();
		pickles.penDown();
		pickles.setSpeed(100);
		pickles.move(150);
		pickles.turn(360/5);
			
		}
	
	}
}
