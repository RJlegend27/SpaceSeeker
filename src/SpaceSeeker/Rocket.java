package SpaceSeeker;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rocket extends Menu{
	public static BufferedImage Rocketship;
	public static BufferedImage RocketMove;

	Rocket() {
		try {
			Rocketship = ImageIO.read(this.getClass().getResourceAsStream("Rocket.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			RocketMove = ImageIO.read(this.getClass().getResourceAsStream("RocketMove.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		if(currentState == GAME_STATE) {
			draw(g);
		}
	}
	void draw(Graphics g) {
		g.drawImage(Rocketship, 100, 100, null);
		
	}
}
