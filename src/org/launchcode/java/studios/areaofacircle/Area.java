package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        double radius = 0;
        double area;
        boolean isNumber;
        //final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius : ");
        do {
            if (input.hasNextDouble()) {   //returns true if the next token in this scanner’s input can be interpreted as a Double using the nextDouble() method
                radius = input.nextDouble();
                isNumber = true;
                if (radius < 0) {
                    System.out.println("Please enter a positive number");
                    radius =input.nextDouble();
                }
            } else {
                System.out.println("Please enter a valid number ");
                isNumber = false;
                input.next();
            }
        }while (!(isNumber) );
        //call to getArea() from class Circle
        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is:" +area);

    }
}
