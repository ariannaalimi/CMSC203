import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Order implements OrderInterface, Comparable<Order>{
	

		
	private int orderTime;
	private int orderNumber;
	private Day orderDay;
	private Customer cust;
	private List<Beverage> beverages;
	
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderNumber = generateOrder();
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = new Customer(cust);
		this.beverages = new ArrayList<>();
	}
	
	public int generateOrder()
	{
		Random rand = new Random();
		
		return rand.nextInt(90001 - 10000) + 10000;
	}
	
	//getters
	public int getOrderNo()
	{
		return orderNumber;
	}
	
	public int getOrderTime()
	{
		return orderTime;
	}
	
	public Day getOrderDay()
	{
		return orderDay;
	}
	
	public Customer getCustomer()
	{
		return new Customer(cust);
	}
	public Day getDay()
	{
		return orderDay;
	}
	
	public Beverage getBeverage(int itemNo)
	{
		if(itemNo >= 0 && itemNo < beverages.size())
			return beverages.get(itemNo);
		
		else
			return null;
		
	}
	
	public int getTotalItems()
	{
		return beverages.size();
	}
	
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		Coffee newCoffee = new Coffee(bevName, size, extraShot, extraSyrup);
		beverages.add(newCoffee);
	}
	
	public void addNewBeverage(String bevName, Size size)
	{
		
		Alcohol newAlcohol = new Alcohol(bevName, size, this.isWeekend());
		beverages.add(newAlcohol);		
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		Smoothie newSmoothie = new Smoothie(bevName, size, numOfFruits, addProtein);
		beverages.add(newSmoothie);
				
			
				
	}

	@Override
	public int compareTo(Order o) {
		
		return Integer.compare(this.orderNumber, o.getOrderNo());
	}

	public boolean isWeekend() {
	
		if(this.orderDay.equals(Day.SATURDAY) || this.orderDay.equals(Day.SUNDAY))
		{
			return true;
		}
		
		return false;
	
		
	}


	public double calcOrderTotal() {
		
		double total = 0;
		
		for(int i = 0; i < beverages.size(); i++)
		{
			Beverage indexBeverage = beverages.get(i);
			double indexBeverageTotal = indexBeverage.calcPrice();
			
			total += indexBeverageTotal;
		}
		
		return total;
	
		
	}


	public int findNumOfBeveType(Type type) {
		
		int total = 0;
		
		for (int i = 0; i < beverages.size(); i++)
		{
			Beverage beverageIndex = beverages.get(i);
			
			if(beverageIndex.getType() == type)
			{
				total+= 1;
			}
		
		}
		
		return total;
	}
	
	
	public String toString()
	{
		String line = orderNumber + " " + orderTime + " " + " " + orderDay + " " + cust.toString(); 
		
		for(int i = 0; i < beverages.size(); i++)
		{
			Beverage bev = beverages.get(i);
			line+= bev.toString() + "\n";
		
		}
		
		return line;
	}
	
	

}
