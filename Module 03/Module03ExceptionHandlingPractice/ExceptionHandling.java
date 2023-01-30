
/*
 *Austin Stephens
 * 01/16/2023
 * Module 03 Exception handling
 * 
 * You are working as the data analyst for one of the big survey company. Your manager wants you to analyze the sample data and then determine the maximum, minimum and average.



You need to perform following tasks as part of this assignment.



Step 1: Use Java program to generate the at least 1000 random numbers between 1 to 10000

Step 2: Store all these numbers into the array

Step 3: Perform sorting

Step 4: Determine the maximum and the minimum element

Step 5: Determine the array average

Step 6: Include Try-Catch exception block

Step 7: Include finally block


 * 
 */
package EnableExceptionHandling;
import java.util.Random;



public class ExceptionHandling {
	public static void Average(int IN[]) {
		int temp = 0;
		for(int i = 0; i < IN.length; i++) {
			temp = temp + IN[i];
		}
		System.out.println(temp / IN.length + " Our Average");
	}
	public static void MaxOrMin(int IN[]) {
		System.out.println(IN[IN.length - 1] + " Max");
		System.out.println(IN[IN.length - IN.length + 1] + " Min");
	}
	
	public static void Sort(int IN[]) {
		int temp, p, i;
		for(i = 0; i < IN.length - i; i++) {
			for(p = 0; p < IN.length - i - 1; p++){
				if(IN[p] > IN[p + 1]) {
					temp = IN[p];
					IN[p] = IN[p + 1];
					IN[p + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		try {
			
		int[] Numbers = new int[999];
		Random random = new Random();
		
		//set
		for(int i = 0; i < Numbers.length; i++)
		{
			Numbers[i] = random.nextInt(1000);
			System.out.println(Numbers[i]);
		}
		
		//Sort
		Sort(Numbers);
		
		for(int i = 0; i < Numbers.length; i++)
		{
			System.out.println(Numbers[i]);
		}
		MaxOrMin(Numbers);
		Average(Numbers);
		}
		catch (NullPointerException p) {
			System.out.println(p + " Caught.... ");
		}
		finally {
			System.out.print("IN Final");
		}
		
	}
}
