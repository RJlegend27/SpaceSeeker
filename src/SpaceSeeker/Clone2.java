package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class Clone2 implements Collideable {

	ArrayList<Rectangle> hitBoxes;

	float x = 120;
	float y = 200;
	float speed = 5;
	int xspeed = 5;
	float i = 1;
	Clone2() {
		hitBoxes = new ArrayList<>();
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
	}
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
	

update();

}
void update() {
for (int i = 0; i < hitBoxes.size(); i++) {

	hitBoxes.get(i).setBounds((int)x+43, (int)y + i * 10 +50, 41, 25);

}
}
@Override
public ArrayList<Rectangle> getHitboxes() {
// TODO Auto-generated method stub
return hitBoxes;
}
}

