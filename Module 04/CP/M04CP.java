/*
 * Austin Stephens
 * Module 04
 * 01/25/2023
 * 
 * 
 * M004
 * 
 * 
 * YTake the input from the user about the patient name, weight, birthdate, and height.
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
Implement exception handling.
Store all the information in the file. You need to use the loop and keep asking users to enter patient name, height, weight, and birthdate. Your program should calculate BMI Category and Insurance payment category and write it to the file. Your program should stop once user enter q character.


*/

package M04CourseProject;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;



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
	int OURBMINUM;
	void WriteTO() throws IOException {
		File fout = new File("C:/JavaFiles/OutputM04.txt");
		FileOutputStream fos = new FileOutputStream(fout);
	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		
			bw.write(this.Name);
			bw.newLine();
			bw.write(this.Weight);
			bw.newLine();
			bw.write(this.Height);
			bw.newLine();
			bw.write(this.Birthday);
			bw.newLine();
			bw.write(this.InsuranceCat);
			bw.newLine();
			bw.write(this.BMIScore[OURBMINUM]);
			bw.newLine();
			bw.newLine();
			bw.close();
	}
}

public class M04CP {

	public static void main(String[] args) {
		
		Scanner UserInput = new Scanner(System.in);
		PersonBMIScore Person1 = new PersonBMIScore();
		
		
		try {
			
		while(true) {
			
			while(!UserInput.equals("q")) {
				System.out.println("Please Enter Name, q to exit");
				Person1.Name = UserInput.nextLine();
				if (Person1.Name.equals("q")) {
					break;
				}
			
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
		Person1.OURBMINUM = Person1.CalScore(Person1.CalBMI());
		System.out.println("And Have an Insurance Payment of: ");
		System.out.println(Person1.InsuranceCat);
		Person1.WriteTO();
		
		}
			break;
		}
		
		
		
		
		}catch(Exception e) {}
		
		}
		
		
	}



