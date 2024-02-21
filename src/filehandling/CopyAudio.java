package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyAudio {
public static void main(String[] args) throws IOException {
	File f =new File("sampleaudio.mp3");
	File f1 =new File("sampleaudio1.mp3");
	
	FileInputStream fi=new FileInputStream(f);
	FileOutputStream fo=new FileOutputStream(f1);
	
	for (int i = 0; i < f.length(); i++) {
//		System.out.print((char)fi.read());
		fo.write(fi.read());
	}
	fo.flush();
	System.out.println("done");
	
	
}
}
