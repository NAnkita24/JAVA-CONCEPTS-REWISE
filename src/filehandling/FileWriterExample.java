package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
public static void main(String[] args) throws IOException {
	File file=new File("ankita.txt");
	FileWriter fw=new FileWriter(file);
	
	String s="Ankita jagtap";
	char ch[]=s.toCharArray();
	
	for (int i = 0; i < s.length(); i++) {
	    fw.write(ch[i]);
	    

	}
	fw.flush();
	System.out.println("done");
}
}
