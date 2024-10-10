/*Class: CMSC203 CRN 22557
 Program: Lab 1
 Instructor: David Kuijt
 Summary of Description: Using different classes to ask user movie information
 Due Date: 09/24/2023
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Print your Name here: Arianna Alimi
*/

public class Movie {

	private String title;
	private String rating;
	private int  soldTickets;
	 

	public  Movie ()
	{
		title = "";
		rating = "";
		soldTickets = 0;	
	}

	public  Movie (Movie m)
	{
		title = m.title;
		rating = m.rating;
		soldTickets = m.soldTickets;	
	}
	
	public Movie(String title, String rating, int soldTickets) {
	 
		this.title = title;
		this.rating = rating;
		this.soldTickets = soldTickets;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public int getSoldTickets() {
		return soldTickets;
	}

	public void setSoldTickets(int soldTickets) {
		this.soldTickets = soldTickets;
	}	
	
	public String toString() {
		return (this.title+" ("+this.rating+"): Tickets Sold: "+this.soldTickets);
	}
}
