/*
 * Austin Stephens
 * Module 01
 * 01/21/2023
 * 
 * 
 * M02 CP Adding
 * 
 * 
 * You are working as a software developer for a large insurance company. Your company is planning to migrate the existing systems from Visual Basic to Java and this will require new calculations. You will be creating a program that calculates the insurance payment category based on the BMI score.



Your Java program should perform the following things:



Take the input from the user about the patient name, weight, birthdate, and height.
Calculate Body Mass Index.
Display person name and BMI Category.
If the BMI Score is less than 18.5, then underweight.
If the BMI Score is between 18.5-24.9, then Normal.
If the BMI score is between 25 to 29.9, then Overweight.
If the BMI score is greater than 29.9, then Obesity.
Calculate Insurance Payment Category based on BMI Category.
If underweight, then insurance payment category is low.
If Normal weight, then insurance payment category is low.
If Overweight, then insurance payment category is high.
If Obesity, then insurance payment category is highest.
Implement exception handling using try-catch.
Include the finally block.

You need to display the patient name, BMI Category and Insurance Payment Category.
 * 
 */

package M02Sol;
import java.util.Scanner;
//import java.util.Arrays;

class Person {
	String Name, Birthday, Weight, Height;
	String InsuranceCat = null;
	int CalScore(int InBMI) {
		
		if(InBMI <= 18.5)
		{
			this.InsuranceCat = "Low";
			return 0;
			
		}
		if(InBMI > 18.6 & InBMI < 24.9)
		{
			this.InsuranceCat = "Low";
			return 1;
		}
		if(InBMI > 25 & InBMI < 29.9)
		{
			this.InsuranceCat = "High";
			return 2;
		}
		if(InBMI > 29.9)
		{
			this.InsuranceCat = "Highest";
			return 3;
		}
		return InBMI;
		
	}
	
	
	int CalBMI() {
		Float OUT = Float.parseFloat(this.Weight) / Float.parseFloat(this.Height) / Float.parseFloat(this.Height) * 703;
		return OUT.intValue();
		
	}
}

class PersonBMIScore extends Person {
	String[] BMIScore = {"Underweight", "Normal-Weight", "Over-Weight", "Obesity"};
	
	
	
}




public class CalculateBMI02 {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		PersonBMIScore Person1 = new PersonBMIScore();
		
		System.out.println("Please Enter Name");
		
		try {

			Person1.Name = UserInput.nextLine();
			
			if(!"The Professor is super cool".equals(UserInput)) {
				throw new Exception("The Professor Is Super Cool");
			}
		}catch(Exception e) {
			System.out.println(e);
			return;
		}finally {
			System.out.println("Example of our try - catch - finally");
		
		System.out.println("Please Enter Height in Inches");
		Person1.Height = UserInput.nextLine();
		System.out.println("Please Enter Wight In LBS");
		Person1.Weight = UserInput.nextLine();
		System.out.println("Please Enter Birthday");
		Person1.Birthday = UserInput.nextLine();
		
		System.out.println("\n");
		System.out.println("\n Welcome " + Person1.Name);
		
		System.out.println("Based On You Input You Are In The Range Of: ");
		System.out.println(Person1.BMIScore[Person1.CalScore(Person1.CalBMI())]);
		System.out.println("And Have an Insurance Payment of: ");
		System.out.println(Person1.InsuranceCat);
		
		
		}
	}

}
