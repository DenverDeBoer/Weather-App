import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*****************************************************************
* Warning GUI used to display any possible warning such as, 
* floods, blizzards, wild fires, ect.
* 
* @author Brandon Thedorff
* @author Nick Pydyn
* @author Denver DeBoer
* @author Ryan De Jong
* @version Fall 2007
******************************************************************/
public class WarnGUI extends JFrame implements ActionListener {
	/**Contains all the elements to put on the Frame*/
	private JPanel Panel;
	/**Display number and type of warnings*/
	private JLabel heading, Warning1, Warning2, Warning3, Warning4;
	/**Close the window*/
	private JButton closeBut;
	/**Updated from main, contains number of current weather warnings*/
	public int numOfWarnings;
	/** Initializes WeatherData object */ 
	WeatherData data;
	
	/********************************************************
	 *  Creates the GUI for warning if available 
	 * @param d WeatherData object to hold the weather data
	 *******************************************************/
	public WarnGUI(WeatherData d) {
		/** Initializes Data*/
		data = d;
		
		/**Sets title and layout of frame*/
		setTitle("Weather Warnings");
		getContentPane();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/** Creates Panel*/
		Panel = (JPanel) getContentPane();
		Panel.setLayout(null);
		
		numOfWarnings = 0;
		
		/**Displays number of warnings*/
		heading = new JLabel(numOfWarnings + " Weather Warnings");

		/**Displays appropriate number of warnings*/
		if (numOfWarnings == 1) {
			Warning1 = new JLabel("There is a Winter Weather Advisory");
		} else if (numOfWarnings == 2) {
			Warning1 = new JLabel("There is a Winter Weather Advisory");
			Warning2 = new JLabel("There is a Winter Weather Advisory");
		} else if (numOfWarnings == 3) {
			Warning1 = new JLabel("There is a Winter Weather Advisory");
			Warning2 = new JLabel("There is a Winter Weather Advisory");
			Warning3 = new JLabel("There is a Winter Weather Advisory");
		} else if (numOfWarnings == 4) {
			Warning1 = new JLabel("There is a Winter Weather Advisory");
			Warning2 = new JLabel("There is a Winter Weather Advisory");
			Warning3 = new JLabel("There is a Winter Weather Advisory");
			Warning4 = new JLabel("There is a Winter Weather Advisory");		
		} else {
			Warning1 = new JLabel("");
			Warning2 = new JLabel("");
			Warning3 = new JLabel("");
			Warning4 = new JLabel("");
		}
		/**initialize closeBut*/
		closeBut = new JButton("Close");
		closeBut.addActionListener(this);
		closeBut.setBounds(150, 140, 150, 30);
		
		/**Set location and size*/
		heading.setBounds(15, 5, 150, 20);
		Warning1.setBounds(15, 25, 240, 20);
		Warning2.setBounds(15, 40, 240, 20);
		Warning3.setBounds(15, 55, 240, 20);
		Warning4.setBounds(15, 70, 240, 20);
		
		/**Add to panel*/
		Panel.add(heading);
		Panel.add(Warning1);
		Panel.add(Warning2);
		Panel.add(Warning3);
		Panel.add(Warning4);
		Panel.add(closeBut);
		
		setSize(450, 250);
		/**appear in middle of screen*/
		setLocationRelativeTo(null);
		setVisible(true);
	}
	/*************************************************
	 * Action for the close button
	 * @param e the user pressing the exit button
	 ************************************************/
	@Override
	public void actionPerformed(ActionEvent e) {
		/**Close the warning GUI*/
		if (e.getSource() == closeBut) {
			dispose();
		}
	}
}
