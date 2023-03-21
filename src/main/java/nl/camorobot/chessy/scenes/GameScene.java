package nl.camorobot.chessy.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import nl.camorobot.chessy.Chessy;
import nl.camorobot.chessy.scenes.chess.tilemap.TileMapBoard;


public class GameScene extends DynamicScene implements TileMapContainer{

    private static final double MARGIN = 100d;
    private Chessy chessy;

    public GameScene(Chessy chessy){
        this.chessy = chessy;
    }

    @Override
    public void setupScene() {
    setBackgroundImage("backgrounds/Chessboard.png");
    }

    @Override
    public void setupEntities() {

    }

    @Override
    public void setupTileMaps() {
        var fullScreenMap = new TileMapBoard();
        addTileMap(fullScreenMap);

//        var centerRightMap = new TileMapBoard(new Coordinate2D(getWidth() - MARGIN, getHeight() / 2), new Size(100, 100));
//        centerRightMap.setAnchorPoint(AnchorPoint.CENTER_RIGHT);
//        addTileMap(centerRightMap);
    }
}
