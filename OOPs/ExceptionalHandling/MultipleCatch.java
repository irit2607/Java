
public class MultipleCatch
{
	public static void main(String[] args) {
	    int denominator = 1;
	    try {
	        int a = 10;
	        int b=0;
	       
	        int d[] = {1,3,5,7};
	        System.out.println(d[10]);
	    }
	    catch(ArithmeticException exception)
	    {
	        System.out.println("arthmetic exception occurred " +exception.getMessage());
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	        System.out.println("Array Index Out Of Bounds Exception occurred " +e.getMessage());
	    }
	    
		catch(Exception e)
		{
		    System.out.println("Exception should be always in last");
		}
	}
}

// op
// Array Index Out Of Bounds Exception occurred Index 10 out of bounds for length 4
