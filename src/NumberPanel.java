// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JPanel;

public class NumberPanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonDecimal;
	
	// The NumberPanel class creates all the buttons for inputting the digits.
	
	public NumberPanel(){
		GridBagLayout layout = new GridBagLayout();
		layout.rowHeights = new int[] {30, 0, 0, 0, 0};
		layout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		layout.columnWidths = new int[] {30, 35, 30, 0};
		layout.columnWeights = new double[] {0.0, 0.0, 0.0, Double.MIN_VALUE};
		
		setLayout(layout);
		
		button7 = new JButton("7");
		button7.addActionListener(this);
		button7.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button7 = new GridBagConstraints();
		constraints_button7.gridx = 0;
		constraints_button7.gridy = 0;
		constraints_button7.anchor = GridBagConstraints.NORTHWEST;
		constraints_button7.insets = new Insets(0, 0, 5, 5);
		add(button7, constraints_button7);
		
		button8 = new JButton("8");
		button8.addActionListener(this);
		button8.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button8 = new GridBagConstraints();
		constraints_button8.gridx = 1;
		constraints_button8.gridy = 0;
		constraints_button8.anchor = GridBagConstraints.NORTH;
		constraints_button8.insets = new Insets(0, 0, 5, 5);
		add(button8, constraints_button8);
		
		button9 = new JButton("9");
		button9.addActionListener(this);
		button9.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button9 = new GridBagConstraints();
		constraints_button9.gridx = 2;
		constraints_button9.gridy = 0;
		constraints_button9.anchor = GridBagConstraints.NORTHWEST;
		constraints_button9.insets = new Insets(0, 0, 5, 0);
		add(button9, constraints_button9);
		
		button4 = new JButton("4");
		button4.addActionListener(this);
		button4.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button4 = new GridBagConstraints();
		constraints_button4.gridx = 0;
		constraints_button4.gridy = 1;
		constraints_button4.anchor = GridBagConstraints.NORTHWEST;
		constraints_button4.insets = new Insets(0, 0, 5, 5);
		add(button4, constraints_button4);
		
		button5 = new JButton("5");
		button5.addActionListener(this);
		button5.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button5 = new GridBagConstraints();
		constraints_button5.gridx = 1;
		constraints_button5.gridy = 1;
		constraints_button5.anchor = GridBagConstraints.NORTH;
		constraints_button5.insets = new Insets(0, 0, 5, 5);
		add(button5, constraints_button5);
		
		button6 = new JButton("6");
		button6.addActionListener(this);
		button6.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button6 = new GridBagConstraints();
		constraints_button6.gridx = 2;
		constraints_button6.gridy = 1;
		constraints_button6.anchor = GridBagConstraints.NORTHWEST;
		constraints_button6.insets = new Insets(0, 0, 5, 0);
		add(button6, constraints_button6);
		
		button1 = new JButton("1");
		button1.addActionListener(this);
		button1.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button1 = new GridBagConstraints();
		constraints_button1.gridx = 0;
		constraints_button1.gridy = 2;
		constraints_button1.anchor = GridBagConstraints.NORTHWEST;
		constraints_button1.insets = new Insets(0, 0, 5, 5);
		add(button1, constraints_button1);
		
		button2 = new JButton("2");
		button2.addActionListener(this);
		button2.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button2 = new GridBagConstraints();
		constraints_button2.gridx = 1;
		constraints_button2.gridy = 2;
		constraints_button2.anchor = GridBagConstraints.NORTH;
		constraints_button2.insets = new Insets(0, 0, 5, 5);
		add(button2, constraints_button2);
		
		button3 = new JButton("3");
		button3.addActionListener(this);
		button3.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button3 = new GridBagConstraints();
		constraints_button3.gridx = 2;
		constraints_button3.gridy = 2;
		constraints_button3.anchor = GridBagConstraints.NORTHWEST;
		constraints_button3.insets = new Insets(0, 0, 5, 0);
		add(button3, constraints_button3);
		
		button0 = new JButton("0");
		button0.addActionListener(this);
		button0.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_button0 = new GridBagConstraints();
		constraints_button0.gridx = 0;
		constraints_button0.gridy = 3;
		constraints_button0.fill = GridBagConstraints.BOTH;
		constraints_button0.gridwidth = 2;
		constraints_button0.insets = new Insets(0, 0, 0, 5);
		add(button0, constraints_button0);
		
		buttonDecimal = new JButton(".");
		buttonDecimal.addActionListener(this);
		buttonDecimal.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_buttonDecimal = new GridBagConstraints();
		constraints_buttonDecimal.gridx = 2;
		constraints_buttonDecimal.gridy = 3;
		constraints_buttonDecimal.anchor = GridBagConstraints.NORTHWEST;
		add(buttonDecimal, constraints_buttonDecimal);
	
	}
		
		// Creating mutator and accessor methods 
		public static JButton getButtonDecimal() {
			return buttonDecimal;
		}
		
		public static JButton getButton0() {
			return button0;
		}
		
		public static JButton getButton1() {
			return button1;
		}
		
		public static JButton getButton2() {
			return button2;
		}
		
		public static JButton getButton3() {
			return button3;
		}
		
		public static JButton getButton4() {
			return button4;
		}
		
		public static JButton getButton5() {
			return button5;
		}
		
		public static JButton getButton6() {
			return button6;
		}
		
		public static JButton getButton7() {
			return button7;
		}
		
		public static JButton getButton8() {
			return button8;
		}
		
		public static JButton getButton9() {
			return button9;
		}
		
		// The backend operations that commence once the user inputs a digit.
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button0)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "0");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("0");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}
			}
			
			else if(e.getSource() == button1)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "1");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("1");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button2)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "2");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("2");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button3)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "3");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("3");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button4)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "4");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("4");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button5)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "5");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("5");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button6)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "6");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("6");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button7)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "7");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("7");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button8)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "8");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("8");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == button9)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "9");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText("9");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
			
			else if(e.getSource() == buttonDecimal)
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + ".");
				
				if(ProgrammerCalculator.getResult() != 0)
				{
					ProgrammerCalculator.getTextField().setText(".");
					OperationPanel.setIsAdd(false);
					OperationPanel.setIsSubtract(false);
					OperationPanel.setIsMultiply(false);
					OperationPanel.setIsDivide(false);
					ProgrammerCalculator.setResults(0);
				}	
			}
	}
}
