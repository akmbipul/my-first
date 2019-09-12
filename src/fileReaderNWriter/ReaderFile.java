package fileReaderNWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReaderFile {

	
	public static void main(String[] args) {
		
		String fileName = "/Users/akmaslam/eclipse-workspace/Tutorials/src/fileReaderNWriter/Sample.txt"; 

	try {	
		FileReader fr = new FileReader(fileName);
		
		BufferedReader br = new BufferedReader(fr);
		
	 	String data = "";
		
	 	while((data = br.readLine())!= null) {
		
			   System.out.println(data); 
		     }
	    }catch (Exception ex1) {
		
		System.out.println("File Not Found!!");
	
	    }
//	finally {
//			
//	    	try {
//	    		
//	    		br.close();
//	    		fr.close();
//				
//	    }catch (Exception ex2) {
//				
//			}
		 }
	}

