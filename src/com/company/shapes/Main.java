package com.company.shapes;

public class Main {

    public static void main(String[] args) {

        Shape s = new Circle(); // Error

        Background3D b3d = new Background3D();
        //draw2D(b3d); // Error
        Background2D b2d = new Background2D();
        draw2D(b2d);

        Circle c = new Circle();
        draw2D(c);
    }

    public static void draw2D(Drawable drawableClass) {
        drawableClass.draw2D();
    }

}
