package com.gmail.wizaripost;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.utils.Array;
import com.gmail.wizaripost.gameobjects.Cell;
import com.gmail.wizaripost.managers.GameManager;

public class Sapper extends ApplicationAdapter {
    private SpriteBatch batch;
//    private TextureAtlas textureAtlas;
//    private Sprite background;
//    private Cell cell;


    private OrthographicCamera camera;



    @Override
    public void create() {
        float height = Gdx.graphics.getHeight();
        float width = Gdx.graphics.getWidth();
        camera = new OrthographicCamera(width, height);
        camera.setToOrtho(false); // центруем камеру (w/2, h/2) этой строкой
        batch = new SpriteBatch();
        Cell.initialize(width, height, 10,10,8);//инициализируем игру
//        textureAtlas = new TextureAtlas("bla.txt");
//        background = textureAtlas.createSprite("pesok4");
//        cell = new Cell(textureAtlas);

//        cell.setTexture(9);
//        cell.getCurrentImage().setY(200);
//        cell.getCurrentImage().setX(200);


    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
//        background.draw(batch);
        Cell.renderGame(batch);

//        cell.getCurrentImage().draw(batch);


        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
//        textureAtlas.dispose();
    }
}
