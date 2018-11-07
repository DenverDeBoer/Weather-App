import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class DailyGUI extends JFrame implements ActionListener
{
	JButton checkDaily;
	JButton checkWeekly;
	JButton search;
	
	JLabel location;
	JLabel currentTemp;
	JLabel highlowTemp;
	JLabel currentForecast;
	JLabel dailyForecast;
	JLabel humidity;
	JLabel windspeed;
	JLabel feelsLike;
	
	public static void main(String[] args) {
		DailyGUI gui = new DailyGUI();
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setTitle("Daily Weather");
		gui.pack();
		gui.setVisible(true);
	}
	
	public DailyGUI() {
		setLayout(new GridBagLayout());
		GridBagConstraints position = new GridBagConstraints();
		position.insets.left = 20;
		position.insets.right = 20;
		position.insets.bottom = 20;
		
		//checkDaily Button
		checkDaily = new JButton("Check Daily");
		position.gridx = 0;
		position.gridy = 2;
		add(checkDaily, position);
		
		//checkWeekly Button
		checkWeekly = new JButton("Check Weekly");
		position.gridx = 0;
		position.gridy = 4;
		add(checkWeekly, position);
		
		//search Button
		search = new JButton("Search");
		position.gridx = 0;
		position.gridy = 6;
		add(search, position);
		
		//location Label
		location = new JLabel("Location");
		position.gridx = 1;
		position.gridy = 0;
		add(location, position);
		
		//currentTemp Label
		currentTemp = new JLabel("Current Temp");
		position.gridx = 1;
		position.gridy = 2;
		add(currentTemp, position);
		
		//highTemp Label
		highlowTemp = new JLabel("High / Low");
		position.gridx = 2;
		position.gridy = 2;
		add(highlowTemp, position);
		
		//currentForecast Label
		currentForecast = new JLabel("Current Forecast");
		position.gridx = 3;
		position.gridy = 2;
		add(currentForecast, position);
		
		//dailyForecast Label
		dailyForecast = new JLabel("Daily Forecast");
		position.gridx = 1;
		position.gridy = 4;
		add(dailyForecast, position);
		
		//humidity Label
		humidity = new JLabel("Humidity");
		position.gridx = 2;
		position.gridy = 4;
		add(humidity, position);
		
		//windspeed Label
		windspeed = new JLabel("Windspeed");
		position.gridx = 3;
		position.gridy = 4;
		add(windspeed, position);
		
		//feelsLike Label
		feelsLike = new JLabel("Feels Like");
		position.gridx = 1;
		position.gridy = 6;
		add(feelsLike, position);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {		
	}
}
