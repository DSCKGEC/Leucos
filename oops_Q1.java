package com.jainlodge;

class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
public class oops_Q1 {
    public static void main(String[] args) {
        cylinder myCylinder= new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(90);
        System.out.println(myCylinder.getRadius());
    }
}
