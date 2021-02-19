package terrain;

import javafx.scene.image.Image;
import main.GameApplication;

// TODO: Also setup the Images for Water Animation.
// Use "static {}" to initialize static fields.
// You may change ANIM_TIME_PER_FRAME to your own preference.
// Refer to Lab 12.

public class Water extends Terrain {
	private static final Image IMAGE_WATER;//  = new Image("terrain_images/Plains.png");
	public static final int NUM_ANIM_FRAMES;
	private static final Image[] ANIM_FRAMES;
	public static final int ANIM_TIME_PER_FRAME;
	
	static {
		IMAGE_WATER = new Image("terrain_images/water1.png",GameApplication.TILE_WIDTH, GameApplication.TILE_HEIGHT, true, true);
		NUM_ANIM_FRAMES = 4;
		ANIM_FRAMES = new Image[NUM_ANIM_FRAMES];
		for(int i = 0 ; i < NUM_ANIM_FRAMES ; i++) 
			ANIM_FRAMES[i] = new Image("terrain_images/water"+ Integer.toString(i+1) +".png", GameApplication.TILE_WIDTH, GameApplication.TILE_HEIGHT, true, true);
		ANIM_TIME_PER_FRAME = 1000;
	}
	
	public Water(){
		super(-1);	
	}
	@Override
	public Image getImage() {
		return IMAGE_WATER;
	}

	public Image getAnimFrame(int index) {
		return ANIM_FRAMES[index];
	}
}