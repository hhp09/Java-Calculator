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

public class LetterPanel extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private static JButton a, b, c, d, e, f;
	
	// Creating the panel
	
	public LetterPanel() {
		GridBagLayout layout = new GridBagLayout();
		layout.rowHeights = new int[] {30, 0, 0, 0, 0, 0, 0};
		layout.rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		layout.columnWidths = new int[] {30, 0};
		layout.columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(layout);	
		
		a = new JButton("A");
		a.addActionListener(this);
		a.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_a = new GridBagConstraints();
		constraints_a.gridx = 0;
		constraints_a.gridy = 0;
		constraints_a.anchor = GridBagConstraints.NORTHWEST;
		constraints_a.insets = new Insets(0, 0, 5, 0);
		add(a, constraints_a);
		
		b = new JButton("B");
		b.addActionListener(this);
		b.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_b = new GridBagConstraints();
		constraints_b.gridx = 0;
		constraints_b.gridy = 1;
		constraints_b.anchor = GridBagConstraints.NORTHWEST;
		constraints_b.insets = new Insets(0, 0, 5, 0);
		add(b, constraints_b);
		
		c = new JButton("C");
		c.addActionListener(this);
		c.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_c = new GridBagConstraints();
		constraints_c.gridx = 0;
		constraints_c.gridy = 2;
		constraints_c.anchor = GridBagConstraints.NORTHWEST;
		constraints_c.insets = new Insets(0, 0, 5, 0);
		add(c, constraints_c);
		
		d = new JButton("d");
		d.addActionListener(this);
		d.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_d = new GridBagConstraints();
		constraints_d.gridx = 0;
		constraints_d.gridy = 3;
		constraints_d.anchor = GridBagConstraints.NORTHWEST;
		constraints_d.insets = new Insets(0, 0, 5, 0);
		add(d, constraints_d);
		
		e = new JButton("E");
		e.addActionListener(this);
		e.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_e = new GridBagConstraints();
		constraints_e.gridx = 0;
		constraints_e.gridy = 4;
		constraints_e.anchor = GridBagConstraints.NORTHWEST;
		constraints_e.insets = new Insets(0, 0, 5, 0);
		add(e, constraints_e);
		
		f = new JButton("F");
		f.addActionListener(this);
		f.setPreferredSize(new Dimension(30, 30));
		GridBagConstraints constraints_f = new GridBagConstraints();
		constraints_f.gridx = 0;
		constraints_f.gridy = 5;
		constraints_f.anchor = GridBagConstraints.NORTHWEST;
		add(f, constraints_f);
	}
	
	// Accessor methods for the alphabets
	
	public static JButton getButtonA() {
		return a;
	}
	
	public static JButton getButtonB() {
		return b;
	}
	
	public static JButton getButtonC() {
		return c;
	}
	
	public static JButton getButtonD() {
		return d;
	}
	
	public static JButton getButtonE() {
		return e;	
	}
	
	public static JButton getButtonF() {
		return f;
	}
	
	// Returning the alphabet in the calculation box when the user inputs a letter. Signifies backend operations.
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == a)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "A");
		}
		
		else if(e.getSource() == b)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "B");
		}
		
		else if(e.getSource() == c)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "C");
		}
		
		else if(e.getSource() == d)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "D");
		}
		
		else if(e.getSource() == e)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "E");
		}
		
		else if(e.getSource() == f)
		{
			ProgrammerCalculator.getTextField().setText(ProgrammerCalculator.getTextField().getText() + "F");
		}
	}
}
