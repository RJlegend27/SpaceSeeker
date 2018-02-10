package SpaceSeeker;

import java.util.Random;

public class Laser {
	Random r = new Random();
	int y = r.nextInt(260) + 20;
	int x = 100;
	int speed = 0;
	int xspeed = 10;

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
	}
	

}
