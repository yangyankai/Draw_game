package com.example.yangyankai.draw_game;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by yangyankai on 2015/10/3.
 */
public class DrawLine  implements  drawGraphics{

    private Paint paint=  null;

    public  DrawLine(){
        paint=  new  Paint();
    }

    @Override
    public void draw(Canvas canvas) {
        // TODOAuto-generated method stub
        paint.setAntiAlias(true);
        //绘制直线
        paint.setColor(Color.GREEN);
        //设置线条粗细
        paint.setStrokeWidth(12);
        canvas.drawLine(120,40,170,90, paint);
        canvas.drawLine(320,90,370,40, paint);
    }
}