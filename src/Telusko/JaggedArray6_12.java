package Telusko;

public class JaggedArray6_12 {
public static void main(String[] args) {
	
	int x[]= {1,2,3,4};
	int y[]= {5,6};
	int z[]= {7,8,9};
	
	int p[][]= {{1,2,4,4},{5,6},{7,8,9}};
	
	for (int i[] : p) {
		for (int j :i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
