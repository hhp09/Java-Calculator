// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.Dimension; 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JPanel;

public class EmptyBox extends JPanel {
	private static final long serialVersionUID = 1L;
	JButton empty0, empty1, empty2, empty3, empty4;
	
	public EmptyBox(){
		
		GridBagLayout emptyBoxLayout = new GridBagLayout();
		
		emptyBoxLayout.rowWeights = new double[] {0.0, Double.MIN_VALUE};
		emptyBoxLayout.rowHeights = new int[] {30, 0};
		emptyBoxLayout.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		emptyBoxLayout.columnWidths = new int[] {30, 30, 30, 30, 30, 0};
		
		setLayout(emptyBoxLayout);
		
		empty0 = new JButton();
		empty0.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_empty0 = new GridBagConstraints();
		constraints_empty0.gridx = 0;
		constraints_empty0.gridy = 0;
		constraints_empty0.anchor = GridBagConstraints.NORTHWEST;
		constraints_empty0.insets = new Insets(0, 0, 0, 10);
		add(empty0, constraints_empty0);
		
		empty0.setEnabled(false);
		
		empty1 = new JButton();
		empty1.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_empty1 = new GridBagConstraints();
		constraints_empty1.gridx = 1;
		constraints_empty1.gridy = 0;
		constraints_empty1.anchor = GridBagConstraints.NORTHWEST;
		constraints_empty1.insets = new Insets(0, 0, 0, 10);
		add(empty1, constraints_empty1);

		empty1.setEnabled(false);

		empty2 = new JButton();
		empty2.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_empty2 = new GridBagConstraints();
		constraints_empty2.gridx = 2;
		constraints_empty2.gridy = 0;
		constraints_empty2.anchor = GridBagConstraints.NORTHWEST;
		constraints_empty2.insets = new Insets(0, 0, 0, 5);
		add(empty2, constraints_empty2);
		
		empty2.setEnabled(false);
		
		empty3 = new JButton();
		empty3.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_empty3 = new GridBagConstraints();
		constraints_empty3.gridx = 3;
		constraints_empty3.gridy = 0;
		constraints_empty3.anchor = GridBagConstraints.NORTHWEST;
		constraints_empty3.insets = new Insets(0, 0, 0, 5);
		add(empty3, constraints_empty3);
		
		empty3.setEnabled(false);
		
		empty4 = new JButton();
		empty4.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_empty4 = new GridBagConstraints();
		constraints_empty4.gridx = 4;
		constraints_empty4.gridy = 0;
		constraints_empty4.anchor = GridBagConstraints.NORTHWEST;
		// constraints_empty4.insets = new Insets(0, 0, 0, 10);
		add(empty4, constraints_empty4);
		
		empty4.setEnabled(false);

	}
}
