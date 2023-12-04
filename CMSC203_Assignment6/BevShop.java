import java.util.ArrayList;
import java.util.Collections;

public class BevShop implements BevShopInterface{
	
	public ArrayList<Order> orders;
	
	public BevShop()
	{
		this.orders = new ArrayList<>();
	}
	
	public boolean isValidTime(int time)
	{
		if(time >= MIN_TIME && time <= MAX_TIME)
		{
			return true;
		}
		
		else
			return false;
	}
	
	public int getMaxNumOfFruits()
	{
		return MAX_FRUIT;
	}
	
	public int getMinAgeForAlcohol()
	{
		return MIN_AGE_FOR_ALCOHOL;
	}
	
	public boolean isMaxFruit(int numOfFruits)
	{
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		
		else
			return false;
	}
	
	public int getMaxOrderForAlcohol()
	{
		return MAX_ORDER_FOR_ALCOHOL;
	}
	
	
	
	
	public boolean isEligibleForMore()
	{
		
		if(getNumOfAlcoholDrink() > MAX_ORDER_FOR_ALCOHOL)
		{
			return true;
		}
		
		return false;
		
	}

	
	public int getNumOfAlcoholDrink() {
		
		Order order = orders.get(orders.size() - 1);
		
		int numOfDrinks = order.findNumOfBeveType(Type.ALCOHOL);
		
		return numOfDrinks;
	}


	public boolean isValidAge(int age) {
		
		if(age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		
		Order order = new Order(time, day, new Customer(customerName, customerAge));
		orders.add(order);
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		
		 Order order = orders.get(orders.size() - 1);
		 
		 order.addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		Order order = orders.get(orders.size() - 1);
		 
		order.addNewBeverage(bevName, size);
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Order order = orders.get(orders.size() - 1);
		 
		order.addNewBeverage(bevName, size, numOfFruits, addProtein);
		
	}

	@Override
	public int findOrder(int orderNo) {
		
		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
			{
				return i;
			}
		}
		
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		
		for(int i = 0; i < orders.size(); i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
			{
				return orders.get(i).calcOrderTotal();
			}
		}
		
		return -1;
		
	}

	@Override
	public double totalMonthlySale() {
		
		double total = 0;
		
		for(int i = 0; i < orders.size(); i++)
		{
			 total += orders.get(i).calcOrderTotal();
			
		}
		
		return total;
		
	}

	@Override
	public int totalNumOfMonthlyOrders() {
		
		return orders.size();
		
	}

	@Override
	public Order getCurrentOrder() {
		
		if(orders.size() == 0)
		{
			return null;
		}
		
		 return orders.get(orders.size() - 1);
	}

	@Override
	public Order getOrderAtIndex(int index) {
		
		return orders.get(index);
	}

	@Override
	public void sortOrders() {
		
		for(int i = 0; i < orders.size() - 1; i++)
		{
			int min = i;
			
			for(int j = i + 1; j < orders.size(); j++)
			{
				if(orders.get(j).compareTo(orders.get(min)) < 0)
				{
					min = j;
				}
			}
			
			Collections.swap(orders, i, min);
		}
		
	}
	
	
	
	

}
