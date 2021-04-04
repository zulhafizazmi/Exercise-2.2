
public class Main {

	public static void main(String[] args) {
		
		Bag adidas = new Bag(); //create first new object Bag
		
		adidas.printBag("adidas", "sling bag", "white", "0.5");
		adidas.printStyle("suitable for men");
		adidas.printLoad("can overload");
		adidas.printPhysical("medium");
		
		System.out.println();
		
		
		Bag nike = new Bag(); //create second new object Bag
		
		nike.printBag("nike", "porch bag", "black", "0.4");
		nike.printStyle("suitable for women");
		nike.printLoad("can't overload");
		nike.printPhysical("small");
		
		System.out.println();
		

		

	}

}
