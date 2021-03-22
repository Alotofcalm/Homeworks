    package com.company;

    import Enums.Colors;
    import Enums.Materials;

    public class ColorBox extends Box {

    private Colors color;



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

    @Override
    public String toString() {

        return "ColorBox{" +
                "length =" + getLength() +
                ", high =" + getHigh() +
                ", width =" + getWidth() +
                ", material =" + getMaterial() +
                ", color = " + color +
                ", volume =" + volume() +
                '}';
    }

    }
