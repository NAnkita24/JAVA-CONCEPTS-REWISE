package Telusko;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo12_3  {
public static void main(String[] args)throws Exception {
	Main m=new Main();
	m.i=4;
	
	FileOutputStream fos=new FileOutputStream("m.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(m);
	
	
	FileInputStream fis=new FileInputStream("m.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Main m1=(Main) ois.readObject();
	System.out.println("Value of object : "+m.i);
}
}

class Main implements Serializable{
	int i;
}
