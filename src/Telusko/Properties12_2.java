package Telusko;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Properties12_2 {
public static void main(String[] args) throws FileNotFoundException {
	Properties p=new Properties();
	OutputStream os=new FileOutputStream("abc.txt");
	
	p.setProperty("url", "localhost:3306/db");
	p.setProperty("uname", "Anki");
	p.setProperty("pass", "Anki@123");
}
}
