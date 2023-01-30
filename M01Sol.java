/*
 * Austin Stephens
 * Module 01
 * 01/07/2023 
 * 
 * Scanner & Initial Java
 * 
 * 
 * Find and figure out BMI
 * 
 * If the BMI Score is less than 18.5, then underweight
	If the BMI Score is between 18.5-24.9, then Normal weight
	If the BMI score is between 25 to 29.9, then Overweight
	If the BMI score is greater than 29.9, then Obesity
 * 
 */



package M01Sul;
import java.util.Scanner;



public class M01Sol {

	public static void main(String[] args) {
		
		//declaring variables
		String[] BMIScore = {"Underweight", "Normal-Weight", "Over-Weight", "Obesity"};
		String UserIN = null;
		Scanner Scan = new Scanner(System.in);
		boolean ContLoop = true;
		String Weight, Birthday, Height;
		
		
		
		//going into exit check
		while(ContLoop)
		{
			
			//Input
			System.out.println("Please Enter name or 'e' to exit");
			UserIN = Scan.nextLine();
			
			
			//Check Exit
			if(UserIN.equals("e"))
			{
				ContLoop = false;
				return;
			}
			ContLoop = false;
		}
		
		//continue & calculate
		
		
		
		//Find BMI 
		//Formula: weight (lb) / [height (in)]2 x 703
		//{"Weight IN Lbs", "BirthDay", "Height IN Inches"};
		
		System.out.println("Please Enter Weight");
		Weight = Scan.nextLine();
		System.out.println("Please Enter Height");
		Height = Scan.nextLine();
		System.out.println("Please Enter Birthday");
		Birthday = Scan.nextLine();
		
		
		Float OUT = Float.parseFloat(Weight) / Float.parseFloat(Height) / Float.parseFloat(Height) * 703;
		

		System.out.println(Float.toString(OUT));
		
		System.out.println(" \n " + "Welcome " + UserIN + " \n " + "Your BMI is: " + OUT + " " + "You Are: " + BMIScore[SCORE(OUT)]);
		
	
	}
	
	static int SCORE(float IN)
	{
		if(IN <= 18.5)
		{
			return 0;
		}
		if(IN > 18.6 & IN < 24.9)
		{
			return 1;
		}
		if(IN > 25 & IN < 29.9)
		{
			return 2;
		}
		if(IN > 29.9)
		{
			return 3;
		}
		return 0;
	}

}
