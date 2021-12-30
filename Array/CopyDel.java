//Create an array having many characters. Write a program to copy elements from created array to another array and also write a program to delete an element from an array

public class CopyDel
{
	public static void main(String[] args) {
	
	//creating array of characters
	    char[] source = {'H', 'A', 'P', 'P', 'Y'};
	    char[] destination = new char[7];
	
	// copying elements from one array to another
	    System.arraycopy(source, 0, destination,1,5);
	    System.out.println(new String(destination));
	    
	// Deleting element from array
	    int flag = 3;
	    for(int i =0; i<source.length; i++)
	    {
	        //Delete function
	        if(flag == i)
	        {
	            for(int j= i+1; i<source.length; i++)
	            {
	                source[i] = source[j];                       // i=3, j=4 => now at 3rd pos is allocated by 4th value
	                i++;
	            }
	            System.out.println(source);
	        }
	    }
	}   
	
}
