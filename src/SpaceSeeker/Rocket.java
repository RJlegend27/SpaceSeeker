package SpaceSeeker;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rocket extends Menu implements ActionListener{
	
	

	

	/*if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	rocket.right = true;
}
if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	rocket.left = true;
}
if (e.getKeyCode() == KeyEvent.VK_UP) {
	rocket.up = true;
}
if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	rocket.down = true;
}*/
	
	
	Rocket() {
		
		Rocket rocket = new Rocket();
		if(currentState == GAME_STATE) {
			frame.add(rocket);
			rocket.setVisible(true);
			this.add(rocket);
			
		}
	}
	
	
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		
	}
	
	
}
