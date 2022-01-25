package exercises;
import java.util.Scanner;


public class AreaOfRectangle {
    public static void main(String[] args) {
        double width, height, area;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the Width of a Rectangle: ");
        width = input.nextInt();
        System.out.println("Enter the Height of a Rectangle: ");
        height = input.nextInt();
        input.close();

        area = width * height;
        System.out.println("The Area of a Rectangle is: " + area );
    }
}

