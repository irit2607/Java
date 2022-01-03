import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputOutput
{
	public static void main(String[] args)
	{
	    File employeeInfoFile = new File("E:\\EmployeeInfo.txt");
	    InputOutput demo = new InputOutput();
	    demo.writeToFile(employeeInfoFile);
	}
	
	public void writeToFile(File fileToWrite)
	{
	    PrintWriter employeeInfoWrite = null;
	    try
	    {
	        employeeInfoWrite = new PrintWriter(fileToWrite);
	        employeeInfoWrite.println("Irit");
	    }
	    catch(FileNotFoundException e)
	    {
	        System.out.println("given file is not found on the local disk" +fileToWrite.getName());
	        throw new RuntimeException(e);
	    }
	    finally
	    {
	        employeeInfoWrite.close();
	    }
	}
}
