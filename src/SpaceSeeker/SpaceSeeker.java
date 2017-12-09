package SpaceSeeker;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.SwingUtilities;

public class SpaceSeeker extends Menu{
	public static BufferedImage Rocketship;
	public static BufferedImage RocketMove;
	Rocket rocket = new Rocket();
	
	
	SpaceSeeker() {
		
		if(currentState == GAME_STATE) {
			
		}
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SpaceSeeker();
				
			}
		});

	}
	
}



