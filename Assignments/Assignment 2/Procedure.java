/*
 Class: CMSC203 CRN 22557
 Program: Assignment #2
 Instructor: David Kuijt
 Summary of Description: Creating different classes to make a patient profile
 Due Date: 09/24/2023
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 */
package Assignment2Package;

public class Procedure 

{
	//fields
	private String nameOfProcedure;
	private String dateOfProcedure;
	private String nameOfPract;
	private double CHARGES; 
	
	
	
	//Constructors
	public Procedure()
	{
		
	}
	
	public Procedure(String nameOfProcedure, String dateOfProcedure)
	{
		this.nameOfProcedure = nameOfProcedure;
		this.dateOfProcedure = dateOfProcedure;
	}
	
	public Procedure(String nameOfProcedure, String dateOfProcedure, String nameOfPract, double CHARGES)
	{
		this.nameOfProcedure = nameOfProcedure;
		this.dateOfProcedure = dateOfProcedure;
		this.nameOfPract = nameOfPract;
		this.CHARGES = CHARGES;
	}
	
	
	//getters
	public String getnameOfProcedure()
	{
		return nameOfProcedure;
	}
	
	public String getdateOfProcedure()
	{
		return dateOfProcedure;
	}
	
	public String getnameOfPract()
	{
		return nameOfPract;
	}
	
	public double getCHARGES()
	{
		return CHARGES;
	}
	
	
	//setters
	public void setnameOfProcedure(String nameOfProcedure)
	{
		this.nameOfProcedure = nameOfProcedure;
	}
	
	public void setdateOfProcedure(String dateOfProcedure)
	{
		this.dateOfProcedure = dateOfProcedure;
	}
	
	public void setnameOfPract(String nameOfPract)
	{
		this.nameOfPract = nameOfPract;
	}
	
	public void setCHARGES(double CHARGES)
	{
		this.CHARGES = CHARGES;
	}
	
	//toString to organize what it will look like
	public String toString()
	{
		return "	" + "Procedure: " + nameOfProcedure + "\n"
			+  "	" + "Procedure Date = " + dateOfProcedure + "\n"
			+  "	" + "Practitioner = " + nameOfPract + "\n"
			+  "	" + "Charge = " + CHARGES + "\n";	
	}

}
