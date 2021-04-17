
public class Main {

	public static void main(String[] args) {
		
		//Default Constructor
		Purse purseA = new Purse ();

		
		System.out.printf("======= %s ======= %n", purseA.Brand);
		System.out.printf("%-10s: %s%n", "Brand", purseA.Brand);
		System.out.printf("%-10s: %s%n", "Color", purseA.Color);
		System.out.printf("%-10s: RM%d%n", "PriceRM", purseA.PriceRM);
		System.out.printf("%-10s: %.2fL%n", "Volume", purseA.VolumeLiters);
		System.out.println("--- HARI RAYA OFFER ---");
		System.out.printf("%-10s: %d%%%n", "Discount", purseA.Discount);
		System.out.printf("%-10s: RM%d%n", "Offer Price", purseA.DiscountPrice);
				
		System.out.println("\n\n");
		
		//Parameterized Constructor
		Purse purseB = new Purse("Coach", "Black", 450, 30, 70);
		System.out.printf("======= %s ======= %n", purseB.Brand);
		System.out.printf("%-10s: %s%n", "Brand", purseB.Brand);
		System.out.printf("%-10s: %s%n", "Color", purseB.Color);
		System.out.printf("%-10s: RM%d%n", "PriceRM", purseB.PriceRM);
		System.out.printf("%-10s: %.2fL%n", "Volume", purseB.VolumeLiters);
		System.out.println("--- HARI RAYA OFFER ---");
		System.out.printf("%-10s: %d%%%n", "Discount", purseB.Discount);
		System.out.printf("%-10s: RM%d%n", "Offer Price", purseB.DiscountPrice);
		
	}
}
