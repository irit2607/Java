// Java Program to Illustrate Override Annotation

// Class 1
class Main
{
	public void Display()
	{
		System.out.println("Base display()");
	}
	
	public static void main(String args[])
	{
		Main t1 = new Derived();
		t1.Display();
	}	
}

// Class 2
// Extending above class
class Derived extends Main
{
	@Override                       //throght this complier will get to know that method has been overrided
	public void Display()
	{
		System.out.println("Derived display()");
	}
}

// o/p
// Derived display()
