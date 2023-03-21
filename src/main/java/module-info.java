module Chessy {
    requires hanyaeger;

    exports nl.camorobot.chessy;
    exports nl.camorobot.chessy.scenes.chess.tilemap.entitys;

    opens backgrounds;
    opens sprites;

}
