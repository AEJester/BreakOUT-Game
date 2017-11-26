package breakout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		Gameplay gp = new Gameplay();
		Menu mn = new Menu();
		JFrame obj = new JFrame();
		JFrame menu = new JFrame();
		menu.setBounds(10, 10, 700, 600);
		menu.setResizable(false);
		menu.setTitle("Breakout");
		menu.add(mn);
		obj.setBounds(10, 10, 700, 600);
		obj.setResizable(false);
		obj.setTitle("BreakOUT");
		obj.add(gp);
		obj.setVisible(true);
		menu.setVisible(true);
	}

}
