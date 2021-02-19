package terrain;

import javafx.scene.image.Image;
import main.GameApplication;

public class Mountain extends Terrain {
	private final Image IMAGE_MOUNTAIN = new Image("terrain_images/Mountain.png",GameApplication.TILE_WIDTH, GameApplication.TILE_HEIGHT, true, true);
	
	public Mountain(){
		super(-1);

	}
	@Override
	public Image getImage() {
		return IMAGE_MOUNTAIN;
	}
	
}