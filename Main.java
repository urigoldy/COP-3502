import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner userInput = new Scanner(System.in);
        int carMPG;
        double carTankSize, gasInTank, rawRange;




        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
        carMPG = userInput.nextInt();
        if(carMPG <= 0)
        {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            System.exit(0);
        }
        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
        carTankSize = userInput.nextDouble();
        if(carTankSize <= 0.0)
        {
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            System.exit(0);
        }
        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        gasInTank = userInput.nextDouble();
        if(gasInTank < 0 || gasInTank > 100)
        {
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            System.exit(0);
        }
        rawRange = (carMPG*carTankSize*(gasInTank * 0.01));
        if(rawRange <= 25)
        {
            System.out.print("Attention! Your current estimated range is running low: " + (int)rawRange + " miles left!!!");
        }
        else
        {
            System.out.print("Keep driving! Your current estimated range is: " + (int)rawRange + " miles!");
        }
    }
}
