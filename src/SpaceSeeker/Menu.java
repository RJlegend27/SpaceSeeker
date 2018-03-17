package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	public static BufferedImage CloneTogether;
	public static BufferedImage Seeker;
	public static BufferedImage CurrentAlien;
	public static BufferedImage Laser;
	public static BufferedImage Warning;
	public static BufferedImage Warning2;
	public static BufferedImage Warning3;
	public static BufferedImage Warning4;
	public static BufferedImage Laser2;
	public static BufferedImage Laser3;
	public static BufferedImage Laser4;
	public static BufferedImage Follower;
	public static BufferedImage CloneTogether2;
	public static BufferedImage CloneTogether3;
	public static BufferedImage Bullet;
	public static BufferedImage Clone2;
	public static BufferedImage Clone3;
	// SpaceSeeker spaceSeeker;
	private boolean mousePressed;

	Rocket rocket = new Rocket();
	Clone clone = new Clone();
	Clone2 clone2 = new Clone2();
	Clone3 clone3 = new Clone3();
	Seeker seeker = new Seeker();
	CloneTogether cloneTogether = new CloneTogether();
	Laser laser = new Laser();
	Laser2 laser2 = new Laser2();
	Laser3 laser3 = new Laser3();
	Follower follower = new Follower();
	CloneTogether2 cloneTogether2 = new CloneTogether2();
	CloneTogether3 cloneTogether3 = new CloneTogether3();
	Bullet bullet = new Bullet();

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
			Clone = ImageIO.read(this.getClass().getResourceAsStream("clone.png"));

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
		try {
			CloneTogether = ImageIO.read(this.getClass().getResourceAsStream("CloneTogether.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Laser = ImageIO.read(this.getClass().getResourceAsStream("Laser.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Warning = ImageIO.read(this.getClass().getResourceAsStream("Warning.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Warning2 = ImageIO.read(this.getClass().getResourceAsStream("Warning.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Laser2 = ImageIO.read(this.getClass().getResourceAsStream("Laser.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Warning3 = ImageIO.read(this.getClass().getResourceAsStream("Warning.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Laser3 = ImageIO.read(this.getClass().getResourceAsStream("Laser.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Warning4 = ImageIO.read(this.getClass().getResourceAsStream("Warning.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Follower = ImageIO.read(this.getClass().getResourceAsStream("Follower.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CloneTogether2 = ImageIO.read(this.getClass().getResourceAsStream("CloneTogether.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			CloneTogether3 = ImageIO.read(this.getClass().getResourceAsStream("CloneTogether.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Bullet = ImageIO.read(this.getClass().getResourceAsStream("Bullet.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Clone2 = ImageIO.read(this.getClass().getResourceAsStream("Clone.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Clone3 = ImageIO.read(this.getClass().getResourceAsStream("Clone.png"));

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
		for(Rectangle r: rocket.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}

	}

	public void drawAlien(Graphics g) {
		g.drawImage(Clone, (int) clone.x, (int) clone.y, null);
		for(Rectangle r: clone.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		g.drawImage(Clone2, (int) clone2.x, (int) clone2.y, null);
		for(Rectangle r: clone2.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		g.drawImage(Clone3, (int) clone3.x, (int) clone3.y, null);
		for(Rectangle r: clone3.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		// g.drawImage(Seeker, seeker.x, seeker.y, null);
		g.drawImage(CloneTogether, cloneTogether.x, cloneTogether.y, null);
		for(Rectangle r: cloneTogether.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		g.drawImage(Laser, laser.x, laser.y, null);
		for(Rectangle r: laser.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
	g.drawImage(Laser2, laser2.x, laser2.y, null);
	for(Rectangle r: laser2.getHitboxes()) {
		Graphics2D G2 = (Graphics2D) g;
		G2.draw(r);
	}
	//	g.drawImage(Bullet, bullet.x, bullet.y, null);
		g.drawImage(Laser3, laser3.x, laser3.y, null);
		for(Rectangle r: laser3.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		follower.moveTo(rocket);
		g.drawImage(Follower, follower.x, follower.y, null);
		for(Rectangle r: follower.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		g.drawImage(CloneTogether2, cloneTogether2.x, cloneTogether2.y, null);
		for(Rectangle r: cloneTogether2.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		g.drawImage(CloneTogether3, cloneTogether3.x, cloneTogether3.y, null);
		for(Rectangle r: cloneTogether3.getHitboxes()) {
			Graphics2D G2 = (Graphics2D) g;
			G2.draw(r);
		}
		if (laser.x > 800) {
			g.drawImage(Warning, 20, laser.y, null);
			
		}
		if (laser2.x > 800) {
			g.drawImage(Warning2, 20, laser2.y, null);
			
		}
		if (laser3.x > 800) {
			g.drawImage(Warning3, 20, laser3.y, null);
			
		}

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
			drawAlien(g);
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
			clone.invade();
			clone2.invade();
			clone3.invade();

			cloneTogether.invade();
			laser.invade();
			laser2.invade();
			laser3.invade();
			cloneTogether2.invade();
			cloneTogether3.invade();
			follower.invade();
			checkCollision();
		}

	}
	private void checkCollision(){
		if(rocket.hitBoxes.get(0).intersects(follower.hitBoxes.get(0))) {
			System.out.println("hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether.hitBoxes.get(0))){
			System.out.println("cloneTogetherHit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether.hitBoxes.get(1))){
			System.out.println("cloneTogetherHit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether.hitBoxes.get(2))){
			System.out.println("cloneTogetherHit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether.hitBoxes.get(3))){
			System.out.println("cloneTogetherHit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether.hitBoxes.get(4))){
			System.out.println("cloneTogetherHit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether.hitBoxes.get(5))){
			System.out.println("cloneTogetherHit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether2.hitBoxes.get(0))){
			System.out.println("cloneTogether2Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether2.hitBoxes.get(1))){
			System.out.println("cloneTogether2Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether2.hitBoxes.get(2))){
			System.out.println("cloneTogether2Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether2.hitBoxes.get(3))){
			System.out.println("cloneTogether2Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether2.hitBoxes.get(4))){
			System.out.println("cloneTogether2Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether2.hitBoxes.get(5))){
			System.out.println("cloneTogether2Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether3.hitBoxes.get(0))){
			System.out.println("cloneTogether3Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether3.hitBoxes.get(1))){
			System.out.println("cloneTogether3Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether3.hitBoxes.get(2))){
			System.out.println("cloneTogether3Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether3.hitBoxes.get(3))){
			System.out.println("cloneTogether3Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether3.hitBoxes.get(4))){
			System.out.println("cloneTogether3Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(cloneTogether3.hitBoxes.get(5))){
			System.out.println("cloneTogether3Hit");
		}
		if(rocket.hitBoxes.get(0).intersects(laser.hitBoxes.get(0))) {
			System.out.println("laser hit");
		}
		if(rocket.hitBoxes.get(0).intersects(laser2.hitBoxes.get(0))) {
			System.out.println("laser hit");
		}
		if(rocket.hitBoxes.get(0).intersects(laser3.hitBoxes.get(0))) {
			System.out.println("laser hit");
		}
		if(rocket.hitBoxes.get(0).intersects(clone.hitBoxes.get(0))) {
			System.out.println("clone hit");
		}
		if(rocket.hitBoxes.get(0).intersects(clone2.hitBoxes.get(0))) {
			System.out.println("clone2 hit");
		}
		if(rocket.hitBoxes.get(0).intersects(clone3.hitBoxes.get(0))) {
			System.out.println("clone3 hit");
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
		// if (e.getKeyCode() == KeyEvent.VK_SPACE) {
		// System.out.println("TAKE ME TO YOUR LEADER");
		// drawAlien(g);
		// }
	}
}
