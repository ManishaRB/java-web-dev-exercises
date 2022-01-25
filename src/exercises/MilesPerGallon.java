package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String args[]){
        Scanner input;
        int miles, gallons, milesPerGallon;
        input = new Scanner(System.in);
        System.out.println("Enter the number of miles driven : ");
        miles = input.nextInt();
        System.out.println("Enter gallons of gas used : ");
        gallons = input.nextInt();
        milesPerGallon = miles / gallons;
        System.out.println("Miles per Gallon :" +milesPerGallon);
    }
}
