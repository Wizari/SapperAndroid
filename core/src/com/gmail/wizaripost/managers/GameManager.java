package com.gmail.wizaripost.managers;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
//import com.gmail.wizaripost.gameobjects.Cell;

public class GameManager extends ApplicationAdapter {

//    static Texture zombieTexture; // текстурное изображение нашего зомби
//    private static float ZOMBIE_RESIZE_FACTOR = 500f;
//    private static float ZOMBIE_VERT_POSITION_FACTOR = 3f;
//    private static float ZOMBIE1_HORIZ_POSITION_FACTOR = 5.8f;
//    private static float ZOMBIE2_HORIZ_POSITION_FACTOR = 2.4f;
//    private static float ZOMBIE3_HORIZ_POSITION_FACTOR = 1.5f;
//    static Texture backgroundTexture; // текстурное изображение заднего фона
//    private static float HOLE_RESIZE_FACTOR = 1100f;

    private static Sprite backgroundSprite; // спрайт для заднего фон
//    static Array<Cell> field; // массив поля (1,2,бум)
    private static Sprite cellSprite;
    static Array<Sprite> cellSpritesArr;
    private static TextureAtlas textureAtlas;


    public static void initialize(float width, float height) {
        textureAtlas = new TextureAtlas("bla.txt");
        cellSprite = textureAtlas.createSprite("button");
        cellSpritesArr = new Array<Sprite>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Sprite sprite = textureAtlas.createSprite("button");
                // подгоняем размер ям
//                sprite.setSize(sprite.getWidth() * (width / HOLE_RESIZE_FACTOR),
//                        sprite.getHeight() * (width / HOLE_RESIZE_FACTOR));
                // размещаем позиции ям
                sprite.setPosition(width * (j + 1) / 4f - sprite.getWidth() / 2,
                        height * (i + 1) / 4.4f - sprite.getHeight());
                cellSpritesArr.add(sprite);
            }
        }

//        zombies = new Array<Zombie>();
//        zombieTexture = new Texture(Gdx.files.internal("zombie.png"));
//
//        backgroundTexture = new Texture(Gdx.files.internal("ground.jpg")); // загрузка текстуры
//        backgroundSprite = new Sprite(backgroundTexture); // установка текстуры в спрайт
//        // настройка размеров и позиции спрайта заднего фона
//        backgroundSprite.setSize(width, height);
//        backgroundSprite.setPosition(0, 0f);
//
//        // создание новых зомби и добавление их в массив
//        for (int i = 0; i < 9; i++) {
//            zombies.add(new Zombie());
//        }
//
//        // установка позиций для зомби
//        for (int i = 0; i < 9; i++) {
//            Zombie zombie = zombies.get(i);
//            Sprite sprite = holeSprites.get(i);
//            // установить спрайт для зомби, используя текстуру
//            zombie.zombieSprite = new Sprite(zombieTexture);
//            zombie.stunSprite = new Sprite(stunTexture);
//
//            // установка размеров зомби
//            float scaleFactor = width / 600f;
//            zombie.scaleFactor = scaleFactor;
//            zombie.width = zombie.zombieSprite.getWidth() * (scaleFactor);
//            zombie.height = zombie.zombieSprite.getHeight() * (scaleFactor);
//            zombie.zombieSprite.setSize(zombie.width, zombie.height);
//            // установка позиции зомби
//            zombie.position.x = ((sprite.getX() + (sprite.getX() + sprite.getWidth())) / 2 - (zombie.zombieSprite.getWidth() / 2));
////            zombie.position.x=(sprite.getX() + sprite.getWidth()/17f);
//            zombie.position.y = (sprite.getY() + sprite.getHeight() / 5f);
//            zombie.zombieSprite.setPosition(zombie.position.x, zombie.position.y);
//
//            zombie.stunSprite.setSize(zombie.width / 2f, zombie.height / 2f);
//
//            zombie.randomizeWaitTime();
//        }
//        TextManager.initialize(width, height);
//
    }

    public static void renderGame(SpriteBatch batch) {
        backgroundSprite.draw(batch);

        // Нарисовать(отобразить) каждую яму
        for (Sprite sprite : cellSpritesArr)
            sprite.draw(batch);

        // Нарисовать(отобразить) каждого зомби
//        for (Zombie zombie : zombies) {
//            zombie.update();
//            zombie.render(batch);
//        }
//        TextManager.displayMessage(batch);

    }


//    public static void dispose() {
//        // утилизация текстуры крота, чтобы обеспечить отсутствие утечек памяти
////        zombieTexture.dispose();
////        backgroundTexture.dispose();
////        holeTexture.dispose();
////        stunTexture.dispose();
////        hitSound.dispose();
//
//    }

}

