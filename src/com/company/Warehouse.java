package com.company;

import java.util.Arrays;

public class Warehouse {

    Box[] warehouse;
    private int boxCount;

    public Warehouse(int capacity) {
        this.warehouse = new Box[capacity];
        this.boxCount = 0;
    }


    public void addBox(Box box) {
        if (!boxChek(box)) {
            return;
        }
        if (warehouseChek()) {
            System.out.println("Склад полон, невозможно добавить коробку!");
        } else {
            warehouse[boxCount] = box;
            System.out.println("Коробка успешно добавлена. " +
                    "На складе сейчас хранится  коробок: " +
                    (boxCount + 1));
            boxCount++;
        }
    }

    @Override
    public String toString() {

        return "Всего коробок на складе: " + boxCount + " " + Arrays.toString(warehouse);
    }

    // Этот метод проверяет наличие свободного места на складе
    public boolean warehouseChek() {
        return boxCount == warehouse.length;
    }

    // этот метод проверяет наличие данной коробки на складе
    private boolean boxChek(Box box) {
        for (Box value : warehouse) {
            if (value == box) {
                System.out.println("Ошибка! Данная коробка уже хранится на складе!");
                return false;
            }
        }
        return true;
    }

}




