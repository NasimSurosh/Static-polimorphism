package assignment1;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		Object[] object = new Object[3];
		
		object[0] = new USD();
		object[1] = new EUR();
		object[2] = new GBP();
		
		for (Object object1: object) {
			if (object1 instanceof USD) {
				double amount = 100;
				double calculate = USD.convertToUSD(amount);
				System.out.println("convert of "+amount + " USD to EUR is " + calculate + " \u20ac");
			}
			else if (object1 instanceof EUR) {
				double amount = 100;
				double calculate1 = EUR.convertTOEuro(amount);
				System.out.println("convert of "+amount + " \u20ac to USD is " + calculate1 + " $");
			}
			else if (object1 instanceof GBP) {
				double amount = 100;
				double calculate2 = GBP.convertToUSD(amount);
				System.out.println("convert of "+amount + " GBP to USD is " + calculate2 + " $");
		}
		}
	}

}
