package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterExample {
	public static void main(String[] args) throws IOException {
		File file=new File("ankita.txt");

		FileWriter fw=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(fw);
		String s="Adiraj";
		bw.write(s);
		bw.flush();
		System.out.println("\ncompleted");
	}
}
