/*
@author :- Rakhee Gaikwad
@Date :- 5 Jan 2023
Program :- Check weather array is perfect square array or not.
Int[] arr={16,144,169,224}
*/
package basic;

//declaring a class Square_Array
public class Square_Array {

	//calling main method
	public static void main(String[] args) 
	{
		 int[] arr = { 16, 144, 169, 224 }; 
	        int n = arr.length; 
	  
	        // Calculate the sum of all elements 
	        int sum = 0; 
	        for (int i = 0; i < n; i++) //using for loop
	        {
	            sum += arr[i]; 
	        }
	        
	        // Check if sum is perfect square or not 
	        int sq = (int)Math.sqrt(sum); 
	        if (sq * sq == sum) 
	            System.out.println("Yes the array is  a perfect square array."); //printing
	        else
	            System.out.println("No the array is not a perfect square array."); //printing 
	    } 
	//end of main method
	}

//end of class Square_Array

