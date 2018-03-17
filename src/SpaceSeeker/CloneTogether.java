package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class CloneTogether implements Collideable{
	ArrayList<Rectangle> hitBoxes;
	int x = 180;
	int y = -100;
	int speed = 3;
	int xspeed = 10;
	CloneTogether() {
		hitBoxes = new ArrayList<>();
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
		
	}
	void invade() {
		y+=speed;
		if(y > 450) {
			y = -100;
		}
		update();
		
	}
	void update() {
		

			hitBoxes.get(0).setBounds((int)x+86, (int)y - 0 * 10 +65, 22, 22);
			hitBoxes.get(1).setBounds((int)x+96, (int)y - 1 * 10 +56, 22, 22);
			hitBoxes.get(2).setBounds((int)x+106, (int)y - 2 * 10 +48, 22, 22);
			
			hitBoxes.get(3).setBounds((int)x+18, (int)y - 3 * 10 +96, 22, 22);
			hitBoxes.get(4).setBounds((int)x+8, (int)y - 4 * 10 +88, 21, 20);
			hitBoxes.get(5).setBounds((int)x-2, (int)y - 5 * 10 +79, 22, 22);
			

		
		
	}
	@Override
	public ArrayList<Rectangle> getHitboxes() {
		// TODO Auto-generated method stub
		return hitBoxes;
	}
}
