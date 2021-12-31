
class Manager{
    void prop()
    {
        System.out.println("Manager -> inherited by employee & Watchman");
    }
}

class Employee extends Manager
{
    void emp()
    {
        System.out.println("Employee inherits Manager");
    }
}

class Watchman extends Manager
{
    void man()
    {
        System.out.println("Watchman inherits Manager");
    }
}
public class HierarchicalInheritance
{
	public static void main(String[] args) 
	{
		Watchman e = new Watchman();
		e.man();
		e.prop();
	}
}
