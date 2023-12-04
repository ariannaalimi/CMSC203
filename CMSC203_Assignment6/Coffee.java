
public class Coffee extends Beverage{
	
	private boolean extraShot;
	private boolean extraSyrup;
	private final double EXTRA_SHOT_COST = 0.50;
	private final double EXTRA_SYRUP_COST = 0.50;
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup)
	{
		super(bevName, Type.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		
	}
	
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	public double calcPrice()
	{
		double cost = super.addSizePrice();
		
		if(extraShot)
		{
			cost +=  EXTRA_SHOT_COST;
		}
		
		if (extraSyrup)
		{
			cost += EXTRA_SYRUP_COST;
		}
		
		return cost;
	}
	
	public String toString()
	{
		return super.toString() + " " + extraShot + " " + extraSyrup + calcPrice();
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
			
			Coffee coffee = (Coffee) anotherBev;
			
			if((this.extraShot == coffee.extraShot) && (this.extraSyrup == coffee.extraSyrup))
			{
				return true;
			}
			
			return false;
		}
	}
	
}
