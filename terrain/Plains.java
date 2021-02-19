package terrain;

import javafx.scene.image.Image;
import main.GameApplication;


public class Plains extends Terrain {
	private final Image IMAGE_PLAINS  = new Image("terrain_images/Plains.png",GameApplication.TILE_WIDTH, GameApplication.TILE_HEIGHT, true, true);
	
	public Plains(){
		super(1);
	}
	@Override
	public Image getImage() {
		return IMAGE_PLAINS;
	}
	
}