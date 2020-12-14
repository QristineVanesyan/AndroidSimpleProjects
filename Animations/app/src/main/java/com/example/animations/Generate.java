package com.example.animations;

public class Generate {
    private int num1;
    private int num2;

    public Generate() {
        num1 = (int)(Math.random()*10);
        num2 = (int)(Math.random()*10);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }


}
