package checking_concepts;

public class Second_largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,1,79,34,22};
		int largest=arr[0];
		int seclargest=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>largest) {
				seclargest=largest;
				largest=arr[i];
			}else if(arr[i]>seclargest && arr[i]!=largest) {
				seclargest=arr[i];
			}
		}
		System.out.println(seclargest);
	}

}
