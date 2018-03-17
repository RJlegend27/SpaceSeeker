package SpaceSeeker;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;

public class Laser implements Collideable {

	ArrayList<Rectangle> hitBoxes;
	Random r = new Random();
	int y = r.nextInt(260) + 20;
	int x = 100;
	int speed = 0;
	int xspeed = 10;
	Laser() {
		hitBoxes = new ArrayList<>();
		hitBoxes.add(new Rectangle((int)x, (int) y, 20, 20));
	}
	void invade() {
		y+=speed;
		x+=xspeed;
		if (x > 2000) {
			x = -10;
		}
		if(x == 600) {
			Random r = new Random();
			 y = r.nextInt(300) + 20;
		}
	update();
	}
	


void update() {
	for (int i = 0; i < hitBoxes.size(); i++) {

		hitBoxes.get(i).setBounds((int)x+20, (int)y + i * 10 + 29 , 24, 5 );

	}
}
@Override
public ArrayList<Rectangle> getHitboxes() {
	// TODO Auto-generated method stub
	return hitBoxes;
}
}
