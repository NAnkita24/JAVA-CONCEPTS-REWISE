package Telusko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling10_6 {
public static void main(String[] args) throws Exception{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	String s1="";
	try {
		s1=bf.readLine();
		System.out.println(s1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
