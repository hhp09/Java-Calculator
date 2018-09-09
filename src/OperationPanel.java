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

public class OperationPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static JButton negationButton, divisionButton, multiplicationButton, subtractionButton, additionButton, squareRootButton, percentageButton, fractionButton, equalsToButton;
	private static boolean isDivide, isMultiply, isSubtract, isAdd;
	private int numberEqual;
	
	// This class performs the back-end operations when the user clicks on the mathematical operational buttons.
	
	public OperationPanel() {
		GridBagLayout layout = new GridBagLayout();
		layout.rowHeights = new int[] {0, 0, 0, 0, 0, 0};
		layout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		layout.columnWidths = new int[] {0, 35, 0};
		layout.columnWeights = new double[] {0.0, 0.0, Double.MIN_VALUE};
		setLayout(layout);	
		
		negationButton = new JButton("+/-");
		negationButton.addActionListener(this);
		negationButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_negationButton = new GridBagConstraints();
		constraints_negationButton.gridx = 0;
		constraints_negationButton.gridy = 0;
		constraints_negationButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_negationButton.insets = new Insets(0, 0, 5, 5);
		add(negationButton, constraints_negationButton);
		
		squareRootButton = new JButton("SqrRt");
		squareRootButton.addActionListener(this);
		squareRootButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_squareRootButton = new GridBagConstraints();
		constraints_squareRootButton.gridx = 1;
		constraints_squareRootButton.gridy = 0;
		constraints_squareRootButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_squareRootButton.insets = new Insets(0, 0, 5, 0);
		add(squareRootButton, constraints_squareRootButton);
		
		divisionButton = new JButton("/");
		divisionButton.addActionListener(this);
		divisionButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_divisionButton = new GridBagConstraints();
		constraints_divisionButton.gridx = 0;
		constraints_divisionButton.gridy = 1;
		constraints_divisionButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_divisionButton.insets = new Insets(0, 0, 5, 5);
		add(divisionButton, constraints_divisionButton);
		
		percentageButton = new JButton("%");
		percentageButton.addActionListener(this);
		percentageButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_percentageButton = new GridBagConstraints();
		constraints_percentageButton.gridx = 1;
		constraints_percentageButton.gridy = 1;
		constraints_percentageButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_percentageButton.insets = new Insets(0, 0, 5, 0);
		add(percentageButton, constraints_percentageButton);
		
		multiplicationButton = new JButton("x");
		multiplicationButton.addActionListener(this);
		multiplicationButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_multiplicationButton = new GridBagConstraints();
		constraints_multiplicationButton.gridx = 0;
		constraints_multiplicationButton.gridy = 2;
		constraints_multiplicationButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_multiplicationButton.insets = new Insets(0, 0, 5, 5);
		add(multiplicationButton, constraints_percentageButton);
	
		fractionButton = new JButton("1/x");
		fractionButton.addActionListener(this);
		fractionButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_fractionButton = new GridBagConstraints();
		constraints_fractionButton.gridx = 1;
		constraints_fractionButton.gridy = 2;
		constraints_fractionButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_fractionButton.insets = new Insets(0, 0, 5, 0);
		add(fractionButton, constraints_fractionButton);
		
		subtractionButton = new JButton("-");
		subtractionButton.addActionListener(this);
		subtractionButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_subtractionButton = new GridBagConstraints();
		constraints_subtractionButton.gridx = 0;
		constraints_subtractionButton.gridy = 3;
		constraints_subtractionButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_subtractionButton.insets = new Insets(0, 0, 5, 5);
		add(subtractionButton, constraints_subtractionButton);
		
		equalsToButton = new JButton("=");
		equalsToButton.addActionListener(this);
		equalsToButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_equalsToButton = new GridBagConstraints();
		constraints_equalsToButton.gridx = 1;
		constraints_equalsToButton.gridy = 3;
		constraints_equalsToButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_equalsToButton.gridheight = 2;
		add(equalsToButton, constraints_equalsToButton);
		
		additionButton = new JButton("+");
		additionButton.addActionListener(this);
		additionButton.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_additionButton = new GridBagConstraints();
		constraints_additionButton.gridx = 0;
		constraints_additionButton.gridy = 4;
		constraints_additionButton.anchor = GridBagConstraints.NORTHWEST;
		constraints_additionButton.insets = new Insets(0, 0, 0, 5);
		add(additionButton, constraints_equalsToButton);
	}
	
	// Setting mutator and accessor methods
	
	public static JButton getNegationButton() {
		return negationButton;
	}
	
	public static JButton getSquareRootButton() {
		return squareRootButton;
	}
	
	public static void setIsDivide(boolean divide)
	{
		isDivide = divide;
	}
	
	public static boolean getIsDivide() {
		return isDivide;
	}
	
	public static void setIsMultiply(boolean multiply)
	{
		isMultiply = multiply;
	}
	
	public static boolean getIsMultiply()
	{
		return isMultiply;
	}
	
	public static void setIsSubtract(boolean subtract)
	{
		isSubtract = subtract;
	}
	
	public static boolean getIsSubtract()
	{
		return isSubtract;
	}
	
	public static void setIsAdd(boolean add)
	{
		isAdd = add;
	}
	
	public static boolean getIsAdd()
	{
		return isAdd;
	}

	// The lines below decide what happens when a certain operational button is clicked upon.
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == negationButton)
		{
			if(Double.parseDouble(ProgrammerCalculator.getTextField().getText()) > 0)
			{
				ProgrammerCalculator.getTextField().setText("-" + ProgrammerCalculator.getTextField().getText());
			}
			
			else 
			{
				ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText().substring(1));
			}}
			
			else if (e.getSource() == squareRootButton)
			{
				ProgrammerCalculator.getTextField().setText("" + Math.sqrt(Double.parseDouble(ProgrammerCalculator.getTextField().getText())));
			}
			
			else if (e.getSource() == divisionButton)
			{
				if (PreNumberPanel.getIsHexaDecimal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
				}
					
				else if (PreNumberPanel.getIsOctal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
				}
				
				else if(PreNumberPanel.getIsBinary())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
				}
				else 
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
				}
				
				ProgrammerCalculator.getTextField().setText("");
				isDivide = true;
				isAdd = false;
				isMultiply = false;
				isSubtract = false;
				numberEqual = 0;
			}
			
			else if (e.getSource() == percentageButton)
			{
				ProgrammerCalculator.getTextField().setText("" + (Double.parseDouble(ProgrammerCalculator.getTextField().getText()) * 100));
			}
			
			else if (e.getSource() == multiplicationButton)
			{
				if (PreNumberPanel.getIsHexaDecimal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
				}
				
				else if (PreNumberPanel.getIsOctal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
				}
				
				else if(PreNumberPanel.getIsBinary())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
				}
					
				else 
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
				}
				
				ProgrammerCalculator.getTextField().setText("");
				isMultiply = true;
				isAdd = false;
				isSubtract = false;
				isDivide = false;
				numberEqual = 0;
			}
			
			else if (e.getSource() == fractionButton)
			{
				ProgrammerCalculator.getTextField().setText("" + (1/Double.parseDouble(ProgrammerCalculator.getTextField().getText())));
			}
			
			else if (e.getSource() == subtractionButton)
			{
				if (PreNumberPanel.getIsHexaDecimal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
				}
				
				else if (PreNumberPanel.getIsOctal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
				}
				
				else if(PreNumberPanel.getIsBinary())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
				}
				
				else 
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
				}
				
				ProgrammerCalculator.getTextField().setText("");
				numberEqual = 0;
				isSubtract = true;
				isAdd = false;
				isDivide = false;
				isMultiply = false;
			}
			
			else if (e.getSource() == additionButton)
			{
				if (PreNumberPanel.getIsHexaDecimal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
				}
				
				else if (PreNumberPanel.getIsOctal())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
				}
				
				else if(PreNumberPanel.getIsBinary())
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
				}
				
				else 
				{
					ProgrammerCalculator.setFirstNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
				}
				
				ProgrammerCalculator.getTextField().setText("");
				isAdd = true;
				isSubtract = false;
				isMultiply = false;
				isDivide = false;
				numberEqual = 0;
			}
			
			else if (e.getSource() == equalsToButton)
			{
				numberEqual++;
				
				if (isDivide)
				{
					if (PreNumberPanel.getIsHexaDecimal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() / ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toHexString((int)ProgrammerCalculator.getResult()).toUpperCase());
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toHexString((int)(ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber())).toUpperCase());
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsOctal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() / ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toOctalString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toOctalString((int)(ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsBinary())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() / ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toBinaryString((int)ProgrammerCalculator.getResult()));
						}
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toBinaryString((int)(ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getFirstNumber() / ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber()));
						}
						else 
						{
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() / ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					isMultiply = false;
					isSubtract = false;
					isAdd = false;
				}
				
				else if (isMultiply)
				{	
					if (PreNumberPanel.getIsHexaDecimal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toHexString((int)ProgrammerCalculator.getResult()).toUpperCase());
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toHexString((int)(ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber())).toUpperCase());
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsOctal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toOctalString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toOctalString((int)(ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsBinary())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toBinaryString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toBinaryString((int)(ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else 
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber()));
						}
						
						else 
						{
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() * ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					isDivide = false;
					isSubtract = false;
					isAdd = false;
				}
				
				else if (isSubtract)
				{
					if (PreNumberPanel.getIsHexaDecimal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() - ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toHexString((int)ProgrammerCalculator.getResult()).toUpperCase());
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toHexString((int)(ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber())).toUpperCase());
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsOctal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() - ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toOctalString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toOctalString((int)(ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsBinary())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() - ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toBinaryString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toBinaryString((int)(ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getFirstNumber() - ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getFirstNumber() * ProgrammerCalculator.getSecondNumber()));
						}
						
						else 
						{
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() - ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					isMultiply = false;
					isDivide = false;
					isAdd = false;
				}
				
				else if (isAdd)
				{
					if (PreNumberPanel.getIsHexaDecimal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 16))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() + ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toHexString((int)ProgrammerCalculator.getResult()).toUpperCase());
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toHexString((int)(ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber())).toUpperCase());
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsOctal())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 8))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() + ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toOctalString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toOctalString((int)(ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else if (PreNumberPanel.getIsBinary())
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(Integer.toString(Integer.parseInt(ProgrammerCalculator.getTextField().getText(), 2))));
							ProgrammerCalculator.setResults(ProgrammerCalculator.getFirstNumber() + ProgrammerCalculator.getSecondNumber());
							ProgrammerCalculator.getTextField().setText(Integer.toBinaryString((int)ProgrammerCalculator.getResult()));
						}
						
						else
						{
							ProgrammerCalculator.getTextField().setText("" + Integer.toBinaryString((int)(ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber())));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					else
					{
						if (numberEqual == 1)
						{
							ProgrammerCalculator.setSecondNumber(Double.parseDouble(ProgrammerCalculator.getTextField().getText()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getFirstNumber() + ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getFirstNumber() + ProgrammerCalculator.getSecondNumber()));
						}
						
						else 
						{
							ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber()));
							ProgrammerCalculator.setResults((ProgrammerCalculator.getResult() + ProgrammerCalculator.getSecondNumber()));
						}
					}
					
					isDivide = false;
					isMultiply = false;
					isSubtract = false;
				}
				
				else if (ProgrammerCalculator.getIsMod())
				{
					ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getFirstNumber() % Integer.parseInt(ProgrammerCalculator.getTextField().getText())));
					ProgrammerCalculator.setIsMod(false); 
				}
				
				else if (ProgrammerCalculator.getIsQuot())
				{
					ProgrammerCalculator.getTextField().setText("" + (ProgrammerCalculator.getFirstNumber() / Double.parseDouble(ProgrammerCalculator.getTextField().getText())));
					ProgrammerCalculator.setIsQuot(false);
				}
		}
	
	}
}
