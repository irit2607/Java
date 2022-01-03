
public class WithException
{
	public static void main(String[] args) {
	    int denominator = 0;
	    try {
	        System.out.println(29/denominator);
	    }
	    catch(ArithmeticException exception)
	    {
	        System.out.println("arthmetic exception occurred " +exception.getMessage());
	    }
		finally{
		    System.out.println("Finally Block under execution");
		}
	}
}

/* o/p  

arthmetic exception occurred / by zero
Finally Block under execution

*/
