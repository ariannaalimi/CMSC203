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

public class Patient 
{
	private String firstName;
	private String lastName;
	private String middleName;
	private String streetAddress;
	private String CITY;
	private String STATE;
	private int zipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyPhoneNumber;

	public Patient() 
	{
		
	}
	
	public Patient(String firstName, String middleName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
	}
	
	public Patient(String firstName, String middleName, String lastName, String phoneNumber, String streetAddress, String CITY, String STATE, int zipCode, String emergencyName, String emergencyPhoneNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.CITY = CITY;
		this.streetAddress = streetAddress;
		this.STATE = STATE;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	
	
	
	//getters
	public String getfirstName()
	{
		return firstName;
	}
	
	public String getmiddleName()
	{
		return middleName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public String getCITY()
	{
		return CITY;
	}
	
	public String getstreetAddress()
	{
		return streetAddress;
	}
	
	public String getSTATE()
	{
		return STATE;
	}
	
	public int getzipCode()
	{
		return zipCode;
	}
	
	public String getphoneNumber()
	{
		return phoneNumber;
	}
	
	public String getemergencyName()
	{
		return emergencyName;
	}
	
	public String getemergencyPhoneNumber()
	{
		return emergencyPhoneNumber;
	}
	
	
	
	
	
	
	
	//mutators
	
	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setmiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	
	public void setlastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public void setCITY(String CITY)
	{
		this.CITY = CITY;
	}
	
	public void setstreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}
	
	public void setSTATE(String STATE)
	{
		this.STATE = STATE;
	}
	
	public void setzipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}
	
	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public void setemergencyName(String emergencyName)
	{
		this.emergencyName = emergencyName;
	}
	
	public void setemergencyPhoneNumber(String emergencyPhoneNumber)
	{
		this.emergencyPhoneNumber = emergencyPhoneNumber;
	}
	
	
	
	
	
	
	//methods
	
	//building the full name
	public String buildFullName(String firstName, String middleName, String lastName, String phoneNumber)
	{
		return firstName + " " + middleName + " " + lastName + " " + phoneNumber;
	}
	
	
	//building the address
	public String buildAddress(String streetAddress, String CITY, String STATE, int zipCode)
	{
		return streetAddress + " " + CITY + " " + STATE + " " + zipCode;
	}
	
	
	//building the emergency contact
	public String buildEmergencyContact(String emergencyName, String emergencyPhoneNumber)
	{
		return emergencyName + " " + emergencyPhoneNumber;
	}
	
	//toString to construct what it will look like
	public String toString()
	{
		return "  " + "Name: " + buildFullName(getfirstName(), getmiddleName(), getlastName(), getphoneNumber()) + "\n" + 
		"  " + "Address: " + buildAddress(getstreetAddress(), getCITY(), getSTATE(), getzipCode()) + "\n" + 
		"  " + "Emergency Contact: " + buildEmergencyContact(getemergencyName(), getemergencyPhoneNumber()) + "\n";
		
		
	}

}




