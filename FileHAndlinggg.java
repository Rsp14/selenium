import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHAndlinggg {

	public static void main(String[] args) throws IOException {
		
		     File myFile = new File ("E:\\Turbo.txt");
		     FileWriter fileWritor = new FileWriter("E:\\Turbo.txt");
		     
		     fileWritor.write("Hi this ravi prasad"
		     		+           "Please elp the poor"
		     		+         "Hewlett Packard");
		     fileWritor.close();
		       System.out.println(myFile.getName());
		

	}

}
