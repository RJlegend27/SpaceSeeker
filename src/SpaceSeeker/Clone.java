package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class Clone {

	int x = 0;
	int y = -350;
	int speed = 3;
	
	void invade() {
		y+=speed;
		if(y == 700) {
			y = -350;
		}
		
	}
}

