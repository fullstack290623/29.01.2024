package com.company.shapes;

public abstract class Shape implements Drawable {

    /*

    public interface Drawable {

    //public abstract void draw2D();
    // aut added -- public abstract
    void draw2D();

    }
     */
    protected String name;

    public abstract void draw();

    // from the interface Drawable
    //public abstract void draw2D();

    public void showName() {
        System.out.println("name of the shape " + name);
    }

}
