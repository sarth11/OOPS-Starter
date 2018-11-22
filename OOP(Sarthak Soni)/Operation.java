//This program illustrates the Abstraction concept in OOPS
class Operation{    
	public static void main(String args[])									//Main Method
	{
		Calculator user=new Scientific();								//Object created to access 
		user.show();
		System.out.println("Total Cost is: "+user.getPrice());						//Printing results
		user=new Statistical();
		user.show();
		System.out.println("Total Cost is: "+user.getPrice());	
	}
}
abstract class Calculator{											//abstract class declaration
	abstract void show();
	abstract int getPrice();
}
class Scientific extends Calculator{										//methods for scientific calculator
	void show()
	{
		System.out.println("This is the scientific calculator");
	}
	int getPrice()
	{
		return 500;
	}
}
class Statistical extends Calculator										// methods for Statistical Calculator
{
	void show()
	{
		System.out.println("This is the statistical calculator");
	}
	int getPrice()
	{
		return 240;
	}
}
