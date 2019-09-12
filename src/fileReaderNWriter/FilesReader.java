package fileReaderNWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		// http://textfile.com/100/captmidn.text
		
		File file = new File("/Users/akmaslam/eclipse-workspace/Tutorials/src/fileReaderNWriter/Sample.txt");
		
		Scanner scan = new Scanner(file);
		
		String fileContent ="";
		
		while (scan.hasNextLine()) {
			
			fileContent = fileContent.concat(scan.nextLine()+"\n");
			
		}
	    
		System.out.println(fileContent);
		
	    scan.close();
	}
	
}
