package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class Clone2 {

	float x = 120;
	float y = 200;
	float speed = 5;
	int xspeed = 5;
	float i = 1;

	void invade() {
		y += Math.sin(i) * speed;
		x += Math.cos(i) * speed;
		i += 0.04;
		if(y == 180) {
			
		}

		// if(x > 410 || x < -50) {
		// xspeed = -xspeed;
		// }
		// if(y > 400 || y < -50) {
		// speed = -speed;
		// }
		//
	}
}
