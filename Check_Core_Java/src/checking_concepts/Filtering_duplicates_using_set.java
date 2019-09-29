package checking_concepts;

import java.util.HashSet;
import java.util.Set;

public class Filtering_duplicates_using_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,1,1,2,2,3,3,3,3,3,4,5,5,6,6,6,6};
		Set<Integer> set=new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		System.out.println(set);
	}

}
