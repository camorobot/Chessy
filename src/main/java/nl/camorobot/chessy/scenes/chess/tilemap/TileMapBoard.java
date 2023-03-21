package nl.camorobot.chessy.scenes.chess.tilemap;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.scenes.TileMap;
import nl.camorobot.chessy.scenes.chess.tilemap.entitys.ChessEntityTile;

public class TileMapBoard extends TileMap {

    public TileMapBoard(){
    }

    public TileMapBoard(final Coordinate2D location, final Size size){
        super(location, size);
    }

    @Override
    public void setupEntities() {
        // white pieces
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
                {7,7,7,7,7,7,7,7},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {1,1,1,1,1,1,1,1},
                {2,3,4,5,6,4,3,2}
        };
    }
}
