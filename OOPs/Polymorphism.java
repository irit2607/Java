class Manager{
    void emp()
    {
        System.out.println("Manager");
    }
}

class Employee extends Manager
{
    void emp()
    {
        System.out.println("Employee");
    }
}

public class Polymorphism
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.emp();
	}
}

/* o/p
Employee
/*
