package com.example.aninterface;

public class Circle implements Shape{
    private int R;

    public Circle() {
    }

    public Circle(int r) {
        R = r;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }
    @Override
    public double S() {
        return Math.PI*Math.pow(R,2);
    }

    @Override
    public double P() {
        return 2*Math.PI*R;
    }
    @Override
    public String toString() {
        return "R=" + R;
    }
}
