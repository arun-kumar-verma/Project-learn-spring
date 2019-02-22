package checking_concepts;

import java.util.Scanner;

public class Fibonaaci_series {
	public static void main(String[] args) {
		int a=0,b=0,c=1;
		
//		System.out.println(a);
//		System.out.println(b);
		
		Scanner n=new Scanner(System.in);
		int input=n.nextInt();
		for (int i = 0; i < input; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a);
		}
		n.close();
	}
}
