package checking_concepts;

public class Sorting_binary_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,0,0,1,1,1,0,1,1,0};
		int j=-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<1) {
				j++;
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
