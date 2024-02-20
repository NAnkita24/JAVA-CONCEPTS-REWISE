package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
public static void main(String[] args) throws IOException {
	File file=new File("ankita.txt");
	FileReader fr=new FileReader(file);
	for (int i = 0; i < file.length(); i++) {
	    System.out.print((char)fr.read());

	}
	
}
}
