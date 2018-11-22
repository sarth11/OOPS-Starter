//This program illustrates Polymorphism concept of OOPS
class AnimalBehave{
	public static void main(String args[])							//Main method				
	{
		Animal a =new Dog();								//Object created to access dog animal behaviour
		a.speak();									//Results for Dog object type
		a.eat();
		a=new Cat();									//Object created to access cat annimal behaviou
		a.speak();									//Results for Cat object type
		a.eat();

	}
}
abstract class Animal										//abstract class declaration
{
	abstract void speak();
	abstract void eat();
}
class Dog extends Animal									//Dog class and its methods
{
	void speak()										//method overriding
	{
		System.out.println("Barks");
	}
	void eat()									
	{
		System.out.println("Cat");
	}
}
class Cat extends Dog										//Cat class and its methods
{
	void speak()										//method overriding
	{
		System.out.println("Meow");
	}
	void eat()
	{
		System.out.println("Mouse");
	}
}
	

