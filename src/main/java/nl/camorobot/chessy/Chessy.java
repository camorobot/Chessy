package nl.camorobot.chessy;

import com.github.hanyaeger.api.Size;
import com.github.hanyaeger.api.YaegerGame;
import nl.camorobot.chessy.scenes.GameScene;
import nl.camorobot.chessy.scenes.TitleScene;

public class Chessy extends YaegerGame {

    private static Chessy chessy = new Chessy();
    private static GameScene gameScene = GameScene.getGameScene();

    public static void main(String args[]){
        launch(args);
    }

    @Override
    public void setupGame() {
        setGameTitle("Chessy");
        setSize(new Size(800, 800));

    }

    @Override
    public void setupScenes() {
        addScene(1, new TitleScene(this));
        addScene(2, gameScene);
    }

    public static Chessy getChessy(){
        return chessy;
    }
}
