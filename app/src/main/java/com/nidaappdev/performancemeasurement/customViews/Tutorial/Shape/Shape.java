package com.nidaappdev.performancemeasurement.customViews.Tutorial.Shape;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;

import com.nidaappdev.performancemeasurement.customViews.Tutorial.Focus.Focus;
import com.nidaappdev.performancemeasurement.customViews.Tutorial.Focus.FocusGravity;
import com.nidaappdev.performancemeasurement.customViews.Tutorial.Target;
import com.nidaappdev.performancemeasurement.util.Constants;

public abstract class Shape {

    protected Target target;

    protected Focus focus;

    protected FocusGravity focusGravity;

    protected int padding;

    public Shape(Target target) {
        this(target, Focus.MINIMUM);
    }

    public Shape(Target target, Focus focus) {
        this(target, focus, FocusGravity.CENTER, Constants.DEFAULT_TARGET_PADDING);
    }

    public Shape(Target target, Focus focus, FocusGravity focusGravity, int padding) {
        this.target = target;
        this.focus = focus;
        this.focusGravity = focusGravity;
        this.padding = padding;
    }

    public abstract void draw(Canvas canvas, Paint eraser, int padding);

    protected Point getFocusPoint(){
        if(focusGravity == FocusGravity.LEFT){
            int xLeft = target.getRect().left + (target.getPoint().x - target.getRect().left) / 2;
            return new Point(xLeft, target.getPoint().y);
        }
        else if(focusGravity == FocusGravity.RIGHT){
            int xRight = target.getPoint().x + (target.getRect().right - target.getPoint().x) / 2;
            return new Point(xRight, target.getPoint().y);
        }
        else
            return target.getPoint();
    }

    public abstract void reCalculateAll();

    public abstract Point getPoint();

    public abstract int getHeight();

    /**
     * Determines if a click is on the shape
     * @param x x-axis location of click
     * @param y y-axis location of click
     * @return true if click is inside shape
     */
    public abstract boolean isTouchOnFocus(double x, double y);
}