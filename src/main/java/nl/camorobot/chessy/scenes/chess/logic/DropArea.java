package nl.camorobot.chessy.scenes.chess.logic;


import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.entities.impl.RectangleEntity;
import com.github.hanyaeger.api.userinput.*;
import javafx.scene.paint.Color;
import nl.camorobot.chessy.shared.text.TextFieldBackground;


public class DropArea extends TextFieldBackground implements MouseDragEnterListener, MouseDragExitedListener, MouseDropListener {

//    private final RocketSpawner rocketSpawner;

    public DropArea(final Coordinate2D initialPosition, final Size size) {
        super(initialPosition, size);
        setFill(Color.rgb(100,100,100,0.4));
    }

    @Override
    public void onDragEntered(final Coordinate2D coordinate2D, final MouseDraggedListener source) {
        if (source instanceof RectangleEntity rectangle) {
            setFill(rectangle.getFill());
        }
    }

    @Override
    public void onDragExited(final Coordinate2D coordinate2D, final MouseDraggedListener source) {
        setFill(Color.rgb(100,100,100,0.4));
    }

    @Override
    public void onDrop(final Coordinate2D coordinate2D, final MouseDraggedListener source) {
        System.out.println(coordinate2D);
        if (source instanceof Draggable draggable) {
//            rocketSpawner.setHue(draggable.getDefinedHue());
//            rocketSpawner.setSaturation(draggable.getDefinedSaturation());
        }
    }
}

