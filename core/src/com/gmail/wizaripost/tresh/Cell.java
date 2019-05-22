//package com.gmail.wizaripost.gameobjects;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.g2d.Sprite;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.math.Vector2;
//import com.gmail.wizaripost.managers.GameManager;
//
//public class Cell {
//    public Sprite zombieSprite; // спрайт для отображения зомби
//    public Vector2 position = new Vector2();// позиция зомби
//    public float height, width; // размеры зомби
//    public float scaleFactor; // коэффициент масштабирования зомби
//    public enum State {CLOSED, PURE, BOMB, FLAG, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT}
//
//    ; // определение состояний зомби
//    public State state = State.CLOSED; // переменная, описывающая текущее состояние зомби
//    public Sprite stunSprite; // sprite для отображения изображения оглушения
//
//
//    public void render(SpriteBatch batch) {
//
//
//    }
//
//    public void update() {
////        switch (state) {
////            case UNDERGROUND:
////                break;
////            // увеличиваем высоту до максимума, как только высота достигнет максимума - меняем состояние
////            case GOINGUP:
////                break;
////            // уменьшаем высоту до минимума(0), как только выоста достигнет минимума - меняем состояние
////            case GOINGDOWN:
////                currentHeight -= speed;
////                if (currentHeight <= 0.0) {
////                    currentHeight = 0.0f;
////                    state = State.UNDERGROUND;
////                }
////                break;
////            case STUNNED:
////                if(stunCounter>=stunTime){
////                    //отправляем зомби под землю
////                    state= State.UNDERGROUND;
////                    stunCounter=0.0f;
////                    currentHeight=0.0f;
////                    randomizeWaitTime();
////                }
////                else{
////                    stunCounter+=Gdx.graphics.getDeltaTime();
////                }
////                break;
////        }
////        // рисуем только часть изображения зомби. Зависит от высоты над ямой
////        zombieSprite.setRegion(0, 0, (int) (width / scaleFactor), (int) (currentHeight / scaleFactor));
////        zombieSprite.setSize(zombieSprite.getWidth(), currentHeight);
//    }
//
////    public void randomizeWaitTime() {
////        maxTimeUnderGround = (float) Math.random() * 2f;
////    }
//
//    public boolean handleTouch(float touchX, float touchY) {
////        if ((touchX >= position.x) && touchX <= (position.x + width) && (touchY >= position.y)
////                && touchY <= (position.y + currentHeight)) {
////
////            float volume = 0.5f;//настраивать громкость звука
//////            GameManager.hitSound.play();
////            GameManager.hitSound.play(volume); //проигрывать звук при клике игром по зомби:
//////            stunSprite.setPosition(position.x+width-(stunSprite.getWidth()/2),
//////                    position.y+currentHeight -(stunSprite.getHeight()/2));
////            stunSprite.setPosition(position.x+(width/2)-(stunSprite.getWidth()/2),
////                    position.y+currentHeight -(stunSprite.getHeight()/2));
////
////            state = State.STUNNED; // меняем состояние на UNDERGROUND
////            return true;
//        }
//        return false;
//    }
//
//}
//
