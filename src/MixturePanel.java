// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MixturePanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	JButton quotButton, modButton, button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
	
	// Creating the panel
	
	public MixturePanel() 
	{;
		GridBagLayout layout = new GridBagLayout();
		layout.rowHeights = new int[] {30, 0, 0, 0, 0, 0, 0};
		layout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		layout.columnWidths = new int[] {30, 30, 0};
		layout.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(layout);
		
		quotButton = new JButton("Quot");
		quotButton.addActionListener(this);
		quotButton.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		quotButton.setPreferredSize(new Dimension(30, 30));
		
		GridBagConstraints constraints_quotButton = new GridBagConstraints();
		constraints_quotButton.gridx = 0;
		constraints_quotButton.gridy = 0;
		constraints_quotButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_quotButton.insets = new Insets(0, 0, 5, 5);
		add(quotButton, constraints_quotButton);
		
		modButton = new JButton("Mod");
		modButton.addActionListener(this);
		modButton.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		modButton.setPreferredSize(new Dimension(30, 30));
		
		GridBagConstraints constraints_modButton = new GridBagConstraints();
		constraints_modButton.gridx = 1;
		constraints_modButton.gridy = 0;
		constraints_modButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_modButton.insets = new Insets(0, 0, 5, 0);
		add(modButton, constraints_modButton);
		
		button0 = new JButton();
		button0.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button0 = new GridBagConstraints();
		constraints_button0.gridx = 0;
		constraints_button0.gridy = 1;
		constraints_button0.anchor = GridBagConstraints.NORTHWEST;
		constraints_button0.insets = new Insets(0, 0, 5, 5);
		add(button0, constraints_button0);

		button1 = new JButton();
		button1.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button1 = new GridBagConstraints();
		constraints_button1.gridx = 1;
		constraints_button1.gridy = 1;
		constraints_button1.anchor = GridBagConstraints.NORTHWEST;
		constraints_button1.insets = new Insets(0, 0, 5, 0);
		add(button1, constraints_button1);
		
		button2 = new JButton();
		button2.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button2 = new GridBagConstraints();
		constraints_button2.gridx = 0;
		constraints_button2.gridy = 2;
		constraints_button2.anchor = GridBagConstraints.NORTHWEST;
		constraints_button2.insets = new Insets(0, 0, 5, 5);
		add(button2, constraints_button2);
		
		button3 = new JButton();
		button3.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button3 = new GridBagConstraints();
		constraints_button3.gridx = 1;
		constraints_button3.gridy = 2;
		constraints_button3.anchor = GridBagConstraints.NORTHWEST;
		constraints_button3.insets = new Insets(0, 0, 5, 0);
		add(button3, constraints_button3);
		
		button4 = new JButton();
		button4.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button4 = new GridBagConstraints();
		constraints_button4.gridx = 0;
		constraints_button4.gridy = 3;
		constraints_button4.anchor = GridBagConstraints.NORTHWEST;
		constraints_button4.insets = new Insets(0, 0, 5, 5);
		add(button4, constraints_button4);
		
		button5 = new JButton();
		button5.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button5 = new GridBagConstraints();
		constraints_button5.gridx = 1;
		constraints_button5.gridy = 3;
		constraints_button5.anchor = GridBagConstraints.NORTHWEST;
		constraints_button5.insets = new Insets(0, 0, 5, 0);
		add(button5, constraints_button5);
		
		button6 = new JButton();
		button6.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button6 = new GridBagConstraints();
		constraints_button6.gridx = 0;
		constraints_button6.gridy = 4;
		constraints_button6.anchor = GridBagConstraints.NORTHWEST;
		constraints_button6.insets = new Insets(0, 0, 5, 5);
		add(button6, constraints_button6);
		
		button7 = new JButton();
		button7.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button7 = new GridBagConstraints();
		constraints_button7.gridx = 1;
		constraints_button7.gridy = 4;
		constraints_button7.anchor = GridBagConstraints.NORTHWEST;
		constraints_button7.insets = new Insets(0, 0, 5, 0);
		add(button7, constraints_button7);
		
		button8 = new JButton();
		button8.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button8 = new GridBagConstraints();
		constraints_button8.gridx = 0;
		constraints_button8.gridy = 5;
		constraints_button8.anchor = GridBagConstraints.NORTHWEST;
		constraints_button8.insets = new Insets(0, 0, 0, 5);
		add(button8, constraints_button8);
		
		button9 = new JButton();
		button9.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button9 = new GridBagConstraints();
		constraints_button9.gridx = 1;
		constraints_button9.gridy = 5;
		constraints_button9.anchor = GridBagConstraints.NORTHWEST;
		add(button9, constraints_button9);
	}	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == modButton)
		{
			ProgrammerCalculator.setFirstNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
			ProgrammerCalculator.setIsMod(true);
			ProgrammerCalculator.getTextField().setText("");
		}
		
		else if(e.getSource() == quotButton)
		{
			ProgrammerCalculator.setFirstNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
			ProgrammerCalculator.setIsQuot(true);
			ProgrammerCalculator.getTextField().setText("");
		}
	}
	
}
