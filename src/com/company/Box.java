package com.company;

public class Box {


    private double length;
    private double high;
    private double width;
    private Materials material;

    public Box() {

    }

    public Box(double length, double high, double width) {
        if (!validOfConstructor(length, high, width)) {
            return;
        }
        this.length = length;
        this.high = high;
        this.width = width;
    }

    public Box(double length, double high, double width,  Materials material) {
        this(length, high, width);
        this.material = material;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("Вы ввели неверное значение длины");
            return;
        }
        this.length = length;
    }

    public void setHigh(double high) {
        if (high <= 0) {
            System.out.println("Вы ввели неверное значение высоты");
            return;
        }
        this.high = high;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Вы ввели неверное значение ширины");
            return;
        }
        this.width = width;
    }


    public void setMaterial(Materials material) {
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

    private boolean validOfConstructor(double length, double high, double width) {
        if (length <= 0 | high <= 0 | width <= 0) {
            System.out.println("Вы ввели неверное значение");
            return false;
        }
        return true;
    }
}
// Для класса Box из предыдущих домашек добавить дочерний класс ColorBox и вынести в него свойство color,
// а из класса Box это свойство убрать. Все методы для работы с этим свойством тоже перенести из класса Box
// в класс ColorBox. Свойства color в классе ColorBox и material в Box переделать на Enum'ы
// (создать перечисления для цветов и материалов и задать хотя бы по несколько возможных значений)



