package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class Clone {

	int x = 0;
	int y = 0;
	int speed = 5;
	int xspeed = 10;
	
	void invade() {
		y+=speed;
		x+=xspeed;
		if(x > 480 || x < 0) {
			xspeed = -xspeed;
		}
		if(y > 480 || y < 0) {
			speed = -speed;
		}
		
	}
}

