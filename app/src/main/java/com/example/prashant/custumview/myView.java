package com.example.prashant.custumview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by prashant on 10/5/16.
 */
public class myView extends View {

    private Paint paint = new Paint();
    private Path path = new Path();

    public myView(Context context) {
        super(context);
        init(null, 0);
    }

    public myView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public myView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr);
    }

    private void init(AttributeSet attrs,int defStyleAttr) {
        paint.setColor(Color.BLUE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        canvas.drawCircle(490, 640, 400, paint);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        canvas.drawCircle(490, 640, 380, paint);


        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        canvas.drawLine(390, 320, 610, 320, paint);
        canvas.drawLine(390, 420, 610, 420, paint);
        canvas.drawLine(390, 520, 610, 520, paint);
        canvas.drawLine(390, 620, 610, 620, paint);
        canvas.drawLine(390, 720, 610, 720, paint);
        canvas.drawLine(390, 820, 610, 820, paint);
        canvas.drawLine(390, 920, 610, 920, paint);
        canvas.drawLine(390, 1000, 610, 1000, paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        canvas.drawLine(100, 630, 890, 630, paint);

/*
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        RectF rectF = new RectF(100, 20, 100, 80);
        canvas.drawArc (rectF, 90, 90, true, paint);*/




        //canvas.drawLine(0, 0, getWidth(), getHeight(), paint);
        //canvas.drawPath(path, paint);
    }
/*


    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float touchX = motionEvent.getX();
        float touchY = motionEvent.getY();

        switch (motionEvent.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(touchX, touchY);
                break;

            case MotionEvent.ACTION_MOVE:
                path.lineTo(touchX, touchY);
                break;

            case MotionEvent.ACTION_UP:
                break;
        }

        invalidate();
        return true;
    }

*/
}
