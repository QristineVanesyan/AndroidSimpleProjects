package com.example.aninterface;

import java.util.ArrayList;

public class Count {
    private ArrayList<Shape>shapes=new ArrayList<Shape>();
    public Count() {
    }
    public ArrayList<Shape> createShapes()
    {
        shapes.add(new Circle(2));
        shapes.add(new Circle(3));
        shapes.add(new Rectangle(3,4));
        shapes.add(new Rectangle(2,5));
        return shapes;
    }

}
