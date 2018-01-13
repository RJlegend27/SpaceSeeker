package SpaceSeeker;

public class Seeker {

	int x = 70;
	int y = 50;
	int speed = 5;
	
	void invade() {
		y+=speed;
		if(y == 500) {
			y = 50;
		}
		
	}
}

