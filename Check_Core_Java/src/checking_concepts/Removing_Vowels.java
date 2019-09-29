package checking_concepts;

import java.awt.List;
import java.util.ArrayList;

public class Removing_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<String> lst=new ArrayList<String>();
		lst.add("A");
		lst.add("E");
		lst.add("I");
		lst.add("O");
		lst.add("U");
		
		String str="KUAIHFWWHOFESKL";
		String temp="";
		String[] a=str.split(""); 
		for (int i = 0; i < a.length; i++) {
			if(!lst.contains(a[i])) {
				temp=temp+a[i];
			}
		}
		
		System.out.println(temp);
		
		
	}

}
