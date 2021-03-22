package com.company;

import Enums.Materials;

public class Box {

    private final double length;
    private final double high;
    private final double width;
    private final Materials material;


    public Box(double length, double high, double width, Materials material) {
        this.length = length;
        this.high = high;
        this.width = width;
        this.material = material;
    }

    public double getLength() {

        return length;
    }

    public double getHigh() {
        return high;
    }

    public double getWidth() {
        return width;
    }

    public Materials getMaterial() {
        return material;
    }

    double volume() {
        return width * length * high;
    }

    @Override
    public String toString() {

        return "Box{" +
                "length =" + length +
                ", high =" + high +
                ", width =" + width +
                ", material =" + material +
                ", volume =" + volume() +
                '}';
    }
}

