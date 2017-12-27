package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Menu extends JPanel implements ActionListener, MouseListener, KeyListener {
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	JFrame frame;
	JButton button;
	Timer timer;
	JPanel panel;
	JButton instruct;

	static final int HEIGHT = 500;
	static final int WIDTH = 500;
	public static BufferedImage GameBackground;
	public static BufferedImage MenuBackground;
	public static BufferedImage EndBackground;
	public static BufferedImage Rocketship;
	public static BufferedImage RocketLeft;
	public static BufferedImage RocketRight;
	public static BufferedImage RocketGo;
	public static BufferedImage CurrentRocket;
	public static BufferedImage Clone;
	public static BufferedImage Seeker;
	public static BufferedImage CurrentAlien;
	int alienx = 125;
	int alieny = 125;
	// SpaceSeeker spaceSeeker;
	private boolean mousePressed;

	Rocket rocket = new Rocket();
	private Graphics g;
	// SpaceSeeker rocket = new SpaceSeeker();

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
		// SpaceSeeker rocket = new SpaceSeeker();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// button = new JButton("START");
		// this.add(button);
		// button.addActionListener(this);
		// button.setVisible(true);
		frame.addMouseListener(this);
		panel = new JPanel();

		frame.add(panel);
		// instruct = new JButton("HELP");
		// this.add(instruct);
		// instruct.addActionListener(this);
		// instruct.setVisible(true);
		start();
		// move(rocketx, rockety);

		try {
			MenuBackground = ImageIO.read(this.getClass().getResourceAsStream("Space Seeker Background (2).png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			GameBackground = ImageIO.read(this.getClass().getResourceAsStream("Space Seeker Game Background.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			EndBackground = ImageIO.read(this.getClass().getResourceAsStream("EndScreen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Rocketship = ImageIO.read(this.getClass().getResourceAsStream("NewRocket.png"));
			CurrentRocket = Rocketship;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			RocketLeft = ImageIO.read(this.getClass().getResourceAsStream("NewRocketLeft.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			RocketRight = ImageIO.read(this.getClass().getResourceAsStream("NewRocketRight.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			RocketGo = ImageIO.read(this.getClass().getResourceAsStream("NewRocketGo.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	try {
		Clone = ImageIO.read(this.getClass().getResourceAsStream("Clone.png"));

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		Seeker = ImageIO.read(this.getClass().getResourceAsStream("Seeker.png"));

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	void start() {
		timer = new Timer(1000 / 60, this);
		timer.start();
		frame.add(this);
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		System.out.println("aa");
		frame.addKeyListener(this);

	}

	void drawMenu(Graphics g) {
		g.drawImage(MenuBackground, 0, 0, null);
	}

	public void drawRocket(Graphics g) {
		g.drawImage(CurrentRocket, rocket.x, rocket.y, null);

	}
	public void drawAlien(Graphics g) {
		g.drawImage(Clone, alienx, alieny, null);
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
		if (currentState == GAME_STATE) {
			drawRocket(g);
		}

	}

	void drawGame(Graphics g) {
		g.drawImage(GameBackground, 0, 0, null);
	}

	/*
	 * try { GameBackground = ImageIO.read(this.getClass().
	 * getResourceAsStream("Space Seeker Game Background.png")); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 */

	void drawEnd(Graphics g) {
		g.drawImage(EndBackground, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		updateGame();

	}

	private void updateMenu() {
		// TODO Auto-generated method stub

	}

	private void updateEnd() {
		// TODO Auto-generated method stub

	}

	private void updateGame() {
		// TODO Auto-generated method stub
		if (currentState == GAME_STATE) {
			rocket.move();

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

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			rocket.up = false;
			CurrentRocket = Rocketship;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rocket.right = false;
			CurrentRocket = Rocketship;
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			rocket.left = false;
			CurrentRocket = Rocketship;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			rocket.down = false;
			CurrentRocket = Rocketship;
		}
	}

	public void keyPressed(KeyEvent e) {

		if (currentState == MENU_STATE) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				if (currentState == MENU_STATE) {
					currentState = GAME_STATE;
					CurrentAlien = Clone;
				} else if (currentState == GAME_STATE) {
					currentState = END_STATE;
				} else if (currentState == END_STATE) {
					currentState = MENU_STATE;
				}

				if (currentState == GAME_STATE) {

				}
			}
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			System.out.println("Right");
			rocket.right = true;
			CurrentRocket = RocketRight;

		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			System.out.println("Left");
			rocket.left = true;
			CurrentRocket = RocketLeft;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			System.out.println("Up");
			rocket.up = true;
			CurrentRocket = RocketGo;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			System.out.println("Down");
			rocket.down = true;
			CurrentRocket = RocketGo;
		}
	}
}
