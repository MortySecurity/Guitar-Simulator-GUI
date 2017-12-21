// Fig. 14.34: PaintPanel.java
// Using class MouseMotionAdapter.
package guitar;

import java.awt.*; // importing all of awt so we can use "Image img"
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JPanel;
import javax.swing.*;

public class GuitarPanel extends JPanel {

	// private int pointCount = 0; // count number of points

	private static final long serialVersionUID = 1L;
	Guitar gt = new Guitar();
	// set up GUI and register mouse event handler

	private Image img = new ImageIcon(getClass().getResource("/guitar.jpg")).getImage();
	private int[] y = { 0, 408, 381, 356, 327, 300, 272 }; // coord

	int previousY = 0;
	int currentY = 0;

	public GuitarPanel()

	{
		// handle frame mouse motion event
		addMouseMotionListener(

				new MouseMotionAdapter() // anonymous inner class
				{
					// store drag coordinates and repaint
					public void mouseDragged(MouseEvent event) {

						for (int i = 1; i < 7; i++) {
							if (previousY < y[i] && currentY >= y[i] || previousY > y[i] && currentY <= y[i]) {

								gt.pluck(i);
								previousY = y[i]; // get the past users mouse
													// pos
							}

							currentY = event.getY(); // get the current mouse
														// pos

						}

					} // end method mouseDragged
				} // end anonymous inner class
		); // end call to addMouseMotionListener
	} // end PaintPanel constructor

	// draw ovals in a 4-by-4 bounding box at specified locations on window
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // clears drawing area

		g.drawImage(img, 0, 0, null);
	} // end method paintComponent
} // end class PaintPanel

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
