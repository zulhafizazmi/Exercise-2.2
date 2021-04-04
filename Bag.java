
public class Bag {
	
	   String brand;
	   String type;
	   String colour;
	   double weight;
	   String style;
	   String load;
	   String physical;
	   
	   void printBag(String b, String t, String c, String w) {
		   System.out.println("Bag brand :" + b);
		   System.out.println("Bag type :" + t);
		   System.out.println("Bag colour :" + c);
	       System.out.println("Bag weight :" + w + "kg");
	      
	   }
	       
	   void printStyle(String s) {
		   System.out.println("Style :" + s);
	   
	   }
	   
	   void printLoad(String l) {
		   System.out.println("Load :" + l);
		      
	   }
		   
	   void printPhysical(String p) {
		   System.out.println("Size :" + p);
		   
	   }

}


