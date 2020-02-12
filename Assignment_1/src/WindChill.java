import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		String PROGRAMER_NAME = "Tri Minh Trinh";
		final double CONSTANT_1 = 35.74;
		final double CONSTANT_2 = 35.75;
		final double CONSTANT_3 = 0.6215;
		final double CONSTANT_4 = 0.4275;
		double outsideTemp, wind_speed, Wind_Chill;

		
		Scanner input = new Scanner(System.in);
		System.out.println("Wind Chill Calculator\n");
		System.out.print("Enter the temparature in Fahrenheit (must be => -45 and <= 40): ");
        outsideTemp = input.nextDouble();
        System.out.print("Enter the wind speed (must be => 5 and <= 60): ");
        wind_speed = input.nextDouble();
        System.out.println();
        
        Wind_Chill = CONSTANT_1 + (CONSTANT_3 * outsideTemp) - CONSTANT_2 * Math.pow(wind_speed, 0.16) + CONSTANT_4 * outsideTemp * Math.pow(wind_speed, 0.16);
        System.out.println("Wind chill temperature: " + Wind_Chill + " degrees Fahrenheit.\n");
        System.out.println("Programer: " + PROGRAMER_NAME);
        
        input.close();
	}

}
