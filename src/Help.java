// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Help extends JFrame 
{
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	// Creating the frame
	public Help() 
	{
		setBounds(100, 100, 449, 545);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Calculator1.png")).getImage();
		label.setIcon(new ImageIcon(img));
		
		JLabel label1 = new JLabel("Using Calculator");
		label1.setForeground(new Color(30, 144, 255));
		label1.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel label2 = new JLabel("Programmer Mode");
		label2.setForeground(new Color(30, 144, 255));
		
		JLabel label3 = new JLabel("Notes");
		
		JTextPane pane1 = new JTextPane();
		pane1.setText("* In Programmer mode, Calculator is precise up to 64 bits.");
		
		JTextPane pane2 = new JTextPane();
		pane2.setText("* Programmer mode is an integer only mode. Decimal portions are discarded, unless doing regular calculations.");
		
		JTextArea pane3 = new JTextArea();
		pane3.setText("* In Programmer mode, Calculator is precise up to 64 bits.");
		
		JTextArea pane4 = new JTextArea();
		pane4.setText("* Programmer mode is an integer only mode. Decimal \n " +
								   "portions are discarded, unless performing basic \n " + 
								   "calculations.");
		
		JTextArea pane5 = new JTextArea();
		pane5.setText("1. Click the calculator keys to perform the calculation you want.");
		
		JTextArea pane6 = new JTextArea();
		pane6.setText("You can perform calculations by clicking the calculator buttons, \n " +
						"or you can type calculations by using your keyboard.");
		
		JTextArea pane7 = new JTextArea();
		pane7.setText("You can use Calculator to perform simple calculation such as \n" +
						   "additions, subtractions, multiplication, division. This \n" + 
						   "Calculator offers advanced capabilities of a programmer calculator.");
		
		GroupLayout content_pane = new GroupLayout(contentPane);
		content_pane.setHorizontalGroup(
				content_pane.createParallelGroup(Alignment.LEADING).addGroup(content_pane.createSequentialGroup().addGroup(content_pane.createParallelGroup(Alignment.TRAILING)
						.addGroup(content_pane.createParallelGroup(Alignment.LEADING).addGroup(content_pane.createSequentialGroup()
								.addContainerGap()
								.addComponent(pane6, GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE))
							.addGroup(content_pane.createSequentialGroup()
								.addContainerGap()
								.addComponent(label1))
							.addGroup(content_pane.createSequentialGroup().addContainerGap().addComponent(label2)).addGroup(content_pane.createSequentialGroup()
								.addGap(27).addComponent(pane1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(content_pane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(pane2, 0, 0, Short.MAX_VALUE).addGroup(content_pane.createSequentialGroup()
										.addComponent(pane1, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(content_pane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(label3)
											.addComponent(pane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addComponent(pane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
							.addGroup(content_pane.createSequentialGroup().addContainerGap()
								.addComponent(pane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(content_pane.createSequentialGroup()
								.addContainerGap().addComponent(pane7, GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)))
						.addGroup(content_pane.createSequentialGroup().addContainerGap().addComponent(label).addGap(99))).addGap(23))
		);
		
		content_pane.setVerticalGroup(
				content_pane.createParallelGroup(Alignment.LEADING)
				.addGroup(content_pane.createSequentialGroup().addContainerGap()
					.addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pane7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pane6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED).addComponent(label)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(label2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pane5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED).addComponent(label3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(content_pane.createParallelGroup(Alignment.LEADING)
						.addComponent(pane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(content_pane.createSequentialGroup().addGroup(content_pane.createParallelGroup(Alignment.LEADING)
								.addComponent(pane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(content_pane.createSequentialGroup()
									.addComponent(pane3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pane4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(pane2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))).addGap(66))
		);
		
		contentPane.setLayout(content_pane);
	}
}