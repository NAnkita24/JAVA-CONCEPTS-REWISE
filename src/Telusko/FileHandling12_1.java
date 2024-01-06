package Telusko;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling12_1 {
public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("demo.txt");
	DataOutputStream dos=new DataOutputStream(fos);
	dos.writeUTF("Demo");
	
	FileInputStream fis=new FileInputStream("demo.txt");
	DataInputStream dis=new DataInputStream(fis);
	 String str=dis.readUTF();
	 System.out.println(str);
	
	

}
}
