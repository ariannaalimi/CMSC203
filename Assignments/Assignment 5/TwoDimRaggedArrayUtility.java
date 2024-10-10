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

import java.io.*;
import java.io.BufferedReader;

public final class TwoDimRaggedArrayUtility 
{
	
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	//Reads the given text files for GUI
	public static double [][] readFile(File file) throws FileNotFoundException
	{
		try {
		
		final int MAX_ROW = 10;
		final int MAX_COLUMN = 10;
		
		String[][] tempArray = new String[MAX_ROW][MAX_COLUMN];
		int row = 0;
		int col = 0;
		String line;
		
		
		
		BufferedReader input = new BufferedReader(new FileReader(file));
		
		
		//Checking rows
		while((line = input.readLine()) != null && row < MAX_ROW)
		{
			
			tempArray[row] = line.trim().split(" ");		
			row++;
		}
		
		if(row == 0)
		{
			return null;
		}
		
		//Checking columns
		for(int i = 0; i < (tempArray[0].length) && (tempArray[0][i]) != null; i++)
		{
			
			col++;
				
		}
		
		double [][] array = new double[row][];
		
		for(int i = 0; i < row; i++)
		{
			int accumulator = 0;
			
			for(int k = 0; k < tempArray[i].length && tempArray[i][k] != null; k++)
			{
				accumulator++;
			}
			
			
			array[i] = new double[accumulator];
			
			for(int j = 0; j < accumulator; j++)
			{
				array[i][j] = Double.parseDouble(tempArray[i][j]);
				
			}
		}
		
		input.close();
		return array;
		
		} catch(IOException e) {
			return null;
		}
	}
	
	//Write the text files for GUI
	public static void writeToFile(double [][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter pw = new PrintWriter(outputFile);
		
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				pw.print(data[i][j]);
				pw.print(" ");
			}
		}
		
		pw.close();
	}
	
	//Gets average of the total amount in array
	public static double getAverage(double [][] data)
	{
		double total = 0;
		int array = 0;
		
		for (int i = 0; i < data.length; i++)
		{
			for (int k = 0; k < data[i].length; k++)
			{
				total += data[i][k];
				array++;
			}
		}
		
		if(array > 0)
		{
			double average = total / array;
			
			return average;
		}
		
		else
		{
			return 0;
		}
	}
	
	
	//gets the total amount of numbers in array
	public static double getTotal(double [][] data)
	{
		double total = 0;
		
		for (int i = 0; i < data.length; i++)
		{
			for (int k = 0; k < data[i].length; k++)
			{
				total += data[i][k];
			}
		}
		
		return total;
	}
	
	
	//Returns the highest number in entire array
	public static double getHighestInArray(double [][] data)
	{
		double highest = data[0][0];
		
		for (int i = 0; i < data.length; i++)
		{
			for (int k = 0; k < data[i].length; k++)
			{
				if (data[i][k] > highest)
				{
					highest = data[i][k];
				}
			}
		}
		
		return highest;
		
		
	}
	
	//Returns the lowest number in entire array
	public static double getLowestInArray(double [][] data)
	{
		double lowest = data[0][0];
		
		for (int i = 0; i < data.length; i++)
		{
			for (int k = 0; k < data[i].length; k++)
			{
				if (data[i][k] < lowest)
				{
					lowest = data[i][k];
				}
			}
		}
		
		return lowest;
		
	}
	
	//Returns the row total
	public static double getRowTotal(double [][] data, int row)
	{
		double rowTotal = 0;
		for (int i = 0; i < data[row].length; i++)
		{
			rowTotal += data[row][i];
			
		}
		
		return rowTotal;
	}
	
	//Returns the column total
	public static double getColumnTotal(double [][] data, int col)
	{
		double colTotal = 0;
		for (int i = 0; i < data.length; i++) 
        {
            if (data[i].length > col) 
            {
                colTotal += data[i][col];
            }
        }
		
		return colTotal;
	}
	
	
	//Returns the highest amount in the row
	public static double getHighestInRow(double [][] data, int row)
	{
		double highest = data[row][0];
	
		for(int i = 1; i < data[row].length; i++)
		{
			if (highest < data[row][i])
			{
				highest = data[row][i];
			}
			
		}
		
		return highest;
		
	}
	
	//Returns the lowest amount in row
	public static double getLowestInRow(double [][] data, int row)
	{
		double lowest = data[row][0];
	
		for(int i = 1; i < data[row].length; i++)
		{
			if (lowest > data[row][i])
			{
				lowest = data[row][i];
			}
			
		}
		
		return lowest;
		
	}
	
	//Returns the highest amount in column
	public static double getHighestInColumn(double [][] data, int col)
	{

        double highest = 0;
        
        if(data[0].length > col)
        {
        	highest = data[0][col];
        }

        for (int i = 1; i < data.length; i++) 
        {
            if (data[i].length > col && data[i][col] > highest) 
            {
                highest = data[i][col];
            }
        }

        return highest;
    }

	//Returns the lowest amount in column
	public static double getLowestInColumn(double [][] data, int col)
	{
        
        double lowest = 0;
        
        if(data[0].length > col)
        {
        	lowest = data[0][col];
        }
        
        
        for (int i = 1; i < data.length; i++) 
        {
            if (data[i].length > col && data[i][col] < lowest) 
            {
                lowest = data[i][col];
            }
        }

        return lowest;
    }
	
	
	//Returns the index in which the highest amount in row lies
	public static int getHighestInRowIndex(double [][] data, int row)
	{
		double highest = data[row][0];
		int index = 0;
		
		for(int i = 1; i < data[row].length; i++)
		{
			if(data[row][i] > highest)
			{
				highest = data[row][i];
				index = i;
			}
		}
		
		return index;
		
	}
	
	//Returns the index in which the lowest amount in row lies
	public static int getLowestInRowIndex(double [][] data, int row)
	{
		double lowest = data[row][0];
		int index = 0;
		
		for(int i = 1; i < data[row].length; i++)
		{
			if(data[row][i] < lowest)
			{
				lowest = data[row][i];
				index = i;
			}
		}
		
		return index;
		
	}
	
	//Returns the index in which the highest amount in column lies
	public static int getHighestInColumnIndex(double [][] data, int col)
	{

        int index = 0;
        double highest = 0;
        
        if(data[index].length > col)
        {
        	highest = data[0][col];
        }

        for (int i = 1; i < data.length; i++) 
        {
            if (data[i].length > col && data[i][col] > highest) 
            {
                index = i;
                highest = data[i][col];
            }
        }

        return index;
    }

	
	//Returns the index in which the lowest amount in column lies
	public static int getLowestInColumnIndex(double [][] data, int col)
	{
		
        int index = 0;
        double lowest = 0;
        
     
        if(data[index].length > col)
        {
        	lowest = data[0][col];
        }
        
        
        for (int i = 1; i < data.length; i++) 
        {
            if (data[i].length > col && data[i][col] < lowest) 
            {
                index = i;
                lowest = data[i][col];
            }
        }

        return index;
    }

		
		
		
	

}
