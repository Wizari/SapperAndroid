package com.gmail.wizaripost.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;
import com.gmail.wizaripost.gameobjects.Tile;

public class InputManager {
    static Vector3 temp = new Vector3();

    public static void handleInput(OrthographicCamera camera) {

        // Проверяем было ли касание по экрану
        if (Gdx.input.justTouched()) {
            // Получаем входные координаты касания и
            // устанавливаем эти координаты в временный вектор
            temp.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            // получаем координаты касания относительно области просмотра нашей камеры
            camera.unproject(temp);
            float floTouchX = temp.x;
            float floTouchY = temp.y;
            int touchX = (int)Math.floor(floTouchX);
            int touchY = (int)Math.floor(floTouchY);

            // выполняем итерацию массива наших зомби и проверяем были ли выполнено касание по зомби?
            for (int i = 0; i < Tile.tileField.size; i++) {
//                for (int i = Tile.tileField.size-1; i > 0 ; i--) {
//                Tile tile = Tile.tileField.get(i);
//                Tile tile = Tile.tileField.get(i);
                    if (Tile.handleTouch(touchX, touchY,i)) {
                        break;
                    }
                }
            }
        }
    }
