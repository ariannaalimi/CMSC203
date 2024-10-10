public class Smoothie extends Beverage{

	
	int numOfFruits;
	boolean addProtein;

	private final double PROTEIN_COST = 1.50;
	private final double FRUIT_COST = 0.50;
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein)
	{
		
		super(bevName, Type.SMOOTHIE, size);
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
	}
	
	
	public int getNumOfFruits()
	{
		return numOfFruits;
	}
	
	public boolean getAddProtein()
	{
		return addProtein;
	}
	
	@Override
	public double calcPrice()
	{
		double cost = super.addSizePrice() + (numOfFruits * FRUIT_COST);
		
		if(addProtein)
		{
			cost += PROTEIN_COST;
		}
		
		
		return cost;
	}
	
	@Override
	public String toString()
	{
		return super.toString() + " " + addProtein + " " + numOfFruits + " " + calcPrice();
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
			
			Smoothie smoothie = (Smoothie) anotherBev;
			
			if((this.numOfFruits == smoothie.numOfFruits) && (this.addProtein == smoothie.addProtein))
			{
				return true;
			}
			
			return false;
		}
	}
	
	
	

}
