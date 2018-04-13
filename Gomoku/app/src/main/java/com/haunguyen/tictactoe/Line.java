package com.haunguyen.tictactoe;

/**
 * Created by Hau Nguyen on 12-Apr-18.
 */

public class Line {
    private int startX;
    private int stopX;
    private int startY;
    private int stopY;

    public Line() {
    }

    public Line(int startX, int stopX, int startY, int stopY) {
        this.startX = startX;
        this.stopX = stopX;
        this.startY = startY;
        this.stopY = stopY;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStopX() {
        return stopX;
    }

    public void setStopX(int stopX) {
        this.stopX = stopX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getStopY() {
        return stopY;
    }

    public void setStopY(int stopY) {
        this.stopY = stopY;
    }
}
