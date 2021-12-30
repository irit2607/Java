public class StringBuffer
{
	public static void main(String[] args) {
	    StringBuffer s = new StringBuffer("Welcome");
	    s.append(" to E-Learning");                                  //append
	    
		  System.out.println(s);
		
		  s.insert(0,'w');                                              //insert
    	System.out.println(s);	
    	
    	s.replace(0,2,"jel");                                         // replace
    	System.out.println(s);
    	
    	s.delete(0,1);
    	System.out.println(s);
    	
    	System.out.println(s.reverse());                                // reverse
    	
    	System.out.println(s.capacity());
	}
}
