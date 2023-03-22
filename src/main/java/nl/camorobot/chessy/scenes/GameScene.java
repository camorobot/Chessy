package nl.camorobot.chessy.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.DynamicScene;
import com.github.hanyaeger.api.scenes.TileMapContainer;
import javafx.scene.paint.Color;
import nl.camorobot.chessy.Chessy;
import nl.camorobot.chessy.scenes.chess.logic.Draggable;
import nl.camorobot.chessy.scenes.chess.logic.DropArea;
import nl.camorobot.chessy.scenes.chess.tilemap.TileMapBoard;

import java.util.ArrayList;


public class GameScene extends DynamicScene implements TileMapContainer{

    private static final double MARGIN = 100d;
    private static final double CONTROL_AREA_MARGIN = 140D;
    private static final double TEXTFIELD_MARGIN = 20D;

    private Chessy chessy;
    private static GameScene gameScene = new GameScene(Chessy.getChessy());

    ArrayList<Draggable> pieceOnBoard = new ArrayList<>();
    ArrayList<DropArea> dropBoard = new ArrayList<>();


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

        /**
         * maak alle drop items aan en plaats ze op het bord
         * */
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                DropArea dropArea = new DropArea(new Coordinate2D(0 + ((getWidth() / 8) * i), 0 + ((getHeight() / 8) * j)), new Size(getWidth() / 8, getHeight() / 8));
                dropArea.setAnchorPoint(AnchorPoint.TOP_LEFT);
                dropBoard.add(dropArea);
            }
        }

        for(int i = 0; i< dropBoard.size(); i++){
            addEntity(dropBoard.get(i));
        }

        String sprite = "sprites/WHITE_ROOK.png";
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if (j == 1) {
                    sprite = "sprites/BLACK_PAWN.png";
                }else if(j == 0 && i == 0 || j == 0 && i == 7){
                    sprite = "sprites/BLACK_ROOK.png";
                } else if(j == 0 && i == 1 || j == 0 && i == 6) {
                    sprite = "sprites/BLACK_KNIGHT.png";
                } else if(j == 0 && i == 2 || j == 0 && i == 5){
                    sprite = "sprites/BLACK_BISHOP.png";
                } else if (j == 0 && i == 3){
                    sprite = "sprites/BLACK_QUEEN.png";
                } else if( j == 0 && i == 4){
                    sprite = "sprites/BLACK_KING.png";
                }

                else if(j == 6){
                    sprite = "sprites/WHITE_PAWN.png";
                }else if(j == 7 && i == 0 || j == 7 && i == 7){
                    sprite = "sprites/WHITE_ROOK.png";
                } else if(j == 7 && i == 1 || j == 7 && i == 6) {
                    sprite = "sprites/WHITE_KNIGHT.png";
                } else if(j == 7 && i == 2 || j == 7 && i == 5){
                    sprite = "sprites/WHITE_BISHOP.png";
                } else if (j == 7 && i == 3){
                    sprite = "sprites/WHITE_QUEEN.png";
                } else if( j == 7 && i == 4){
                    sprite = "sprites/WHITE_KING.png";
                } else {
                    sprite = "sprites/transparent.png";
                }

                var draggablePiece = new Draggable(sprite,new Coordinate2D(0 + ((getWidth() / 8) * i) + 50, 0 + ((getHeight() / 8) * j) + 50), new Size(getWidth() / 11, getHeight() / 11));
                draggablePiece.setAnchorPoint(AnchorPoint.CENTER_CENTER);
                pieceOnBoard.add(draggablePiece);
            }
        }

        for(int i = 1; i< pieceOnBoard.size(); i++){
            addEntity(pieceOnBoard.get(i));
        }

//        public Draggable getPiece(){
//            return pieceOnBoard.get()
//        }
        System.out.println(pieceOnBoard.size());
        System.out.println(pieceOnBoard);
        System.out.println("setup tilemaps is done");
    }

    public void setPieceOnBord(int oldLocation, int newLocation, Draggable newPiece){
//        System.out.println(pieceOnBoard.get(newLocation));
        pieceOnBoard.set(oldLocation, newPiece);
//        System.out.println(pieceOnBoard.get(0));

        addEntity(pieceOnBoard.get(0));
    }

    public static GameScene getGameScene() {
        return gameScene;
    }
}
