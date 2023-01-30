/*
 * Austin Stephens
 * 
 * 01/11/2023
 * Professor Daniel Meighen
 * 
 * 
Step 1: Create the base class that has the sorting method. The sorting method should take the input parameter as the array and print the sorted array.



Step 2: Create the child class that inherits all the methods from the above base class. The child class has the addnumber method that adds all the numbers from an array. The addnumber method first calls the base class sorting method to sort all the array numbers. Once the numbers in the array are sorted, then addnumber method adds all of them.

Your submission should include the following:



Base Class
Child Class
Entire Java Solution
Output screenshot created in Microsoft Word

 * 
 * 
 */



package Sorting;
import java.util.Arrays;
import java.util.Scanner;

class BaseClass {
	
	public int[] ArraySort(String[] ArrayIN, int CNT) {
		//intial our switch array
		int[] ArrayOut = new int[CNT];
		
		//copying IN Array to OUT Array
		for(int i = 0; i < CNT; i++) {
			ArrayOut[i] = Integer.parseInt(ArrayIN[i]);
		}
		
		System.out.println("Modified Array: ");
		
		//Sorting OUT Array
		Arrays.sort(ArrayOut);
		
		//printing OUT Array
		for(int i = 0; i < CNT; i++)
		{
			System.out.println(i+1 + ". - " + ArrayOut[i]);
		}
		System.out.println("DONE");
		return ArrayOut;
		
	}
}



class Child extends BaseClass {
	 public void AddNumbers(int[] InNum) {
		 int AddedNums = 0;
		 
		 for (int i = 0; i < InNum.length; i++) {
			 AddedNums = AddedNums + InNum[i];
		 }
		 System.out.println(AddedNums);
		 System.out.println("DONE");
		 
	}
}


public class ChildClass {
	public static void main(String[] args) {
		
		
		// INITAL
		//
		boolean LoopExit = true;
		int PASSCOUNT = 0;
		String[] StoredArray = new String[100];
		Scanner UserInput = new Scanner(System.in);
		Child SortThis = new Child();
		
		
		
		
		//Loop input until exit
		while(LoopExit) {
			System.out.println("Enter Each Number One At A time, 'Enter e to continue' ");
			String ArrayUser = UserInput.nextLine();
			
			if(ArrayUser.equals("e")) {
				System.out.println("IN - E");
				LoopExit = false;
			}
			else {
				System.out.println("IN --- ELSE");
				StoredArray[PASSCOUNT++] = ArrayUser;
			}
			
		}
		
		//Showing input of array
		for(int i = 0; i < PASSCOUNT; i++)
		{
			System.out.println(i+1 + ". - " + StoredArray[i]);
		}
		 
		
		//hitting method
		
		SortThis.AddNumbers(SortThis.ArraySort(StoredArray, PASSCOUNT));
		
		 
	}

}
