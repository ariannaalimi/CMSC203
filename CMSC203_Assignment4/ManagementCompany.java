/* Class: CMSC203 CRN 22557
   Program: Assignment #4
   Instructor: David Kuijt
   Summary of Description: Creating properties with given parameters and returning property information
   Due Date: 10/22/2023
   Integrity Pledge: I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   Print your name here: Arianna Alimi
*/

public class ManagementCompany 
{
	//constants
	static final int MAX_PROPERTY = 5;
	static final int MGMT_DEPTH = 10;
	static final int MGMT_WIDTH = 10;
	
	//fields
	private String name;
	private String taxID;
	private double mgmFee;
	private Property[] properties;
	private Plot plot;
	private int numOfProperties;
	
	
	//Constructors
	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.mgmFee = 0;
		numOfProperties = 0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.numOfProperties = 0;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.numOfProperties = 0;
		this.plot = new Plot(x, y, width, depth);
		properties = new Property[MAX_PROPERTY];
		
	}
	
	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.numOfProperties = otherCompany.numOfProperties;
		this.plot = new Plot(otherCompany.plot);
		
		//setting numOfProperties = property length
		for (int i = 0; i < otherCompany.properties.length; i++)
		{
			if(otherCompany.properties[i] != null)
			{
				properties[i] = new Property(otherCompany.properties[i]);
			}
		}
		
	}
	
	//getters
	public double getMgmFeePer()
	{
		return mgmFee;
	}

	public String getName()
	{
		return name;
	}
	
	public Plot getPlot()
	{
		return plot;
	}
	
	
	public String getTaxID()
	{
		return taxID;
	}
	
	public Property[] getProperties()
	{
		return properties;
	}
	
	
	//Methods
	
	
	//How many properties there are
	public int getPropertiesCount()
	{
		int propertyAmount = 0;
		
		//incrementing every time a property is not null
		for (int i = 0; i < properties.length; i++)
		{
			if (properties[i] != null)
			{
				propertyAmount++;
			}
		}
		
		return propertyAmount;
	}
	
	
	//Which property has the highest rent
	public Property getHighestRentPropperty()
	{
	
		//setting the intitial highest property rent to the first property
		Property highestProperty = properties[0];
		
		for(int i = 1; i < numOfProperties; i++)
		{
			//if the next property is higher than the previous, change it to highest property
			if (highestProperty.getRentAmount() < properties[i].getRentAmount())
			{
				highestProperty = properties[i];
			}
		}
		
		return highestProperty;
	}
	
	//Getting the total rent of all properties
	public double getTotalRent()
	{
		double totalRent = 0;
		
		//for every property, add the rent amount to totalRent field
		for(int i = 0; i < numOfProperties; i++)
		{
				totalRent += properties[i].getRentAmount(); 
		}
		
		return totalRent;
	}
	
	//Is the management fee inputted higher than 0 and less than 100
	public boolean isManagementFeeValid()
	{
		if (mgmFee < 0 || mgmFee > 100)
		{
			return false;
		}
		
		return true;
	}
	
	//Did the properties array meet the Max amount of properties
	public boolean isPropertiesFull()
	{
		if (numOfProperties < MAX_PROPERTY)
		{
			return false;
		}
		
		//if properties are not less than Max, return true
		return true;
		
	}
	
	//Removing last property from array
	public void removeLastProperty()
	{
		properties[numOfProperties - 1] = null;
		numOfProperties--;
	}
	
	
	public int addProperty(Property property)
	{
		if (numOfProperties >= MAX_PROPERTY)
		{
			return -1;
		}
		
		if(property == null)
		{
			return -2;
		}
		
		if(!(plot.encompasses(property.getPlot())))
		{
			return -3;
		}
		
		
		//Looping through each property array
		for (int i = 0; i < numOfProperties; i++)
		{
			//If property is not null and it overlaps, return -4
			if(properties[i] != null && properties[i].getPlot().overlaps(property.getPlot()))
			{
				return -4;
			}
			
		}
			
			
		Property newProperty = new Property(property);
		properties[numOfProperties] = newProperty;
		numOfProperties++; //increment
		
		return numOfProperties - 1; // return numOfProperties without its increment
		
		
		
	}
	
	public int addProperty(String name, String city, double rent, String owner)
	{
		Property newProperty = new Property(name, city, rent, owner);
		
		return addProperty(newProperty);
	
	}
	public int addProperty(String name, String city, double rent, String owner, int x , int y, int width, int depth)
	{
		Property newProperty = new Property(name, city, rent, owner, x, y, width, depth);
		
		return addProperty(newProperty);
	}
	
	
	
	public String toString()
	{
		
		
		String propertyInfo = "";
		
		for(int i = 0; i < numOfProperties; i++)
		{
			Property property = properties[i];
			
			propertyInfo += property.getPropertyName() + "," + property.getCity() + "," + property.getOwner() + "," + property.getRentAmount() + "\n";
		}
		
		double totalRent = getTotalRent();
		double managementFee = mgmFee / 100;
		
		double totalMgmFee = (totalRent) * (managementFee);
	
		
		
		return "List of the properties for " + name + ", taxID: " + taxID + "\n"
				+ "______________________________________________________\n"
				+ propertyInfo + "______________________________________________________\n"
				+ "\n" + " total management Fee: " + totalMgmFee;
	}
	
	
	
}
 