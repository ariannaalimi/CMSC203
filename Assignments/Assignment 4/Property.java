/* Class: CMSC203 CRN 22557
   Program: Assignment #4
   Instructor: David Kuijt
   Summary of Description: Creating properties with given parameters and returning property information
   Due Date: 10/22/2023
   Integrity Pledge: I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   Print your name here: Arianna Alimi
*/


public class Property 
{
	//fields
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;
	
	
	//Constructors
	public Property()
	{
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0;
		this.owner = "";
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot();
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
		
	}
	
	public Property(Property otherProperty)
	{
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.owner = otherProperty.owner;
		this.rentAmount = otherProperty.rentAmount;
		this.plot = new Plot(otherProperty.plot);
	}
	
	
	//getters
	public String getCity()
	{
		return city;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	public String getPropertyName()
	{
		return propertyName;
	}

	public double getRentAmount()
	{
		return rentAmount;
	}
	
	public String toString()
	{
		return propertyName + "," + city + "," + owner + "," + rentAmount;
	}



}
