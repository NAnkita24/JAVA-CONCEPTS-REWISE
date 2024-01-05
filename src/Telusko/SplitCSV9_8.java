package Telusko;

public class SplitCSV9_8 {
public static void main(String[] args) {
	
	String s1= "Ankita,Nikita,Akshay,Shubhangi";
	String values[]=s1.split(",");
	System.out.println(values[2]);
	
	for(String s2:values) {
		System.out.print(s2+" ");
	}
}
}
