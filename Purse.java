import java.util.Scanner;
public class Purse {
	
	String Brand;
	String Color;
	int PriceRM;
	double VolumeLiters;
	int Discount;
	int DiscountPrice;
	
	Scanner sc = new Scanner(System.in);
	
	//default constructor
	Purse() {
		
		System.out.printf("%-20s:", "Enter the Brand");
		this.Brand = sc.nextLine();
		
		System.out.printf("%-20s:", "Enter the Color");
		this.Color = sc.nextLine();
		
		System.out.printf("%-20s:", "Enter the Price");
		this.PriceRM = sc.nextInt();
		
		System.out.printf("%-20s:", "Enter the Volume");
		this.VolumeLiters = sc.nextDouble();
		
		System.out.printf("%-20s:", "Enter Discount Percent (%)");
		this.Discount = sc.nextInt();
		this.DiscountPrice = (int)((this.PriceRM * (100 - Discount) / 100));
		
		
	}
	
	//parameterized constructor
	Purse (String br, String color, int price, double volume, int discount){
		this.Brand = br;
		this.Color = color;
		this.PriceRM = price;
		this.VolumeLiters = volume;
		this.Discount = discount;
		this.DiscountPrice = (int)((price * (100 - discount) / 100));
		
	}
}

