package breakout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Menu extends JPanel implements KeyListener, ActionListener {
	private int selected = 1;
	private int choice;
	Main main = new Main();
	public Menu() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(1, 1, 7000, 7000);
		g.setColor(Color.blue);
		g.setFont(new Font("serif", Font.BOLD, 50));
		g.drawString("BreakOUT", 210, 100);
		g.setFont(new Font("serif", Font.BOLD, 30));
		g.drawString("Start", 250, 150);
		g.drawString("Tutorial", 250, 200);
		if (selected == 1) {
			g.setColor(Color.red);
			g.fillOval(400, 130, 20, 20);
		} else {
			if (selected == 2) {
				g.setColor(Color.red);
				g.fillOval(400, 180, 20, 20);
			}
		}
		if (choice == 1) {
			g.setColor(Color.yellow);
			g.setFont(new Font("serif", Font.BOLD, 20));
			g.drawString("Minimize or Close this window to start.", 0, 250);
		} else {
			if  (choice == 2) {
				g.setColor(Color.yellow);
				g.setFont(new Font("serif", Font.BOLD, 20));
				g.drawString("ESC to pause, SPACE to resume or start, Move the mouse", 0, 250);
				g.drawString("to block the ball from falling. Destroy all ", 0, 300);
				g.drawString("the blocks to win.", 0, 350);
			}
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP && selected == 1) {
			selected = 1;
			repaint();
		} else {
			if (e.getKeyCode() == KeyEvent.VK_UP && selected == 2) {
				selected = 1;
				repaint();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN && selected == 1) {
			selected = 2;
			repaint();
		} else {
			if (e.getKeyCode() == KeyEvent.VK_UP && selected == 2) {
				selected = 2;
				repaint();
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (selected == 1) {
				choice = 1;
			} else {
				choice = 2;
			}
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

}
