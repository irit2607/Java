public class WithoutException
{
	public static void main(String[] args) {
	    int denominator = 1;
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

29
Finally Block under execution

*/
