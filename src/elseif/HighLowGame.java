//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		Random random = new Random();
		int x =    random.nextInt(100)+1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 54; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String w=   JOptionPane.showInputDialog(null, "pick a number through 1-100");
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				int f= Integer.parseInt(w);
				if (f==x) {
				// 5. if the
					JOptionPane.showMessageDialog(null, "YOU HAVE WON THE GAME!!!!");
					System.exit(0);
				}
				// 7. if the guess is high
					// 8. tell them it's too high
				if (f>x) {
					JOptionPane.showMessageDialog(null, "your getting too high ");
				}
				// 9. if the guess is low
					// 10. tell them it's too low
				if (f<x) {
					JOptionPane.showMessageDialog(null, "your getting too little");
				}
			// 12. tell them they lose

		}
		
		JOptionPane.showMessageDialog(null, "MAN, you suck at this!");
}
}

