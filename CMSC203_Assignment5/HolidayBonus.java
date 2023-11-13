/*
 * Class: CMSC203 
 * Instructor: David Kuijt
 * Description: Program calculates least and most sales and distributes bonuses 
 * Due: 11/12/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Arianna Alimi
*/

public class HolidayBonus
{
	private static final double highestSale = 5000;
	private static final double lowestSale = 1000;
	private static final double otherStore = 2000;
	
	public HolidayBonus()
	{
		
	}
	
	public static double[] calculateHolidayBonus(double[][] data)
	{
		
		double[] array = new double[data.length];

	    for (int i = 0; i < data.length; i++) 
	    {
	    	
	      for (int k = 0; k < data[i].length; k++) 
	      {
	    	  
	    	  int highest = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, k);
	    	  int lowest = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, k);

	    	  if (i == highest)
	    	  {
	    		  array[i] += highestSale;
	    	  }
	          
	        
	    	  else if (i == lowest)
	    	  {
	    		  array[i] += lowestSale;
	    	  }
	          
	        
	    	  else
	    	  {
	    		  array[i] += otherStore;
	    	  }
	    	 
	      }
	    }
	    
	    return array;
	  }

	public static double calculateTotalHolidayBonus(double[][] data)
	{
		double array[] = calculateHolidayBonus(data);
		double total = 0;
		
		
		for(int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		
		return total;
		
	}
		
}
	

