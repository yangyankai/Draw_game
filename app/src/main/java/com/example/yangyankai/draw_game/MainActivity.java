package com.example.yangyankai.draw_game;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private  GameView mGameView=  null;


    @Override
    public  void  onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mGameView= new GameView(this);
        setContentView(mGameView);
    }
}