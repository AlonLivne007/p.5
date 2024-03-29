//Alon Livne (ID: 208688762)
package gameFlow;

import biuoop.DrawSurface;

import java.util.ArrayList;
import java.util.List;

import sprites.Sprite;

/**
 * The SpriteCollection class holds a collection of sprites in the game.
 * It provides methods for the sprites.
 */
public class SpriteCollection {
    private List<Sprite> spriteList;

    /**
     * Constructs a new SpriteCollection with an empty list of sprites.
     */
    public SpriteCollection() {
        this.spriteList = new ArrayList<>();
    }

    /**
     * Adds a sprite to the collection.
     *
     * @param s The sprite to be added.
     */
    public void addSprite(Sprite s) {
        spriteList.add(s);
    }

    /**
     * Remove the given sprite from the list of sprites.
     *
     * @param s The sprite to be removed.
     */
    public void removeSprite(Sprite s) {
        spriteList.remove(s);
    }

    /**
     * Calls the timePassed() method on all sprites in the collection.
     * This method is typically invoked in each frame of the game.
     */
    public void notifyAllTimePassed() {
        List<Sprite> sprites = new ArrayList<>(this.spriteList);
        for (Sprite s : sprites) {
            s.timePassed();
        }
    }

    /**
     * Calls the drawOn(d) method on all sprites in the collection,
     * where 'd' is the DrawSurface on which the sprites should be drawn.
     *
     * @param d The DrawSurface on which the sprites should be drawn.
     */
    public void drawAllOn(DrawSurface d) {
        List<Sprite> sprites = new ArrayList<>(this.spriteList);
        for (Sprite s : sprites) {
            s.drawOn(d);
        }
    }
}
