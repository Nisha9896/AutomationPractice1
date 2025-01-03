package Overridding_AbstractClass;
   class Animal{
	  public void Animal() {
		   }
	  public void move() {
		   System.out.println("Animal Can Move");
	   }
   } 
   class Plants extends Animal{
	  public void FruitPlant() {
		   System.out.println("this is fruit plant");
		   	   }
	 public void Animal() {
		   System.out.println("Plants Can not Move");

	   }
	   public void ApplePlant() {
		   System.out.println("This is ApplePlant");
	   }
   } 
public class Overridding_Example1 {
   	public static void main(String[] args) {
   		/*Animal ref1= new Animal();
   		ref1.move();
   		
   		Plants ref2= new Plants() ;
   		ref2.FruitPlant();	
   		ref2.Animal();
   		ref2.ApplePlant();*/
   		
   		Plants ref3= new Plants(); 
   		ref3.move();
   		ref3.Animal();
   		ref3.ApplePlant();
	}

}
