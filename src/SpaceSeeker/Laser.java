package SpaceSeeker;

public class Laser {
	int x = 100;
	int y = 220;
	int speed = 0;
	int xspeed = 10;

	void invade() {
		y+=speed;
		x+=xspeed;
		if(x > 2000) {
			x = -10;
		}
	}

}
