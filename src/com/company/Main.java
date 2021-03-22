package com.company;

import Enums.Colors;
import Enums.Materials;

public class Main {

    public static void main(String[] args) {


        Box box1 = new Box(1, 4, 8, Materials.STEEL);

        Warehouse warehouse = new Warehouse(3);

        warehouse.addBox(box1);
        warehouse.addBox(box1);
        warehouse.addBox(new ColorBox(10, 11, 12, Materials.STEEL, Colors.RED));

        System.out.println(warehouse.toString());


    }

}
