// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ClearPanel extends JPanel implements ActionListener {	// This class establishes the clear, clear recent and the erase/back button.
	private static final long serialVersionUID = 1L;
	JButton backButton, clearButton, clearRecentButton;
	
	// Creating the panel
	
	public ClearPanel() {
		GridBagLayout layout = new GridBagLayout();
		layout.rowHeights = new int[] {30, 0};
		layout.rowWeights = new double[] {0.0, Double.MIN_VALUE};
		layout.columnWidths = new int[] {30, 35, 30, 0};
		layout.columnWeights = new double[] {0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(layout);
		
		backButton = new JButton("<-");
		backButton.addActionListener(this);
		backButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_backButton = new GridBagConstraints();
		constraints_backButton.gridx = 0;
		constraints_backButton.gridy = 0;
		constraints_backButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_backButton.insets = new Insets(0, 0, 0, 10);
		add(backButton, constraints_backButton);
		
		clearRecentButton = new JButton("CE");
		backButton.addActionListener(this);
		backButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_clearRecentButton = new GridBagConstraints();
		constraints_clearRecentButton.gridx = 1;
		constraints_clearRecentButton.gridy = 0;
		constraints_clearRecentButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_clearRecentButton.insets = new Insets(0, 0, 0, 10);
		add(clearRecentButton, constraints_clearRecentButton);
	
		clearButton = new JButton("C");
		clearButton.addActionListener(this);
		clearButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_clearButton = new GridBagConstraints();
		constraints_clearButton.gridx = 2;
		constraints_clearButton.gridy = 0;
		constraints_clearButton.anchor = GridBagConstraints.NORTHWEST;
		add(clearButton, constraints_clearButton);
	}
	
	// Backend operations for when any of the buttons are clicked by the user.
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == backButton)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText().substring(0,  ProgrammerCalculator.getTextField().getText().length() - 1));
		}
		
		else if(e.getSource() == clearRecentButton)
		{
			ProgrammerCalculator.setFirstNumber(0);
			ProgrammerCalculator.getTextField().setText("");
		}
			
		else if(e.getSource() == clearRecentButton)
		{
			ProgrammerCalculator.getTextField().setText("");
		}
		
	}
}
