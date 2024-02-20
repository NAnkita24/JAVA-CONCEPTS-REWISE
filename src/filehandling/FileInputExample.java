package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputExample {
	public static void main(String[] args) throws IOException {
		File file=new File("ankita.txt");

		FileInputStream fi=new FileInputStream(file);
		for (int i = 0; i < file.length(); i++) {
			System.out.print( (char) fi.read());

		}
		
		System.out.println("\ncompleted");
	}
}
