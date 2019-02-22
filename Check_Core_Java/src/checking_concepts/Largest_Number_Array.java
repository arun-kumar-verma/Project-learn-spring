package checking_concepts;

public class Largest_Number_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {500,3000,10,67,400,34};
		int largest=A[0];
		for (int i = 1; i < A.length; i++) {
			if(largest<A[i]) {
				largest=A[i];
			}
		}
		System.out.println(largest);
	}

}
