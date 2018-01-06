package SpaceSeeker;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Rocket {



	int x = 150;
	int y = 150;
	int speed = 3;
	public boolean up;
	public boolean down;
	public boolean right;
	public boolean left;
	
	void move() {
		
		if (up) {
			y -= speed;
		}
		if (right)

		{
			x += speed;
		}
		if (left)

		{
			x -= speed;
		}
		if (down)

		{
			y += speed;
		}
	}

	}

	

	



