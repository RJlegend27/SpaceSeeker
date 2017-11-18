package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class SpaceSeeker {
	public static BufferedImage Rocket;
	public static BufferedImage RocketMove;

	SpaceSeeker() {
		SpaceSeeker rocket = new SpaceSeeker();

		try {
			Rocket = ImageIO.read(this.getClass().getResourceAsStream("Rocket.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			RocketMove = ImageIO.read(this.getClass().getResourceAsStream("RocketMove.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void draw(Graphics g) {
		g.drawImage(Rocket, 250, 250, null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SpaceSeeker();
			}
		});

	}
}
