package SpaceSeeker;

public class Seeker {

	int x = 70;
	int y = 50;
	int speed = 1;
	double xspeed = 5.5;
	void invade() {
		y+=speed;
		x+=xspeed;
		if(x > 400 || x < 0) {
			xspeed = -xspeed;
		}
		if(x == 30) {
			xspeed = 5.5;
		}
		if(y > 400 || y < 0) {
			speed = -speed;
		}

//	//	if(x == 400) {
//			y = 50;
//			x = 0;
//		}
//		if(y == 400) {
//			y = 50;
//			x = 0;
//			
//		}
		
	}
}

