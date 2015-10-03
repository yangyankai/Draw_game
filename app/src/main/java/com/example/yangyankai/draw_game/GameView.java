package com.example.yangyankai.draw_game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by yangyankai on 2015/10/3.
 */
public class GameView  extends View implements  Runnable{

    //声明Paint对象
    private Paint mPaint= null;
    private drawGraphics drawGraphics= null;


    public GameView(Context context) {
        super(context);
        // TODOAuto-generated constructor stub
        //构建对象
        mPaint= new Paint();
        //开启线程
        new  Thread(this).start();
    }

    public void  onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画布为黑色背景
        //canvas.drawColor(Color.BLACK);
        //消除锯齿
        mPaint.setAntiAlias(true);
        //设置图形为空心
        mPaint.setStyle(Paint.Style.STROKE);
        //绘制空心几何图形
        drawGraphics=  new  DrawCircle();
        drawGraphics.draw(canvas);
        drawGraphics=  new  DrawLine();
        drawGraphics.draw(canvas);
        drawGraphics= new DrawRect();
        drawGraphics.draw(canvas);
    }


    @Override
    public void run() {
        // TODOAuto-generated method stub
        while(!Thread.currentThread().isInterrupted()) {
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                // TODO: handle exception
                Thread.currentThread().interrupt();
            }
            //使用postInvalidate 可以直接在线程中更新界面
            postInvalidate();
        }
    }

}