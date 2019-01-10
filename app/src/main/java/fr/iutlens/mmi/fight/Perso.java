package fr.iutlens.mmi.fight;

import android.graphics.RectF;

import java.util.List;

import fr.iutlens.mmi.fight.utils.SpriteSheet;

/**
 * Created by dubois on 05/12/2018.
 */

class Perso extends Sprite {
    public static final int SPEED = 12;
    private final List<Sprite> laser;
    private final int dxLaser;
    private final int dyLaser;
    int vx = 0;

    Perso(int id, float x, float y, List<Sprite> laser) {
        super(id, x, y);
        this.laser = laser;
        final SpriteSheet laserSprite = SpriteSheet.get(R.mipmap.bullet);

        dxLaser = sprite.w;
        dyLaser = (sprite.h-laserSprite.h)/2;
    }

    public void fire() {
        laser.add(new Sprite(R.mipmap.bullet,x+dxLaser,y+dyLaser, 20, 0));

    }
}
