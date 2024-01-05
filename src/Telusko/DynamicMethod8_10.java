package Telusko;

public class DynamicMethod8_10 {
public static void main(String[] args) {
	B obj1=new B();
	A obj2=new A();
	obj2.show();
	obj1.show();
}
}

class 	A{
	void show() {
		System.out.println("Hello");
	}
}

class 	B extends A{
	void show() {
		System.out.println("World");
	}
}


