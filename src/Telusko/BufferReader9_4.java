package Telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader9_4 {
public static void main(String[] args) throws NumberFormatException, IOException {
	InputStreamReader is=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
	System.out.println("Enter a number: ");
	int i=Integer.parseInt(br.readLine());
	System.out.println(i);
			
}
}
