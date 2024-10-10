import java.util.Scanner;


public class BevShopDriverApp {
	
	
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		
		BevShop bevShop = new BevShop();
		
		
		System.out.println("The current order in process can have at most 3 alcoholic beverages");
		
		System.out.println("The minimum age to order alcohol drink is 21");
		
		System.out.println("Start please a new order:");
		
		
		
		System.out.println("Your Total Order for now is 0.0");
		
		
		System.out.println("Would you please enter your name ");
		String name = scan.nextLine();
		
		System.out.println("Would you please enter your age ");
		int age = scan.nextInt();
	
		
		bevShop.startNewOrder(age, Day.MONDAY, name, age);
		
		
		if(bevShop.isValidAge(bevShop.getCurrentOrder().getCustomer().getAge()))
		{
			System.out.println("Your age is above 20 and you are eligible to order alcohol");
			
			System.out.println("Would you please add an alcohol drink");
			bevShop.processAlcoholOrder("Cosmo", Size.MEDIUM);
			
			System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
            System.out.println("Your current alcohol drink order is less than 4");
            
            System.out.println("Would you please add a second alcohol drink");
            bevShop.processAlcoholOrder("Mojito", Size.SMALL);
			System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
            System.out.println("Your current alcohol drink order is less than 4");
          

            System.out.println("Would you please add a third alcohol drink");
            bevShop.processAlcoholOrder("Long Island", Size.LARGE);
			System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
			System.out.println("The Total price on the Order is " + bevShop.getCurrentOrder().calcOrderTotal());
            
			System.out.println("You have a maximum alcohol drinks for this order");
			
            
			
			
		}
		
		
		
		System.out.println("Would you please add a COFFEE to your order:");
		bevShop.processCoffeeOrder("Americano", Size.MEDIUM, false, true);
		
		System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
		
		System.out.println("The Total Price on the Order is: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("#------------------------------------#");
		
		scan.nextLine();
		
		System.out.println("Would you please start a new order");
		System.out.println("Would you please enter your name: ");
		String name2 = scan.nextLine();
		
		
		System.out.println("Would you please enter your age");
		int age2 = scan.nextInt();
		
		
		
		
		
		
		bevShop.startNewOrder(age2, Day.SUNDAY, name2, age2);
		
		System.out.println("The Total price on the Order is: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Would you please add a SMOOTHIE to order");
		bevShop.processSmoothieOrder("Strawberry Banana", Size.SMALL, 2, true);
		System.out.println("The Total price on the Order is: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Would you please add a SMOOTHIE to order");
		bevShop.processSmoothieOrder("Mango", Size.LARGE, 2, false);
		System.out.println("The Total price on the Order is: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Would you please add a COFFEE to your order:");
		bevShop.processCoffeeOrder("Latte", Size.LARGE, true, true);
		System.out.println("The Total price on the Order is: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		System.out.println("Would you please add a drink");
		
		if (bevShop.isValidAge(bevShop.getCurrentOrder().getCustomer().getAge()) == false)
		{
			System.out.println ("Age is not appropriate for alcohol drink!!");
		}
		
		System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
		System.out.println("The Total price on the Order is: " + bevShop.getCurrentOrder().calcOrderTotal());
		
		int fruits = 4;
		
		System.out.println("The total numver of fruits is " + fruits);
		
		if(bevShop.isMaxFruit(fruits))
		{
			System.out.println("You reached a Maximum number of fruits");
		
		}
		
		System.out.println("Total amount for all Orders: " + bevShop.totalMonthlySale());
		
		
		
		
	}
	
}


