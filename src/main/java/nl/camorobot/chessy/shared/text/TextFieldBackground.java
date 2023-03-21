package nl.camorobot.chessy.shared.text;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import javafx.scene.paint.Color;

public class TextFieldBackground extends RectangleEntity {

    public TextFieldBackground(final Coordinate2D initialPosition, final Size size) {
        this(initialPosition, size, Color.BLACK);

    }

    public TextFieldBackground(final Coordinate2D initialPosition, final Size size, final Color fillColor) {
        super(initialPosition);

        setStrokeWidth(1);
        setFill(fillColor);
        setWidth(size.width());
        setHeight(size.height());
        setArcWidth(10);
        setArcHeight(10);
    }
}
