package SpaceSeeker;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Rocket implements Collideable{


	ArrayList<Rectangle> hitBoxes;
	int x = 150;
	int y = 150;
	int speed = 5;
	public boolean up;
	public boolean down;
	public boolean right;
	public boolean left;
	Rocket(){
		hitBoxes = new ArrayList<>();
		hitBoxes.add(new Rectangle(x, y, 20, 20));
		
	}
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
		if(x>438) {
			x = 438;
		}
		if(x < -29) {
			x = -29;
		}
		if(y < -25) {
			y = -25;
		}
		if(y > 407) {
			y = 407;
		}
		update();
		
	}
	void update() {
		for (int i = 0; i < hitBoxes.size(); i++) {
			
			hitBoxes.get(i).setBounds(x+38, y+i*10+25, 15, 47);
		
		}
	}

	@Override
	public ArrayList<Rectangle> getHitboxes() {
		// TODO Auto-generated method stub
		return hitBoxes;
	}

	}

	

	



