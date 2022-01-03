import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput
{
	public static void main(String[] args) throws FileNotFoundException
	{
	    File employeeInfoFile = new File("E:\\EmployeeInfo.txt");             // file to be write
	    InputOutput demo = new InputOutput();
	    demo.writeToFile(employeeInfoFile);
	    File vehicleInfo = new File("VehicleInfo.txt");                        // file to be read
	}
	
	public void writeToFile(File fileToWrite)                                  //write
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
	
	public void readToFile(File fileToRead) throws FileNotFoundException             //   read
	{
	    Scanner input = new Scanner(fileToRead);
	    while(input.hasNext())
	    {
	        System.out.println("Lines read from i/p file :" +input.nextLine());
	    }
	}
}


