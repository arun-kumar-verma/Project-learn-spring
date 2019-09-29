package checking_concepts;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Array_non_common_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,5,2,4,1,7,8};
		int[] b= {45,1,56,7,89};
		List<Integer> lst2=new ArrayList<Integer>();
		List<Integer> lst=new ArrayList<Integer>();
		for (int i = 0; i < b.length; i++) {
			lst.add(b[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if (!lst.contains(a[i])) {
				lst2.add(a[i]);
			}
		}
		System.out.println(lst2);
		lst2.sort(Comparator.reverseOrder());
		System.out.println(lst2);
	}

}
