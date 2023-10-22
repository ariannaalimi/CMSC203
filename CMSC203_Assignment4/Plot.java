/* Class: CMSC203 CRN 22557
   Program: Assignment #4
   Instructor: David Kuijt
   Summary of Description: Creating properties with given parameters and returning property information
   Due Date: 10/22/2023
   Integrity Pledge: I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   Print your name here: Arianna Alimi
*/


public class Plot 
{
	//fields 
	private int x;
	private int y;
	private int width;
	private int depth;
	
	public Plot()
	{
		this.width = 1;
		this.depth = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}
	
	
	public boolean encompasses(Plot plot)
	{
		
		
		//Making sure that the given plot is within the limits of the bounds
		if((plot.getX() >= x && (plot.getX() + plot.getWidth() <= x + width))
			&& (plot.getY() >= y && ((plot.getY() + plot.getDepth()) <= (y + depth))))
			{
				return true;
			}
		


		return false;
		
		
	}
	
	//Making sure that the plot does not overlap with another plot
	public boolean overlaps(Plot plot)
	{

		//If x2 >= x1 + w1
		if(plot.getX() >= x + width)
		{
			return false;
		}
		
		//if x2 >= x1 && y2 + d2 <= y1
		else if ((plot.getX() >= x) && (plot.getY() + plot.getDepth() <= y))
		{	
			return false;
		}
		
		//if x2 + w2 <= x1	
		else if (plot.getX() + plot.getWidth() <= x)
		{
			return false;
		}
		
		//if y2 >= y1 + d1
		else if (plot.getY() >= y + depth)
		{
			return false;
		}
		
		//if y2 >= y1 && x2 + d2 <= x1
		else if ((plot.getY() >= y) && (plot.getX() + plot.getDepth() <= x))
		{
			return false;
		}
		
		//if y2 + d2 <= y1
		else if (plot.getY() + plot.getDepth() <= y)
		{
			return false;
		}
		
		//if anything else, it does overlap
		else
		{
			return true;
		}
		
	}
		
	
	
	
	//getters
	public int getDepth()
	{
		return depth;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	
	//setters
	
	public void setDepth(int depth)
	{
		this.depth = depth;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	
	public String toString()
	{
		return x + "," + y + "," + width + "," + depth;
	}
	
	
	
	
	
}
