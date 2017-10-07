package SpaceSeeker;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;


public class Menu extends JPanel implements ActionListener {
	JFrame frame;
	Timer timer;
	static final int HEIGHT = 500;
	static final int WIDTH = 500;
	SpaceSeeker spaceSeeker;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Menu();
			}
		});

	}
	
	Menu(){
		spaceSeeker = new SpaceSeeker();
		frame = new JFrame();
		start();
		
	}
	void start(){
		timer=new Timer(1000/60,this);
		frame.setVisible(true);
		timer.start();
		frame.add(this);
		frame.setSize(WIDTH, HEIGHT);
	
	}
	void drawMenu(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 100, 500);
		g.setColor(Color.CYAN);
		g.fillRect(100,0,100,500);
		g.setColor(Color.WHITE);
		g.fillRect(200, 0, 100, 500);
		g.setColor(Color.CYAN);
		g.fillRect(300, 0, 100, 500);
		g.setColor(Color.BLUE);
		g.fillRect(400, 0, 100, 500);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//super.paintComponents(g);
		drawMenu(g);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}