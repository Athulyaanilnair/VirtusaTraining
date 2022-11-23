package ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class csvdata {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Fpath ="C:\\Users\\Athulya Anil\\Desktop";   
	    String line;
	    File file = new File(Fpath);

	    BufferedReader bufRdr;
	    bufRdr = new BufferedReader(new FileReader(file));

	    while((line = bufRdr.readLine()) != null){
	        System.out.println(line);       
	        String[] cell= line.split(",");
	            String FirstName=cell[0];
	            String MiddleName=cell[1];

	}

}
}