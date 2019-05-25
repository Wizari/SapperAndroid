package com.gmail.wizaripost.gameobjects;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
import com.gmail.wizaripost.Sapper;
import com.gmail.wizaripost.utils.SapperHelper;

public class Cell {
    private static int[][] fullField;
    private static int[][] mineField;
    //    private Sprite currentImage;
    static Array<Sprite> field;

    private static TextureAtlas textureAtlas;
    private static Sprite background;

    private static Sprite pure;
    private static Sprite one;
    private static Sprite two;
    private static Sprite three;
    private static Sprite four;
    private static Sprite five;
    private static Sprite six;
    private static Sprite seven;
    private static Sprite eight;
    private static Sprite mine;

    public static TextureAtlas getTextureAtlas() {
        return textureAtlas;
    }

    public static int[][] getMineField() {
        return mineField;
    }

    //    public Sprite getCurrentImage() {
//        return currentImage;
//    }

    //    public Cell(TextureAtlas textureAtlas) {
    public static void initialize(float width, float height, int fieldLength, int fieldHeight, int amountMines) {
        textureAtlas = new TextureAtlas("bla.txt");
        background = textureAtlas.createSprite("pesok4");
        pure = textureAtlas.createSprite("pure");
        one = textureAtlas.createSprite("1");
        two = textureAtlas.createSprite("2");
        three = textureAtlas.createSprite("3");
        four = textureAtlas.createSprite("4");
        five = textureAtlas.createSprite("5");
        six = textureAtlas.createSprite("6");
        seven = textureAtlas.createSprite("7");
        eight = textureAtlas.createSprite("8");
        mine = textureAtlas.createSprite("9");
//        tileField = sowField(10, 10, 8);
        mineField = SapperHelper.createField(fieldLength, fieldHeight, amountMines);
        fullField = SapperHelper.calculateField(mineField);
        field = new Array<Sprite>();
//        Array<Sprite> tileField = new Array<Sprite>();
        int t = 0;
        int y = (fullField.length*50)-50;

        for (int i = 0; i < fullField.length; i++, y -= 50) {
            int x = 0;
            System.out.println();
            for (int j = 0; j < fullField[0].length; j++, x += 50, t++) {
                int cell = fullField[i][j];
                System.out.print(cell);
                Sprite sprite = setTexture(cell);
                sprite.setX(x); //min fast
                sprite.setY(y); //max
                field.add(sprite);

            }
        }

//
//    for (int i = 0; i < fullField.length; i++, x += 50) {
//        int y = 0;
//        System.out.println();
//        for (int j = 0; j < fullField[0].length; j++, y += 50, t++) {
//            int cell = fullField[j][i];
//            System.out.print(cell);
//            Sprite sprite = setTexture(cell);
//            sprite.setX(x);
//            sprite.setY(y);
//            field.add(sprite);
//
//        }
//    }
    }

    public static Sprite setTexture(int index) {

//        Sprite sprite = new Sprite();
        Sprite sprite;
        if (index == 0) {
//            return null;
            return sprite = new Sprite(pure);
        }
        if (index == 1) {
            return sprite = new Sprite(one);
        }

        if (index == 2) {
            return sprite = new Sprite(two);
        }

        if (index == 3) {
            return sprite = new Sprite(three);
        }

        if (index == 4) {
            return sprite = new Sprite(four);
        }

        if (index == 5) {
            return sprite = new Sprite(five);
        }

        if (index == 6) {
            return sprite = new Sprite(six);
        }

        if (index == 7) {
            return sprite = new Sprite(seven);
        }

        if (index == 8) {
            return sprite = new Sprite(eight);
        }

        if (index == 9) {
            return sprite = new Sprite(mine);
        }
        return null;
    }

    //    Array<Sprite>
    public void sowField(int fieldLength, int fieldHeight, int amountMines) {
        this.mineField = SapperHelper.createField(fieldLength, fieldHeight, amountMines);
        this.fullField = SapperHelper.calculateField(mineField);
        field = new Array<Sprite>();
//        Array<Sprite> tileField = new Array<Sprite>();
        int t = 0;
        int x = 0;
        for (int i = 0; i < fullField.length; i++, x += 50) {
            int y = 0;
            for (int j = 0; j < fullField[0].length; j++, y += 50, t++) {
                int cell = fullField[i][j];
                Sprite sprite = setTexture(cell);
//                sprite.setX(x);
//                sprite.setY(y);
                field.add(sprite);

            }
        }
    }

    public static void renderGame(SpriteBatch batch) {
        background.draw(batch);
        for (Sprite sprite : field)
            sprite.draw(batch);
    }


}


//    public static Sprite setTexture(int index) {
////        {CLOSED, PURE, BOMB, FLAG, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT}
////        int h = 0;
////        for (int i = 0; i < fullField.length; i++, h+=50) {
////            int w = 0;
////
////            for (int j = 0; j < fullField[0].length; j++, w+=50) {
////                int index = fullField[i][j];
//        Sprite currentImage = new Sprite();
//        if (index == 0) {
//            this.currentImage = this.pure;
//        }
//        if (index == 1) {
//            this.currentImage = this.one;
//        }
//
//        if (index == 2) {
//            this.currentImage = this.two;
//        }
//
//        if (index == 3) {
//            this.currentImage = this.three;
//        }
//
//        if (index == 4) {
//            this.currentImage = this.four;
//        }
//
//        if (index == 5) {
//            this.currentImage = this.five;
//        }
//
//        if (index == 6) {
//            this.currentImage = this.six;
//        }
//
//        if (index == 7) {
//            this.currentImage = this.seven;
//        }
//
//        if (index == 8) {
//            this.currentImage = this.eight;
//        }
//
//        if (index == 9) {
//            this.currentImage = this.mine;
//        }
//
//    }

//
//    //        Sprite sprite = new Sprite();
//    Sprite sprite;
//        if (index == 0) {
////            return null;
//                return sprite = new Sprite(pure);
//                }
//                if (index == 1) {
//                sprite = one;
//                }
//
//                if (index == 2) {
//                sprite = two;
//                }
//
//                if (index == 3) {
//                sprite = three;
//                }
//
//                if (index == 4) {
//                sprite = four;
//                }
//
//                if (index == 5) {
//                sprite = five;
//                }
//
//                if (index == 6) {
//                sprite = six;
//                }
//
//                if (index == 7) {
//                sprite = seven;
//                }
//
//                if (index == 8) {
//                sprite = eight;
//                }
//
//                if (index == 9) {
//                sprite = mine;
//                }
//                return null;
//                }