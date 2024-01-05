package Telusko;

import java.util.ArrayList;

public class Wrapper9_7 {
public static void main(String[] args)throws Exception {
	int i=6;
	Integer i1=new Integer(i);
	System.out.println(i1);
	Integer jj=i1;
	
	int j=jj.intValue();
	int k=j;
	
	ArrayList<Integer>a1=new ArrayList<Integer>();
	a1.add(4);
	a1.add(8);
	a1.add(5);
	
	System.out.println(a1);
}
}
