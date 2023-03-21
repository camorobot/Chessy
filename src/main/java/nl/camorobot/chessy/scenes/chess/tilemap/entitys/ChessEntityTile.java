package nl.camorobot.chessy.scenes.chess.tilemap.entitys;

import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.SpriteEntity;

public class ChessEntityTile extends SpriteEntity {
    public ChessEntityTile(final Coordinate2D location, final Size size, final ChessPiece chessPiece) {
        super(chessPiece.sprite, location, size);
    }

    public enum ChessPiece {
        WHITE_PION("sprites/w_pawn_2x_ns.png"),
        WHITE_ROOK("sprites/w_rook_2x_ns.png"),
        WHITE_BISHOP("sprites/w_bishop_2x_ns.png"),
        WHITE_KNIGHT("sprites/w_knight_2x_ns.png"),
        WHITE_KING("sprites/w_king_2x_ns.png"),
        WHITE_QUEEN("sprites/w_queen_2x_ns.png"),
        BLACK_PION("sprites/b_pawn_2x_ns.png"),
        BLACK_ROOK("sprites/b_rook_2x_ns.png"),
        BLACK_BISHOP("sprites/b_bishop_2x_ns.png"),
        BLACK_KNIGHT("sprites/b_knight_2x_ns.png"),
        BLACK_KING("sprites/b_king_2x_ns.png"),
        BLACK_QUEEN("sprites/b_queen_2x_ns.png");

        String sprite;

        ChessPiece(String sprite) {
            this.sprite = sprite;
        }
    }
}
