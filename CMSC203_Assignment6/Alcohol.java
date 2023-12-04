public class Alcohol extends Beverage{

	
	private boolean isWeekend;
	private final double WEEKEND_COST = 0.60;

	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		
		super(bevName, Type.ALCOHOL, size);
		this.isWeekend = isWeekend;
	}
	
	@Override
	public double calcPrice()
	{
		double cost = super.addSizePrice();
		
		if(isWeekend)
		{
			return cost + WEEKEND_COST;
		}
		
		return cost;
		
		
	
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " " + isWeekend + " " + calcPrice();
	}
	
	@Override
	public boolean equals(Object anotherBev)
	{
		{
			if(this == anotherBev)
			{
				return true;
			}
			
			if(!super.equals(anotherBev))
			{
				return false;
			}
			
			Alcohol alcohol = (Alcohol) anotherBev;
			
			if(this.isWeekend == alcohol.isWeekend)
			{
				return true;
			}
			
			return false;
		}
	}
	
	public boolean isWeekend()
	{
		return isWeekend;
	}
	

}
