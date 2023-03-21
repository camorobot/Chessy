package nl.camorobot.chessy.scenes.chess.tilemap.entitys;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class ChessEntityTile extends SpriteEntity {
    public ChessEntityTile(final Coordinate2D location, final Size size, final ChessPiece chessPiece) {
        super(chessPiece.sprite, location, size);
    }

    public enum ChessPiece {
        WHITE_PION("sprites/WHITE_PAWN.png"),
        WHITE_ROOK("sprites/WHITE_ROOK.png"),
        WHITE_BISHOP("sprites/WHITE_BISHOP.png"),
        WHITE_KNIGHT("sprites/WHITE_KNIGHT.png"),
        WHITE_KING("sprites/WHITE_KING.png"),
        WHITE_QUEEN("sprites/WHITE_QUEEN.png"),
        BLACK_PION("sprites/BLACK_PAWN.png"),
        BLACK_ROOK("sprites/BLACK_ROOK.png"),
        BLACK_BISHOP("sprites/BLACK_BISHOP.png"),
        BLACK_KNIGHT("sprites/BLACK_KNIGHT.png"),
        BLACK_KING("sprites/BLACK_KING.png"),
        BLACK_QUEEN("sprites/BLACK_QUEEN.png");

        String sprite;

        ChessPiece(String sprite) {
            this.sprite = sprite;
        }
    }
}
