// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class WordPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton qwordRadioButton, dwordRadioButton, wordRadioButton, byteRadioButton;	// DWord - 32 bit unsigned integer, QWord = Two DWords or 64 bits,
																						// Byte - 8 bits and Word - 2 bytes or 16 bits
	// Creating the panel and initializing all the variables
	
	public WordPanel() {
		GridBagLayout layout = new GridBagLayout();
		layout.rowHeights = new int[] {19, 0, 4, 12, 0};
		layout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		layout.columnWidths = new int[] {83, 0};
		layout.columnWeights = new double[] {0.0, Double.MIN_VALUE};
		setLayout(layout);	
		
		qwordRadioButton = new JRadioButton("QWord");
		buttonGroup.add(qwordRadioButton);
		GridBagConstraints constraints_qwrb = new GridBagConstraints();
		constraints_qwrb.gridx = 0;
		constraints_qwrb.gridy = 0;
		constraints_qwrb.anchor = GridBagConstraints.NORTHWEST;
		constraints_qwrb.insets = new Insets(0, 0, 5, 0);
		add(qwordRadioButton, constraints_qwrb);
		
		dwordRadioButton = new JRadioButton("DWord");
		buttonGroup.add(dwordRadioButton);
		GridBagConstraints constraints_dwrb = new GridBagConstraints();
		constraints_dwrb.gridx = 0;
		constraints_dwrb.gridy = 1;
		constraints_dwrb.anchor = GridBagConstraints.NORTHWEST;
		constraints_dwrb.insets = new Insets(0, 0, 5, 0);
		add(dwordRadioButton, constraints_qwrb);
		
		wordRadioButton = new JRadioButton("Word");
		buttonGroup.add(wordRadioButton);
		GridBagConstraints constraints_wrb = new GridBagConstraints();
		constraints_wrb.gridx = 0;
		constraints_wrb.gridy = 2;
		constraints_wrb.anchor = GridBagConstraints.NORTHWEST;
		constraints_wrb.insets = new Insets(0, 0, 5, 0);
		add(wordRadioButton, constraints_wrb);
		
		byteRadioButton = new JRadioButton("Byte");
		buttonGroup.add(byteRadioButton);
		GridBagConstraints constraints_brb = new GridBagConstraints();
		constraints_brb.gridx = 0;
		constraints_brb.gridy = 3;
		constraints_brb.anchor = GridBagConstraints.NORTHWEST;
		add(byteRadioButton, constraints_brb);
		
		qwordRadioButton.setSelected(true);	// QWord will be selected by default.
	}
	
}
