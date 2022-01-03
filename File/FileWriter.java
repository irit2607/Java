import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter
{
	public static void main(String[] args)throws IOException {
	    FileWriter t = new FileWriter();
	    File bikeInfoFile = new File("E:\\BikeInfo");
	    t.writeToFile(bikeInfoFile);
	}
	
	private void writeToFile(File fileToWriteTo) throws IOException
	{
	    FileWriter bikeInfoWriter = new FileWriter(fileToWriteTo);
	    bikeInfoWriter.write("irit");
	    bikeInfoWriter.flush();
	    bikeInfoWriter.close();
	}
}
