
class Manager{
    int salary = 50000;
}

class Employee extends Manager
{
    int id = 01;
    int empSalary = 40000;
}

public class Inheritance
{
	public static void main(String[] args) 
	{
		Employee e = new Employee();
		System.out.println("Employee with id " +e.id+ " gets " +e.empSalary+ " every month");
		System.out.println("Manager's salary is " +e.salary);
	}
}
