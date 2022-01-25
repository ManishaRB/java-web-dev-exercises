package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;


public class Area {
    public static void main(String args[]){
        Scanner input;
        double radius, area;
        //final double PI = 3.14;
        input = new Scanner(System.in);

        do {
            System.out.println("Enter a radius : ");
            //str.matches("-?\\d+(\\.\\d+)?")
            radius = input.nextDouble();
        }while (!(radius > 0 ) );
       // area = PI * radius * radius;
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is:" +area);

    }
}
