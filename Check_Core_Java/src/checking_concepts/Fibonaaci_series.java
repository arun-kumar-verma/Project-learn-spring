package checking_concepts;

import java.util.Scanner;

public class Fibonaaci_series {
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 2; i < 5; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}

	}
}
