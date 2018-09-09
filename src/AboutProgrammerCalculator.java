// Name: Hritik Panchasara 
// netID: hhp160130

import java.awt.BorderLayout; 
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class AboutProgrammerCalculator extends JFrame{
	
	private static final long serialVersionUID = 1L;	// The serialization runtime associates with each serializable class a version number,
														// called a serialVersionUID, which is used during deserialization to verify that the sender and receiver 
														// of a serialized object have loaded classes for that object that are compatible with respect to 
														// serialization. If the receiver has loaded a class for the object that has a different serialVersionUID
														// than that of the corresponding sender's class, then deserialization will result in an InvalidClassException
				
	private JPanel content_pane;
	
	// This class sets the description for our project in the About section of the menu overlay.
	
	public AboutProgrammerCalculator() {
		setBounds(100, 100, 450, 350);
		content_pane = new JPanel();
		content_pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		content_pane.setLayout(new BorderLayout(0, 0));
		setContentPane(content_pane);
		
		JLabel ClientDescription = new JLabel("About Calculator");

		ClientDescription.setFont(new Font ("Segoe UI", Font.PLAIN, 30));
		ClientDescription.setHorizontalAlignment(SwingConstants.CENTER);
		
		content_pane.add(ClientDescription, BorderLayout.NORTH);
		
		JLabel ClientDescription2 = new JLabel("A replica of the Windows 10 calculator application with the Programmer feature being executed.");
		ClientDescription.setHorizontalAlignment(SwingConstants.CENTER);
		
		content_pane.add(ClientDescription2, BorderLayout.CENTER);
	}
}
