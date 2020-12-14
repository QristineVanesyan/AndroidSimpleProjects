package com.example.aninterface;

public class Rectangle implements Shape{
    private int width;
    private int length;

    public Rectangle() {
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "width=" + width +
                ", length=" + length;
    }

    @Override
    public double S() {
        return width*length;
    }

    @Override
    public double P() {
        return 2*(width+length);
    }
}
