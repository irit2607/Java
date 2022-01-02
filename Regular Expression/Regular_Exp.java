import java.util.regex.*;
public class Regular_Exp
{
	public static void main(String[] args) {
	    String pattern = "[a-z]+";
	    String check = "Happy Learning";
	    Pattern p = Pattern.compile(pattern);
	    Matcher c = p.matcher(check);
	    while(c.find())
	    {
	        System.out.println(check.substring(c.start(), c.end()));
	    }
	}
}

/* o/p
appy
earning
*/
