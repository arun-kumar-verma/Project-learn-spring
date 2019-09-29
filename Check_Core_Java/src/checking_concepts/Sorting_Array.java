package checking_concepts;

public class Sorting_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {2,4,1,10,8,6};		//Ascending order
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length-i-1; j++) {
				if(A[j+1]<A[j]) {
					int temp=A[j+1];
					A[j+1]=A[j];
					A[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
	}

}
