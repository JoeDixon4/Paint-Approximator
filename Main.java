import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static float GetCoats() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the number of coats:");

        float CoatNumber = myObj.nextFloat();  // Read user input

        return CoatNumber;
    }
    public static float GetWallNumber()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the number of Walls:");

        float WallNumber = myObj.nextFloat();  // Read user input

        return WallNumber;
    }
    public static float GetWallSize()
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter the average wall size:");

        float WallSize = myObj.nextFloat();  // Read user input

        return WallSize;
    }
    public static float GetPaintAmount()
    {
        return 0.1f;//Amount of paint per Square meter of wall
    }
    public static void main(String[] args){

        float NumberCoats = GetCoats();

        float NumberWalls = GetWallNumber();

        float WallSize = GetWallSize();

        float PaintAmount = GetPaintAmount();

        float TotalPaint = NumberCoats * NumberWalls * WallSize * PaintAmount;

        System.out.println("You will require " + Math.ceil(TotalPaint * 1.1) + " litres of paint.");
        }
    }