package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderExample {
	public static void main(String[] args) throws IOException {
		File file=new File("ankita.txt");

		FileReader fr=new FileReader(file);
		BufferedReader bo=new BufferedReader(fr);
		
		for (int i = 0; i < file.length(); i++) {
			System.out.print( (char) fr.read());

		}
		
		System.out.println("\ncompleted");
	}
}
