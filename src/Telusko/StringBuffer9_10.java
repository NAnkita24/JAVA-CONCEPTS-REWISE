package Telusko;

public class StringBuffer9_10 {
public static void main(String[] args) {
	StringBuffer sbf=new StringBuffer("Ankita ");
	sbf.append("Jagtap");
	sbf.replace(0, 7, "Omkar ");
	sbf.delete(6, 9);
	System.out.println(sbf);
	
}
}
