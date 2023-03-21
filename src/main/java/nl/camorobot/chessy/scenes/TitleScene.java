package nl.camorobot.chessy.scenes;

import com.github.hanyaeger.api.AnchorPoint;
import com.github.hanyaeger.api.Coordinate2D;
import com.github.hanyaeger.api.scenes.StaticScene;
import nl.camorobot.chessy.Chessy;
import nl.camorobot.chessy.assets.buttons.StartButton;

public class TitleScene extends StaticScene {

    private Chessy chessy;

    public TitleScene(Chessy chessy){
        this.chessy = chessy;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/titleBackground.png");
    }

    @Override
    public void setupEntities() {
        StartButton startButton = new StartButton(new Coordinate2D(getWidth()/2, getHeight() /2+ 100), chessy);
        startButton.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(startButton);
    }
}
