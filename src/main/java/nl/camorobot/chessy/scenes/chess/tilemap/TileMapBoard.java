package nl.camorobot.chessy.scenes.chess.tilemap;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.TileMap;
import nl.camorobot.chessy.scenes.GameScene;
import nl.camorobot.chessy.scenes.chess.logic.Draggable;
import nl.camorobot.chessy.scenes.chess.tilemap.entitys.ChessEntityTile;

import java.util.ArrayList;

public class TileMapBoard extends TileMap {

    private GameScene gameScene = GameScene.getGameScene();
    ArrayList <Integer> mapId = new ArrayList<Integer>();
    ArrayList <Integer> mapPieces = new ArrayList<Integer>();

    public TileMapBoard(){
        int[] pieces = {8, 9, 10, 11, 12, 10, 9, 8,
                7,7,7 ,7 ,7 ,7 ,7,7,
                0,0,0 ,0 ,0 ,0 ,0,0,
                0,0,0 ,0 ,0 ,0 ,0,0,
                0,0,0 ,0 ,0 ,0 ,0,0,
                0,0,0 ,0 ,0 ,0 ,0,0,
                1,1,1 ,1 ,1 ,1 ,1,1,
                2,3,4 ,5 ,6 ,4 ,3,2};

        for(int i = 0; i < 64; i++){
            mapId.add(i);
        }
        for(int i = 0; i < pieces.length; i++){
            mapPieces.add(pieces[i]);
        }

    }

    public TileMapBoard(final Coordinate2D location, final Size size){
        super(location, size);
    }

    @Override
    public void setupEntities() {
        // white pieces
        addEntity(0,ChessEntityTile.class, ChessEntityTile.ChessPiece.TRANSPARANT);
        addEntity(1, ChessEntityTile.class, ChessEntityTile.ChessPiece.WHITE_PION);
        addEntity(2, ChessEntityTile.class, ChessEntityTile.ChessPiece.WHITE_ROOK);
        addEntity(3, ChessEntityTile.class, ChessEntityTile.ChessPiece.WHITE_BISHOP);
        addEntity(4, ChessEntityTile.class, ChessEntityTile.ChessPiece.WHITE_KNIGHT);
        addEntity(5, ChessEntityTile.class, ChessEntityTile.ChessPiece.WHITE_KING);
        addEntity(6, ChessEntityTile.class, ChessEntityTile.ChessPiece.WHITE_QUEEN);

        // black pieces
        addEntity(7, ChessEntityTile.class, ChessEntityTile.ChessPiece.BLACK_PION);
        addEntity(8, ChessEntityTile.class, ChessEntityTile.ChessPiece.BLACK_ROOK);
        addEntity(9, ChessEntityTile.class, ChessEntityTile.ChessPiece.BLACK_BISHOP);
        addEntity(10, ChessEntityTile.class, ChessEntityTile.ChessPiece.BLACK_KNIGHT);
        addEntity(11, ChessEntityTile.class, ChessEntityTile.ChessPiece.BLACK_KING);
        addEntity(12, ChessEntityTile.class, ChessEntityTile.ChessPiece.BLACK_QUEEN);

    }

    @Override
    public int[][] defineMap() {

        return new int[][]{
                {8,9,10,11,12,10,9,8},
                {7,7,7 ,7 ,7 ,7 ,7,7},
                {0,0,0 ,0 ,0 ,0 ,0,0},
                {0,0,0 ,0 ,0 ,0 ,0,0},
                {0,0,0 ,0 ,0 ,0 ,0,0},
                {0,1,0 ,0 ,0 ,0 ,0,0},
                {1,1,1 ,1 ,1 ,1 ,1,1},
                {2,3,4 ,5 ,6 ,4 ,3,2}
        };
    }

    public int getMapPiece(int number){
        return mapPieces.get(number);
    }

    public void setMapPiece(int oldLocation, int newLocation, Draggable piece){
//        mapPieces.set(oldLocation, newLocation);
        gameScene.setPieceOnBord(oldLocation, newLocation, piece);
    }

    public int getMapId(Coordinate2D coordinate2D){
        // row 1
        if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() > 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(0));
        } else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(1));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(2));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(3));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(4));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(5));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(6));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 0 && coordinate2D.getY() <= 100)){
            return (mapId.get(7));
        }

        // row 2
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(8));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(9));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(10));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(11));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(12));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(13));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(14));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 101 && coordinate2D.getY() <= 200)){
            return (mapId.get(15));
        }

        // row 3
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(16));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(17));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(18));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(19));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(20));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(21));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(22));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 201 && coordinate2D.getY() <= 300)){
            return (mapId.get(23));
        }

        // row 4
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(24));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(25));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(26));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(27));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(28));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(29));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(30));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 301 && coordinate2D.getY() <= 400)){
            return (mapId.get(31));
        }

        // row 5
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(32));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(33));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(34));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(35));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() > 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(36));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(37));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(38));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 401 && coordinate2D.getY() <= 500)){
            return (mapId.get(39));
        }

        // row 6
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(40));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(41));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(42));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(43));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(44));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(45));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(46));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 501 && coordinate2D.getY() <= 600)){
            return (mapId.get(47));
        }

        // row 7
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(48));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(49));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(50));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(51));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(52));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(53));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(54));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 601 && coordinate2D.getY() <= 700)){
            return (mapId.get(55));
        }

        // row 8
        else if((coordinate2D.getX() >= 0 && coordinate2D.getX() <= 100) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(56));
        }else if((coordinate2D.getX() >= 101 && coordinate2D.getX() <= 200) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(57));
        }else if((coordinate2D.getX() >= 201 && coordinate2D.getX() <= 300) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(58));
        }else if((coordinate2D.getX() >= 301 && coordinate2D.getX() <= 400) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(59));
        }else if((coordinate2D.getX() >= 401 && coordinate2D.getX() <= 500) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(60));
        }else if((coordinate2D.getX() >= 501 && coordinate2D.getX() <= 600) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(61));
        }else if((coordinate2D.getX() >= 601 && coordinate2D.getX() <= 700) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(62));
        }else if((coordinate2D.getX() >= 701 && coordinate2D.getX() <= 800) && (coordinate2D.getY() >= 701 && coordinate2D.getY() <= 800)){
            return (mapId.get(63));
        } else {
            return 99;
        }
    }
}
