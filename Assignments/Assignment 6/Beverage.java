public abstract class Beverage {
	
	private String bevName;
	private Type type;
	private Size size;
	private final double BASE_PRICE = 2.0;
	private final double SIZE_PRICE = 1.0;
	
	public Beverage(String bevName, Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	public double getBasePrice()
	{
		return BASE_PRICE;
	}
	
	public Type getType()
	{
		return type;
	}
	
	public String getBevName()
	{
		return bevName;
	}
	
	public Size getSize()
	{
		return size;
	}
	
	public double addSizePrice()
	{
		double total = BASE_PRICE;
		
		if(size == Size.MEDIUM)
		{
			total+= SIZE_PRICE;
		}
		
		if(size == Size.LARGE)
		{
			total += (SIZE_PRICE * 2);
		}
		
		
			return total;
		
	}
	
	public String toString()
	{
		return bevName + " " + size;
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		if(this == anotherBev)
		{
			return true;
		}
		
		Beverage beverage = (Beverage) anotherBev;
		
		if(bevName.equals(beverage.bevName) && (type == beverage.type) && (size == beverage.size))
		{
			return true;
		}
		
		return false;
	}
	
	public abstract double calcPrice();

}
