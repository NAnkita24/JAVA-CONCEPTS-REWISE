package Telusko;

public class Clone11_3
{
	public static void main(String[] args) throws CloneNotSupportedException {
		Abc a=new Abc();
		a.i=5;
		a.j=6;

		Abc b=(Abc)a.clone();

		System.out.println(a);
		System.out.println(b);

	}
}

class Abc implements Cloneable{
	int i,j;

	public String toString(){
		return "Abc{"+"i="+i+","+"j="+j+"}";

	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}
