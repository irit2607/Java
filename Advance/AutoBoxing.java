// when to use Autobox or auto-Unbox 
// Autobox => To convert primitive to unwarapped class
//Unbox => unwarapped -> primitive

public class AutoBoxing
{
	public static void main(String[] args) {
		int i=10;
		
		//AutoBox
		
		Integer iObj = Integer.valueOf(i);
		System.out.println("Value of Integer obj " +iObj);
		
		//auto-Unbox
		int i1 = iObj;
		System.out.println("Value of i1 " +i1);
	}
}

/*  o/p

Value of Integer obj10
Value of i1 10

*/
