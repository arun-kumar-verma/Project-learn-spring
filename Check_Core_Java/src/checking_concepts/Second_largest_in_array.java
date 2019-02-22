package checking_concepts;

public class Second_largest_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,1,10};
		int sum=7;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		int first=0;
		int last=a.length-1;
		
		while(first<last) {
			if(a[first]+a[last]==sum) {
				System.out.println(a[first]+" "+a[last]);
				break;
			}
			if(a[first]+a[last]<sum) {
				first++;
			}
			else {
				last--;
			}
		}
		
	}

}
