public class Operations
{
	public static void main(String[] args) {
	    String s1 = "Happy";
	    String s2 = "Learning";
	    int i=100;
	    
	    System.out.println(s2.endsWith("g"));             // checks if the strings end with given character
	    System.out.println(s1.charAt(4));                 // return character present at given index
	    System.out.println(s1.replace('H', 'h'));         // replacing old char with new converts
	   // System.out.println(replace.contains("H"));
	    
	    System.out.println("Printing equality of strings " +s1.equals(s2));
	    System.out.println(String.valueOf(i));             // it converts diff data type to strings
	    System.out.println(s1.toUpperCase());              // Upper Case.. similarly for lower case
	    System.out.println(s1.compareTo(s2));              // to compare strings
            System.out.println(s1.length());                   //length of string
	    System.out.println(s1.substring(2));                 
	}
}
