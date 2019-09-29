package checking_concepts;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		while (a>0) {
			int rem=a%10;
			System.out.print(rem);
			a=a/10;
		}
	}
}
