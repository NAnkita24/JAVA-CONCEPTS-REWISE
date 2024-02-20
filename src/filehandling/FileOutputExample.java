package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample {
	public static void main(String[] args) throws IOException {
		File file=new File("ankita.txt");

		FileOutputStream fo=new FileOutputStream(file);
		
		String s="Omkar Sanjay Jagtap";
		char ch[]=s.toCharArray();
		
		for (int i = 0; i <s.length(); i++) {
			fo.write(ch[i]);
		}
		
		System.out.println("\ncompleted");
	}
}
