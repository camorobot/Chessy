package nl.camorobot.chessy.scenes.chess.tilemap;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.TileMap;
import nl.camorobot.chessy.scenes.chess.tilemap.entitys.ChessEntityTile;

import java.util.ArrayList;
import java.util.Arrays;

public class TileMapBoard extends TileMap {

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
                {0,0,0 ,0 ,0 ,0 ,0,0},
                {1,1,1 ,1 ,1 ,1 ,1,1},
                {2,3,4 ,5 ,6 ,4 ,3,2}
        };
    }

    public int getMapId(Coordinate2D startLocation){
        // row 1
        if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() > 0 && startLocation.getY() <= 100)){
            return (mapId.get(0));
        } else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(1));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(2));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(3));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(4));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(5));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(6));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 0 && startLocation.getY() <= 100)){
            return (mapId.get(7));
        }

        // row 2
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(8));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(9));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(10));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(11));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(12));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(13));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(14));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 101 && startLocation.getY() <= 200)){
            return (mapId.get(15));
        }

        // row 3
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(16));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(17));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(18));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(19));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(20));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(21));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(22));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 201 && startLocation.getY() <= 300)){
            return (mapId.get(23));
        }

        // row 4
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(24));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(25));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(26));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(27));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(28));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(29));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(30));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 301 && startLocation.getY() <= 400)){
            return (mapId.get(31));
        }

        // row 5
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(32));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(33));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(34));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(35));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() > 401 && startLocation.getY() <= 500)){
            return (mapId.get(36));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(37));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(38));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 401 && startLocation.getY() <= 500)){
            return (mapId.get(39));
        }

        // row 6
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(40));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(41));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(42));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(43));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(44));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(45));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(46));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 501 && startLocation.getY() <= 600)){
            return (mapId.get(47));
        }

        // row 7
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(48));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(49));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(50));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(51));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(52));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(53));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(54));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 601 && startLocation.getY() <= 700)){
            return (mapId.get(55));
        }

        // row 8
        else if((startLocation.getX() >= 0 && startLocation.getX() <= 100) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(56));
        }else if((startLocation.getX() >= 101 && startLocation.getX() <= 200) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(57));
        }else if((startLocation.getX() >= 201 && startLocation.getX() <= 300) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(58));
        }else if((startLocation.getX() >= 301 && startLocation.getX() <= 400) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(59));
        }else if((startLocation.getX() >= 401 && startLocation.getX() <= 500) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(60));
        }else if((startLocation.getX() >= 501 && startLocation.getX() <= 600) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(61));
        }else if((startLocation.getX() >= 601 && startLocation.getX() <= 700) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(62));
        }else if((startLocation.getX() >= 701 && startLocation.getX() <= 800) && (startLocation.getY() >= 701 && startLocation.getY() <= 800)){
            return (mapId.get(63));
        } else {
            return 99;
        }
    }
}
