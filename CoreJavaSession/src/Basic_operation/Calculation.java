package Basic_operation;

public class Calculation {

	public static void main(String[] args) {
  //local variable
		double pi=3.14d;
		int r=12;
		System.out.println("calculate the area of circle ="+pi*r*r);
		
//Calculate the area of rectangle formula = A=Wealth*length
		int L=30,W=10;
		System.out.println("calculate the area of rectangle ="+L*W);
		
//Calculate basic operation
		System.out.println("two number  a=20,b=30");
		//Addition
		int a=20,b=30,c;
		c=a+b;
		System.out.println("addition ="+c);
		
		//Subtraction
		c=a-b;
		System.out.println("subtraction ="+c);
		
		//multiplication
		c=a*b;
		System.out.println("multiplication = "+c);
		
		//division
		c=a/b;
		System.out.println("division ="+c);
		
		//modulus
		c=a%b;
		System.out.println("modulus ="+c);
		
		//simple interest
		int interest,time=1,principle_balance=5000,annual_interest_Rate=1000;
		interest=principle_balance*(1+time*annual_interest_Rate);
		System.out.println("simple interest = "+interest);
		
		
		//convert temperature fahrenheit to celsius c=(f-32)*5/9
		int celsius,f=22;
		celsius=(f-32)*5/9;
		System.out.println("celsius ="+celsius);
		
		
		
	}

}
