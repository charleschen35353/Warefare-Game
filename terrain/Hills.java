package terrain;

import javafx.scene.image.Image;
import main.GameApplication;

public class Hills extends Terrain {
	private final Image IMAGE_HILLS = new Image("terrain_images/Hills.png",GameApplication.TILE_WIDTH, GameApplication.TILE_HEIGHT, true, true);
	
	public Hills(){
		super(3);
	}
	@Override
	public Image getImage() {
		return IMAGE_HILLS;
	}
	
}