
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
	Robot jaames= new Robot();
		

		//3. ask the user what color they would like the robot to draw
		String w=JOptionPane.showInputDialog("tell me what color do you want(has to be an actual color)");
		//4. use an if/else statement to set the pen color that the user requested
		  if(w.equals("blue")){
			  jaames.penDown();
			  jaames.move(100);
			  jaames.turn(90);
		  
			  
		  }else if(w.equals("blue")){
			  jaames.setPenColor(Color.BLUE);
				for(int i=0;i<4;i++){
				jaames.penDown();
			jaames.move (100);
		jaames.turn(90);
		  
				}  
		  }else if(w.equals("green")){
			  jaames.setPenColor(Color.green);
				for(int i=0;i<4;i++){
				jaames.penDown();
			jaames.move (100);
		jaames.turn(90);
			  
				 }else if(w.equals("black")){
					  jaames.setPenColor(Color.black);
						for(int i=0;i<4;i++){
						jaames.penDown();
					jaames.move (100);
				jaames.turn(90);
			 
			  
			  
			  
		  }
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)

		for(int i=0;i<4;i++){
		jaames.penDown();
	jaames.move (100);
jaames.turn(90);
	
	
		}
	}
}
}