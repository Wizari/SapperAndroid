package com.gmail.wizaripost.gameobjects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.gmail.wizaripost.data.SpriteField;

public class Tile {

    public static Sprite tile;
    public static Array<Sprite> tileField;
    public Vector2 position = new Vector2();// позиция зомби
    public float height, width; // размеры зомби
    public float scaleFactor; // коэффициент масштабирования зомби

    public enum State {CLOSE, OPEN, BUCKET}

    public State state = State.CLOSE;


    public static void initialize(float width, float height, int fieldLength, int fieldHeight, int amountMines) {
        tile = Cell.getTextureAtlas().createSprite("button");
        tileField = new Array<Sprite>();
//        Array<Sprite> tileField = new Array<Sprite>();
        int t = 0;
        int y = (10*50)-50;

        for (int i = 0; i < 10; i++, y -= 50) {
            int x = 0;
            System.out.println();
            for (int j = 0; j < 10; j++, x += 50, t++) {
                Sprite sprite = new Sprite(tile);
                sprite.setX(x); //min fast
                sprite.setY(y); //max

                tileField.add(sprite);

            }
        }


//        int t = 0;
//        int x = 0;
//        for (int i = 0; i < fieldHeight; i++, x += 50) {
//            int y = 0;
//            System.out.println();
//            for (int j = 0; j < fieldLength; j++, y += 50, t++) {
//                Sprite sprite = new Sprite(tile);
//                sprite.setX(x);
//                sprite.setY(y);
//                tileField.add(sprite);
////                tile.setX(x);
////                tile.setY(y);
////                tileField.add( new Sprite(tile));
//
//
//            }
//        }
    }

    public static void render(SpriteBatch batch) {
//        tile.draw(batch);
        for (Sprite sprite : tileField)
            sprite.draw(batch);
    }

    public static boolean handleTouch(float touchX, float touchY, int id) {
//        if ((touchX >= position.x) && touchX <= (position.x + width) && (touchY >= position.y)
//                && touchY <= (position.y + currentHeight)) {
        System.out.println("x= " + touchX);
        System.out.println("y= " + touchY);
//        if (tileField.get(id).getX() <= touchX && tileField.get(id).getX() + tileField.get(id).getWidth() >= touchX
//                && tileField.get(id).getY() <= touchY && tileField.get(id).getY()+ tileField.get(id).getHeight() >= touchX)  {
        if (tileField.get(id).getX() > (touchX - tileField.get(id).getWidth())
                && tileField.get(id).getY() > touchY - tileField.get(id).getHeight()
                && touchX >= tileField.get(id).getX()
                && tileField.get(id).getX() + tileField.get(id).getWidth() >= touchX
                && touchY >= tileField.get(id).getY()
                && tileField.get(id).getY() + tileField.get(id).getHeight() >= touchX) {
            System.out.println("----"+id);
            tileField.get(id).setAlpha(0);
            return true;
        }
        return false;
    }

}
