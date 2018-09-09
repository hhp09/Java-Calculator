import java.awt.Color; 
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ProgrammerCalculator extends JFrame implements ActionListener {
	
	// Creating instance variables for each class and frame
	private static final long serialVersionUID = 1L;
	private static OperationPanel operationPanel;
	private static LetterPanel letterPanel;
	private static EmptyBox emptyPanel;
	private static BitPanel bitPanel;
	private static NumberPanel numberPanel;
	private static ClearPanel clearPanel;
	private static WordPanel wordPanel;
	private static MixturePanel mixturePanel;
	private static PreNumberPanel preNumberPanel;
	
	private static boolean isMod;
	private static boolean isQuot;
	private static boolean isVisible;
	private static double firstNumber;
	private static double secondNumber;
	private static double result;
	
	private static StringSelection stringSelection;
	private static Clipboard clipboard;
	
	private JMenu viewButton;
	private JMenu editButton;
	private JMenu helpButton;
	private JMenuItem viewItemButton;
	private JMenuItem editItemButton;
	private JMenuItem helpItemButton;
	private JMenuItem helpProgrammerCalculatorItemButton;
	private static JTextField textField;
	
	public ProgrammerCalculator() {
		getContentPane().setBackground(new Color(226, 241, 255));
		
		// All JPanels being set
		operationPanel = new OperationPanel();
		operationPanel.setBackground(new Color(226, 241, 255));
		
		letterPanel = new LetterPanel();
		letterPanel.setBackground(new Color(226, 241, 255));
		
		emptyPanel = new EmptyBox();
		emptyPanel.setBackground(new Color(226, 241, 255));
		
		bitPanel = new BitPanel();
		bitPanel.setBackground(new Color(226, 241, 255));
		
		numberPanel = new NumberPanel();
		numberPanel.setBackground(new Color(226, 241, 255));
		
		clearPanel = new ClearPanel();
		clearPanel.setBackground(new Color(226, 241, 255));
		
		wordPanel = new WordPanel();
		wordPanel.setBackground(new Color(226, 241, 255));
		
		mixturePanel = new MixturePanel();
		mixturePanel.setBackground(new Color(226, 241, 255));
		
		preNumberPanel = new PreNumberPanel();
		preNumberPanel.setBackground(new Color(226, 241, 255));
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setHorizontalAlignment(JTextField.RIGHT);
		
		GroupLayout layout = new GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(20)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
									.addComponent(wordPanel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(mixturePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(preNumberPanel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(letterPanel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(clearPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(numberPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(operationPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(emptyPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(110))
						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(bitPanel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
							.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.TRAILING).addGroup(layout.createSequentialGroup().addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(bitPanel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addComponent(preNumberPanel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(wordPanel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
								.addComponent(mixturePanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
									.addComponent(emptyPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(clearPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(25))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
								.addComponent(numberPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(letterPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(operationPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		getContentPane().setLayout(layout);
		
		// Creating the Menu Bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// The first button in the menuBar is the View Button. It contains other button(s).
		viewButton = new JMenu("View");
		menuBar.add(viewButton);
		
		// The View Item button inside the view button in the menu overlay is created.	
		viewItemButton = new JMenuItem("Hide/Show");
		viewButton.add(viewItemButton);
		viewItemButton.addActionListener(this);
		
		// The second button in the menuBar is the Edit Button. It containts other button(s).
		editButton = new JMenu("Edit");
		menuBar.add(editButton);
		
		// The Edit Item button inside the edit button in the menu overlay is created.	
		editItemButton = new JMenuItem("Copy");
		editButton.add(editItemButton);
		editItemButton.addActionListener(this);
		
		// The help button in the menuBar is created.
		helpButton = new JMenu("Help");
		menuBar.add(helpButton);
		
		// The HelpItem Button inside the help button in the menu overlay is created.
		helpItemButton = new JMenuItem("View Help");
		helpButton.add(helpItemButton);
		helpItemButton.addActionListener(this);
		
		// The HelpProgrammerCalculator Item button in the menu overlay is created.
		helpProgrammerCalculatorItemButton = new JMenuItem("About Programmer Calculator");
		helpButton.add(helpProgrammerCalculatorItemButton);
		helpProgrammerCalculatorItemButton.addActionListener(this);
		
	}
		
		// Mutator and Accessor methods for variables
	
		public static void enableButton(JButton button) {
			button.setEnabled(false);
		}
		
		public static void disableButton(JButton button) {
			button.setEnabled(false);
		}
		
		public static JPanel getOperationPanel() {
			return operationPanel;
		}
		
		public static JPanel getNumberPanel() {
			return numberPanel;
		}
		
		public static JPanel getClearPanel() {
			return clearPanel;
		}
		
		public static JPanel getEmptyBox() {
			return emptyPanel;
		}
		
		public static JPanel getPreNumberPanel() {
			return preNumberPanel;
		}
		
		public static JPanel getLetterPanel() {
			return letterPanel;
		}
		
		public static JPanel getMixturePanel() {
			return mixturePanel;
		}
		
		public static JPanel getWordPanel() {
			return wordPanel;
		}
		
		public static JPanel getBitPanel() {
			return bitPanel;
		}
		
		public static JTextField getTextField() {
			return textField;
		}
		
		public static void setFirstNumber(double one) {
			firstNumber = one;
		}
		
		public static void setSecondNumber(double two) {
			secondNumber = two;
		}
		
		public static void setResults(double answer) {
			result = answer;
		}
		
		public static double getFirstNumber() {
			return firstNumber;
		}
		
		public static double getSecondNumber() {
			return secondNumber;
		}
		
		public static double getResult() {
			return result;
		}
		
		public static void setIsMod(boolean m) {
			isMod = m;
		}
		
		public static void setIsQuot(boolean q) {
			isQuot = q;
		}
		
		public static void setIsVisible(boolean visibility) {
			isVisible = visibility;
		}
		
		public static boolean getIsMod() {
			return isMod;
		}
		
		public static boolean getIsQuot() {
			return isQuot;
		}
		
		public static boolean getIsVisible() {
			return isVisible;
		}
		
		// Overriding the ActionListener
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == viewItemButton)
			{
				if(isVisible)
				{
					setVisible(false);
					isVisible = false;
				}
				
				else
				{
					setVisible(true);
					isVisible = true;
				}
			}
			
			else if(e.getSource() == editItemButton)
			{
				stringSelection = new StringSelection(textField.getText());
				clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
			}
			
			else if(e.getSource() == helpItemButton) {
				Help frame = new Help();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
			else if(e.getSource() == helpProgrammerCalculatorItemButton)
			{
				AboutProgrammerCalculator frame = new AboutProgrammerCalculator();
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
		}	
}

