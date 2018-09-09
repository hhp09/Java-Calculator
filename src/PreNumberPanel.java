// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// This class allows us to switch between the different features of a programmer calculator.

public class PreNumberPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	JRadioButton hexadecimalRadioButton, decimalRadioButton, octalRadioButton, binaryRadioButton;
	private static boolean isHexaDecimal, isDecimal, isOctal, isBinary;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public PreNumberPanel() {
		GridBagLayout panelLayout = new GridBagLayout();
		panelLayout.rowHeights = new int[] {25, 0, 0, 0, 0};
		panelLayout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelLayout.columnWidths = new int[] {57, 0};
		panelLayout.columnWeights = new double[] {0.0, Double.MIN_VALUE};
		setLayout(panelLayout);
		
		hexadecimalRadioButton = new JRadioButton("Hex");
		buttonGroup.add(hexadecimalRadioButton);
		hexadecimalRadioButton.addActionListener(this);
		hexadecimalRadioButton.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GridBagConstraints constraints_hdrb = new GridBagConstraints();
		constraints_hdrb.gridx = 0;
		constraints_hdrb.gridy = 0;
		constraints_hdrb.anchor = GridBagConstraints.NORTHWEST;
		constraints_hdrb.insets = new Insets(0, 0, 5, 0);
		add(hexadecimalRadioButton, constraints_hdrb);
		
		decimalRadioButton = new JRadioButton("Dec");
		buttonGroup.add(decimalRadioButton);
		decimalRadioButton.addActionListener(this);
		GridBagConstraints constraints_drb = new GridBagConstraints();
		constraints_drb.gridx = 0;
		constraints_drb.gridy = 1;
		constraints_drb.anchor = GridBagConstraints.NORTHWEST;
		constraints_drb.insets = new Insets(0, 0, 5, 0);
		add(decimalRadioButton, constraints_drb);
		
		octalRadioButton = new JRadioButton("Oct");
		buttonGroup.add(octalRadioButton);
		octalRadioButton.addActionListener(this);
		GridBagConstraints constraints_orb = new GridBagConstraints();
		constraints_orb.gridx = 0;
		constraints_orb.gridy = 1;
		constraints_orb.anchor = GridBagConstraints.NORTHWEST;
		constraints_orb.insets = new Insets(0, 0, 5, 0);
		add(octalRadioButton, constraints_orb);
		
		binaryRadioButton = new JRadioButton("Bin");
		buttonGroup.add(binaryRadioButton);
		binaryRadioButton.addActionListener(this);
		GridBagConstraints constraints_brb = new GridBagConstraints();
		constraints_brb.gridx = 0;
		constraints_brb.gridy = 1;
		constraints_brb.anchor = GridBagConstraints.NORTHWEST;
		add(binaryRadioButton, constraints_brb);
		
		decimalRadioButton.setSelected(true);
		isDecimal = true;
		ProgrammerCalculator.disableButton(LetterPanel.getButtonA());
		ProgrammerCalculator.disableButton(LetterPanel.getButtonB());
		ProgrammerCalculator.disableButton(LetterPanel.getButtonC());
		ProgrammerCalculator.disableButton(LetterPanel.getButtonD());
		ProgrammerCalculator.disableButton(LetterPanel.getButtonE());
		ProgrammerCalculator.disableButton(LetterPanel.getButtonF());		
	}
	
	// Mutator and accessor methods.
	
	public static void setIsHexaDecimal(boolean hexa) {
		isHexaDecimal = hexa;
	}
	
	public static void setIsDecimal(boolean decimal) {
		isDecimal = decimal;
	}
	
	public static void setIsOctal(boolean octal) {
		isOctal = octal;
	}
	
	public static void setIsBinary(boolean binary) {
		isBinary = binary;
	}
	
	public static boolean getIsHexaDecimal() {
		return isHexaDecimal;
	}
	
	public static boolean getIsDecimal() {
		return isDecimal;
	}
	
	public static boolean getIsOctal() {
		return isOctal;
	}
	
	public static boolean getIsBinary() {
		return isBinary;
	} 
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == hexadecimalRadioButton)								// If the hexaDecimalRadioButton is selected, a set of buttons will be made
		{																			// unavailable to the user. 
			ProgrammerCalculator.disableButton(NumberPanel.getButtonDecimal());
			ProgrammerCalculator.enableButton(LetterPanel.getButtonA());
			ProgrammerCalculator.enableButton(LetterPanel.getButtonB());
			ProgrammerCalculator.enableButton(LetterPanel.getButtonC());
			ProgrammerCalculator.enableButton(LetterPanel.getButtonD());
			ProgrammerCalculator.enableButton(LetterPanel.getButtonE());
			ProgrammerCalculator.enableButton(LetterPanel.getButtonF());
			
			ProgrammerCalculator.enableButton(NumberPanel.getButton2());
			ProgrammerCalculator.enableButton(NumberPanel.getButton2());
			ProgrammerCalculator.enableButton(NumberPanel.getButton3());
			ProgrammerCalculator.enableButton(NumberPanel.getButton4());
			ProgrammerCalculator.enableButton(NumberPanel.getButton5());
			ProgrammerCalculator.enableButton(NumberPanel.getButton6());
			ProgrammerCalculator.enableButton(NumberPanel.getButton7());
			ProgrammerCalculator.enableButton(NumberPanel.getButton8());
			ProgrammerCalculator.enableButton(NumberPanel.getButton9());

			if(isBinary)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toHexString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2)).toUpperCase());
				}
				
				catch(NumberFormatException error) {					// Thrown to indicate that the application has attempted to convert a string to one of the numeric types,
					ProgrammerCalculator.getTextField().setText("");	//  but that the string does not have the appropriate format.
				}
			}
			
			else if(isDecimal)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toHexString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2)).toUpperCase());
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			else if(isOctal)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toHexString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2)).toUpperCase());
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			isHexaDecimal = true;
			isDecimal = false;
			isBinary = false;
			isOctal = false;
		}
		
		else if(event.getSource() == decimalRadioButton) 
		{
			ProgrammerCalculator.disableButton(LetterPanel.getButtonA());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonB());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonC());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonD());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonE());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonF());
			
			ProgrammerCalculator.enableButton(NumberPanel.getButton1());
			ProgrammerCalculator.enableButton(NumberPanel.getButton2());
			ProgrammerCalculator.enableButton(NumberPanel.getButton3());
			ProgrammerCalculator.enableButton(NumberPanel.getButton4());
			ProgrammerCalculator.enableButton(NumberPanel.getButton5());
			ProgrammerCalculator.enableButton(NumberPanel.getButton6());
			ProgrammerCalculator.enableButton(NumberPanel.getButton7());
			ProgrammerCalculator.enableButton(NumberPanel.getButton8());
			ProgrammerCalculator.enableButton(NumberPanel.getButton9());
			ProgrammerCalculator.enableButton(NumberPanel.getButtonDecimal());

			if(isBinary)
			{
				ProgrammerCalculator.getTextField().setText(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2)));
			}
			
			else if(isHexaDecimal)
			{
				ProgrammerCalculator.getTextField().setText(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 15)));
			}
			
			else if(isOctal)
			{
				ProgrammerCalculator.getTextField().setText(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8)));
			}
			
			isHexaDecimal = false;
			isDecimal = true;
			isBinary = false;
			isOctal = false;
		}
		
		else if(event.getSource() == octalRadioButton)
		{
			ProgrammerCalculator.disableButton(LetterPanel.getButtonA());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonB());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonC());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonD());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonE());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonF());
			
			ProgrammerCalculator.disableButton(NumberPanel.getButton8());
			ProgrammerCalculator.disableButton(NumberPanel.getButton9());
			ProgrammerCalculator.enableButton(NumberPanel.getButtonDecimal());
		
			if(isBinary)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toOctalString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2)));
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			else if(isDecimal) 
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toOctalString(Integer.parseInt(ProgrammerCalculator.getTextField().getText())));
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			else if(isHexaDecimal)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toOctalString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 15)));
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			isHexaDecimal = false;
			isDecimal = false;
			isBinary = false;
			isOctal = true;
		}
		
		else if(event.getSource() == binaryRadioButton)
		{
			ProgrammerCalculator.disableButton(LetterPanel.getButtonA());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonB());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonC());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonD());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonE());
			ProgrammerCalculator.disableButton(LetterPanel.getButtonF());
			
			ProgrammerCalculator.disableButton(NumberPanel.getButtonDecimal());
			ProgrammerCalculator.disableButton(NumberPanel.getButton2());
			ProgrammerCalculator.disableButton(NumberPanel.getButton3());
			ProgrammerCalculator.disableButton(NumberPanel.getButton4());
			ProgrammerCalculator.disableButton(NumberPanel.getButton5());
			ProgrammerCalculator.disableButton(NumberPanel.getButton6());
			ProgrammerCalculator.disableButton(NumberPanel.getButton7());
			ProgrammerCalculator.disableButton(NumberPanel.getButton8());
			ProgrammerCalculator.disableButton(NumberPanel.getButton9());
			
			if(isDecimal)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toBinaryString(Integer.parseInt(ProgrammerCalculator.getTextField().getText())));
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			else if(isHexaDecimal)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toBinaryString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 15)));
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			else if(isOctal)
			{
				try {
					ProgrammerCalculator.getTextField().setText(Integer.toBinaryString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 9)));
				}
				
				catch(NumberFormatException error) {
					ProgrammerCalculator.getTextField().setText("");
				}
			}
			
			isHexaDecimal = false;
			isDecimal = false;
			isBinary = true;
			isOctal = false;
		}
	}
}
