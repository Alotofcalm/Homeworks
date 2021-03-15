package com.company;

public class ColorBox extends Box {

//    private String color;
    private Colors color;

    public ColorBox() {

    }

    public ColorBox(double length, double high, double width, Materials material, Colors color) {
        super(length, high, width, material);
        this.color = color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Colors getColor() {
        return color;
    }


}
