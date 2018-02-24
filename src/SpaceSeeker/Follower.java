package SpaceSeeker;

import java.util.ArrayList;

public class Follower {
	int x = 250;
	int y = 250;
	ArrayList<Integer> trailY = new ArrayList<>();
	ArrayList<Integer> trailX = new ArrayList<>();

	void invade() {
		// if(rocket.x && rocket.y = x & y) {
		// currentState == ENDSTATE;
		// }
	}

	void moveTo(Rocket rocket) {
		if (trailY.size() < 100) {
			trailY.add(rocket.y);
			trailX.add(rocket.x);
			
		} else {
			trailY.remove(0);
			trailX.remove(0);
		}
		if (trailY.get(0) < y) {
			y-=2;
		}
		if (trailY.get(0) > y) {
			y+=2;
		}
		if (trailX.get(0) < x) {
			x-=2;
		}
		if (trailX.get(0) > x) {
			x+=2;
		}
	}
}
