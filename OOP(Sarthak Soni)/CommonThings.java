//This program illustrates the concept of Inheritance of OOPS
class CommonThings{
	public static void main(String args[])							//Main method
	{
		Dog d=new Cat();  								//Creating object to access the methods
		d.type();
		d.eat();		

		Cat c=new Cat();								//Creating object to access the methods
		c.type();
		c.eat();
	}
}

class Dog											
{
	public void type()
	{
		System.out.println("Terrestial");
	}
	public void eat()
	{
		System.out.println("Mouse");
	}
}
class Cat extends Dog										//Inheritance from class Dog ,notice that without writing anything here we are able to extract the common attributes of both the animals
{
	
}
