import java.awt.Color; 
import javax.swing.JFrame;

public class ProgrammerCalculatorTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProgrammerCalculator ui = new ProgrammerCalculator();
		
		// Setting the window size of our calculator
		ui.setSize(500, 500);
		
		// This will make our window visible
		ProgrammerCalculator.setIsVisible(true);
		ui.setVisible(ProgrammerCalculator.getIsVisible());
		
		// Setting title of the window to "Programmer Calculator"
		ui.setTitle("Programmer Calculator");
		ui.setBackground(new Color(104, 131, 153));
		
		// Terminating the application once the quit button is clicked upon
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
