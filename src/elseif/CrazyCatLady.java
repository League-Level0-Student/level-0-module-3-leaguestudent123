//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String w = JOptionPane.showInputDialog(null,"Aye, how many cats do yo have?");
		// 2. Convert their answer into an int
int f= Integer.parseInt(w);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
 		if (f>3) {
 			JOptionPane.showMessageDialog(null,"YOU CRAZY CAT LADY!!");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
 		if (f<=3) {
 			playVideo("https://www.youtube.com/watch?v=9sxMr4IdXaU");
		}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
 		if (f==0) {
 			playVideo("https://www.youtube.com/watch?v=J0klxZ__W3c");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

