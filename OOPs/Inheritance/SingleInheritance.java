
class Manager{
    void prop()
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

public class SingleInheritance
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		e.emp();
		e.prop();
	}
}

//o/p
// Employee
// Manager
