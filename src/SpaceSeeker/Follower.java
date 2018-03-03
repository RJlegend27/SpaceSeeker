package SpaceSeeker;

import java.awt.Rectangle;
import java.util.ArrayList;

public class Follower implements Collideable {
	int x = 250;
	int y = 250;
	ArrayList<Integer> trailY = new ArrayList<>();
	ArrayList<Integer> trailX = new ArrayList<>();
	ArrayList<Rectangle> hitBoxes;

	Follower() {
		hitBoxes = new ArrayList<>();
		hitBoxes.add(new Rectangle(0, 0, 20, 20));
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));
//		
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));
//		hitBoxes.add(new Rectangle(0, 0, 25, 25));


	}

	void invade() {
		// if(rocket.x && rocket.y = x & y) {
		// currentState == ENDSTATE;
		// }
	}

	void moveTo(Rocket rocket) {
		if (trailY.size() < 100) {
			trailY.add(rocket.y+15);
			trailX.add(rocket.x+14);

		} else {
			trailY.remove(0);
			trailX.remove(0);
		}
		if (trailY.get(0) < y) {
			y -= 2;
		}
		if (trailY.get(0) > y) {
			y += 2;
		}
		if (trailX.get(0) < x) {
			x -= 2;
		}
		if (trailX.get(0) > x) {
			x += 2;
		}
		update();
	}

	void update() {
		for (int i = 0; i < hitBoxes.size(); i++) {
			
			hitBoxes.get(i).setBounds(x+22, y+i*10+22, 19, 19);

		}
	}

	@Override
	public ArrayList<Rectangle> getHitboxes() {
		// TODO Auto-generated method stub
		return hitBoxes;
	}
}
