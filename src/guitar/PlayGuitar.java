/**
* The Guitar simulator program implements a GUI using JFrame
* 
* The output would a frame at the center of the user's screen with an interactive picture of a guitar
*
* @author  Mourtadah Karim
* @version 1.0
* @since   2017 - 12 - 20
*/

// Fig. 14.34: Painter.java

// Testing PaintPanel.
package guitar;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayGuitar {
	public static void main(String[] args) {

		int x = 1024;
		int y = 680;
		// create JFrame
		JFrame application = new JFrame("Guitar Simulator");

		GuitarPanel paintPanel = new GuitarPanel(); // create paint panel
		application.add(paintPanel, BorderLayout.CENTER); // in center

		// create a label and place it in SOUTH of BorderLayout
		application.add(new JLabel("Drag the mouse to play"), BorderLayout.SOUTH);

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * 
		 */
		application.setSize(x, y); // set frame size
		application.setResizable(false); // I dont want the user to resize the
											// program
		application.setLocationRelativeTo(null); // Center the program
		application.setVisible(true); // display frame

	} // end main
} // end class Painter

/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and * Pearson Education,
 * Inc. All Rights Reserved. * * DISCLAIMER: The authors and publisher of this
 * book have used their * best efforts in preparing the book. These efforts
 * include the * development, research, and testing of the theories and programs
 * * to determine their effectiveness. The authors and publisher make * no
 * warranty of any kind, expressed or implied, with regard to these * programs
 * or to the documentation contained in these books. The authors * and publisher
 * shall not be liable in any event for incidental or * consequential damages in
 * connection with, or arising out of, the * furnishing, performance, or use of
 * these programs. *
 *************************************************************************/
