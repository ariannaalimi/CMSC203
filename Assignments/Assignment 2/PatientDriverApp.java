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

public class PatientDriverApp 
{
	
	//method to display patient x
	public static String displayPatient(Patient x)
	{
		return x.toString();
	}

	//method to display procedure p
	public static String displayProcedure(Procedure p)
	{
		return p.toString();
	}

	//method to calculate the total charges of 3 procedures
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3)
	{
		
		double totalCharges = 0;
		return totalCharges += p1.getCHARGES() + p2.getCHARGES() + p3.getCHARGES();
	}
	
	
	public static void main(String[] args) 
	{
		//fields
		Patient myPatient;
		Procedure procedure1;
		Procedure procedure2;
		Procedure procedure3;
		
		
		//instances to create a patient
		myPatient = new Patient("Jenny", "Elaine", "Santori", "123-456-7890", "123 Main St", "MyTown", "CA", 668, "Bill Santori", "777-555-1212");
		procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr. Irvine", 3250);
		procedure2 = new Procedure("X-Ray", "7/20/2019", "Dr. Jamison", 5500.45);
		procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);
		
		
		
		//printing out patient information
		System.out.println("Patient info:");
		System.out.println(displayPatient(myPatient));
		
		System.out.println(displayProcedure(procedure1));
		System.out.println(displayProcedure(procedure2));
		System.out.println(displayProcedure(procedure3));
		
		System.out.println("Total Charges: $" + calculateTotalCharges(procedure1, procedure2, procedure3));
	
		System.out.println();
		
		System.out.println("Student Name: Arianna Alimi");
		System.out.println("MC#: 21122069");
		System.out.println("Due Date: 09/24/2023");
	}
}
