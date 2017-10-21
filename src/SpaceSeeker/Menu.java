package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Menu extends JPanel implements ActionListener, MouseListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	JFrame frame;
	JButton button;
	Timer timer;
	static final int HEIGHT = 500;
	static final int WIDTH = 500;
	SpaceSeeker spaceSeeker;
	private boolean mousePressed;
	private Graphics g;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Menu();
			}
		});

	}

	Menu() {
		spaceSeeker = new SpaceSeeker();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("START");
		this.add(button);
		button.addActionListener(this);
		button.setVisible(true);
		frame.addMouseListener(this);
		start();

	}

	void start() {
		timer = new Timer(1000 / 60, this);
		timer.start();
		frame.add(this);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);

	}

	void drawMenu(Graphics g) {

		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 100, 500);
		g.setColor(Color.CYAN);
		g.fillRect(100, 0, 100, 500);
		g.setColor(Color.lightGray);
		g.fillRect(200, 0, 100, 500);
		g.setColor(Color.CYAN);
		g.fillRect(300, 0, 100, 500);
		g.setColor(Color.BLUE);
		g.fillRect(400, 0, 100, 500);

	}

	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		if (currentState == MENU_STATE) {
			drawMenu(g);
		} else if (currentState == GAME_STATE) {
			drawGame(g);
		} else if (currentState == END_STATE) {
			drawEnd(g);
		}

	}

	void drawGame(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 500, 500);
	}

	void drawEnd(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 500, 500);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		if (e.getSource() == button && currentState == GAME_STATE) {
			
				drawGame(g);
			} else if (currentState == END_STATE) {
				drawEnd(g);
			} else if (currentState == MENU_STATE) {
				drawMenu(g);
			}

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}