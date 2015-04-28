import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


public class Main extends JPanel {
	static String[] fname = { "Joel", "Joshua", "Rhivor", "Magic", "Kevin", "Thomas", "Francis"};
	static String[] lname = { "Aro", "Alcoran", "Pamaong", "Tan", "Tran", "Balani", "Mora", "Nguyen"};
	
	static JLabel genName1, genName2, genName3, genName4, genName5;
	
	public Main() {
		super(new GridLayout(3,1));
		Random randFName = new Random();
		Random randLName = new Random();
		for(int i = 0; i < 5; i++) {
			int rfn = randFName.nextInt(6) + 0;
			int rln = randLName.nextInt(7) + 0;
			switch(i) {
			case 1:
				genName1 = new JLabel(fname[rfn] + " " + lname[rln]);
			case 2:
				genName2 = new JLabel(fname[rfn] + " " + lname[rln]);
			case 3:
				genName3 = new JLabel(fname[rfn] + " " + lname[rln]);
			case 4:
				genName4 = new JLabel(fname[rfn] + " " + lname[rln]);
			case 5:
				genName5 = new JLabel(fname[rfn] + " " + lname[rln]);
			}
		}
		add(genName1);
		add(genName2);
		add(genName3);
		add(genName4);
		add(genName5);
	}


	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Name Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(500, 100));
		frame.add(new Main());
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	public static void main(String args[]) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}
}
