package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class CloneTogether3 {

	int x = 350;
	int y = -180;
	int speed = 3;
	int xspeed = 10;
	
	void invade() {
		y+=speed;
		if(y > 450) {
			y = -50;
		}
	}
}
