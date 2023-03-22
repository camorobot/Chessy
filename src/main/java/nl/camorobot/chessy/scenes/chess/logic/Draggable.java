package nl.camorobot.chessy.scenes.chess.logic;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;
import com.github.hanyaeger.api.userinput.MouseDraggedListener;
import javafx.scene.paint.Color;
import nl.camorobot.chessy.scenes.chess.tilemap.TileMapBoard;
import nl.camorobot.chessy.shared.text.TextFieldBackground;


public class Draggable extends SpriteEntity implements MouseDraggedListener {

    private Coordinate2D initialPosition;
    private Coordinate2D location;
    private boolean isDragged = false;
    private TileMapBoard tileMapBoard = new TileMapBoard();


//    private double definedHue;
//    private double definedSaturation;

//    public Draggable(final Coordinate2D initialPosition, final Color color, final double definedHue, final double definedSaturation) {
//        super(initialPosition, new Size(20, 20), color);
//
//        this.initialPosition = initialPosition;
//        this.definedHue = definedHue;
//        this.definedSaturation = definedSaturation;
//    }

    public Draggable(final String image, final Coordinate2D initialPosition, final Size size){
        super(image, initialPosition, size);
        this.initialPosition = initialPosition;
    }

    @Override
    public void onDragged(final Coordinate2D coordinate2D) {
        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setAnchorLocation(coordinate2D);
        if(!isDragged){
            System.out.println("update");
            isDragged = true;
            location = coordinate2D;
        }
    }

    @Override
    public void onDropped(final Coordinate2D coordinate2D) {
        setAnchorLocation(initialPosition);
        System.out.println("source: " + location+ " MapID: "+ tileMapBoard.getMapId(location));
        System.out.println("coordinate2D: " +coordinate2D + " MapID: " +tileMapBoard.getMapId(coordinate2D));


        // update de start locatie naar de eindlocatie
        tileMapBoard.setMapPiece(tileMapBoard.getMapId(location), tileMapBoard.getMapId(coordinate2D), this);
        isDragged = false;
    }

//    public double getDefinedHue() {
//        return definedHue;
//    }
//
//    public double getDefinedSaturation() {
//        return definedSaturation;
//    }
}
