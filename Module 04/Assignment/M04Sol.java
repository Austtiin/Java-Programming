/*
 * Austin Stephens
 * Module 04
 * 01/24/2023
 * 
 * File Operations
 * 
 * 
 * Step 1: Read the data from Seattle-crime-stats-by-1990-census-tract-1996-2007.csv
Step 2: Analyze the data
Step 3: Add all the numbers from Report_Year_Total
Step 4: Create another file and write the output of total crime numbers(from above step)

 * 
 * 
 */



package M04Assignment;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M04Sol {

	public static void main(String[] args) {
		
		//Opening locations and starting List
		       String file = "C:/JavaFiles/FBO.csv";
		       String out = "C:/JavaFiles/Numsout.txt";
		       String delimiter = ",";
		       String line;
		       ArrayList<String> lines = new ArrayList<String>();
		       
		      int temp = 0;
		      
		       
		       //extending our Reader class
		        try (BufferedReader br =
		                     new BufferedReader(new FileReader(file))) {
		        	
		        	FileOutputStream O1 = new FileOutputStream(out);
		        	//looking until our CSV comes up empty, then continue
		            while((line = br.readLine()) != null){
		            	
		            	//adding inputs looking out for out delim, allowing us to seperate by ","
		                List<String> values = Arrays.asList(line.split(delimiter));
		                
		                //adding "value" to our lines list then repeat
		                lines.addAll(values);
		            }
		            //Printing outcome
		            //lines.forEach(l -> System.out.println(l));
		            
		    
		        //creating and setting new array for our solution
		            String[] arr = new String[lines.size()];
		            lines.toArray(arr);
		            
		            
		            
		        for(int i = 0; i < arr.length; i++) {
		        	
		        	System.out.println(arr[i] + "");
		     
		   
		        }
		        
				  for(int i = 7; i < arr.length; i++) {
					  System.out.println(i + " " + temp);
					  temp = temp + Integer.parseInt(arr[i]);
					  i = i + 3;
				  }
				  
				  
				  O1.write(Integer.toString(temp).getBytes());
				  
				  
				  
				  
		        } catch (Exception e){
		            System.out.println(e + " Caught ");
		            
		        }
	

	
	}
}

	