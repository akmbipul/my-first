package fileReaderNWriter;

import java.io.IOException;

public class testReader {

	public static void main(String[] args) throws IOException {

		ReadFromExcel rfe = new ReadFromExcel();
		
		rfe.fileReader1("/Users/akmaslam/eclipse-workspace/Tutorials/src/fileReaderNWriter/data.xls",0);
	}
}
