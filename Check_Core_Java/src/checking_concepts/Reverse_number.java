package checking_concepts;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1990;
		int rev=0;
			while (num>0) {
			int rem=num%10;
			System.out.print(rem);
			num/=10;
		}
		
	//	System.out.println(rev);
	}

}
