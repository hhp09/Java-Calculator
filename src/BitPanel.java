// Name: Hritik Panchasara
// netID: hhp160130

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class BitPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// Creating the panel below.
	
	public BitPanel() {
		JLabel label = new JLabel("0000");
		JLabel label1 = new JLabel("0000");
		JLabel label2 = new JLabel("0000");
		JLabel label3 = new JLabel("0000");
		JLabel label4 = new JLabel("0000");
		JLabel label5 = new JLabel("0000");
		JLabel label6 = new JLabel("0000");
		JLabel label7 = new JLabel("0000");
		JLabel label8 = new JLabel("0000");
		JLabel label9 = new JLabel("0000");
		JLabel label10 = new JLabel("0000");
		JLabel label11 = new JLabel("0000");
		JLabel label12 = new JLabel("0000");
		JLabel label13 = new JLabel("0000");
		JLabel label14 = new JLabel("0000");
		JLabel label15 = new JLabel("0000");
		
		JLabel label17 = new JLabel("63");
		label17.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		
		JLabel label16 = new JLabel("60");
		label16.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		
		JLabel label18 = new JLabel("45");
		label18.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		
		JLabel label19 = new JLabel("15");
		label19.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		
		JLabel label20 = new JLabel("30");
		label20.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		
		JLabel label21 = new JLabel("0");
		
		GroupLayout layout = new GroupLayout(this);
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
							.addGap(6).addComponent(label16))
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(label).addGroup(layout.createSequentialGroup()
											.addGap(6).addComponent(label17)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addComponent(label15, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
							.addGap(12)
							.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
									.addComponent(label13, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
											.addComponent(label2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(6)
											.addComponent(label18)))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(6).addComponent(label20))
										.addComponent(label8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup()
									.addComponent(label12, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label9, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
											.addComponent(label7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE).addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(label10, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup().addGap(6).addComponent(label19))).addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(label11, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(6).addComponent(label21))
										.addComponent(label14, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))))
							.addGap(18))).addContainerGap(239, Short.MAX_VALUE))
		);
		
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap()
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(label5)
						.addComponent(label13)
						.addComponent(label3)
						.addComponent(label2)
						.addComponent(label4)
						.addComponent(label1)
						.addComponent(label8))
					.addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label17)
						.addComponent(label18)
						.addComponent(label20))
					.addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label15)
						.addComponent(label6)
						.addComponent(label12)
						.addComponent(label9)
						.addComponent(label7)
						.addComponent(label10)
						.addComponent(label11)
						.addComponent(label14))
					.addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(label16)
						.addComponent(label19)
						.addComponent(label21))
					.addGap(218))
		);
		
		setLayout(layout);
	}
}
