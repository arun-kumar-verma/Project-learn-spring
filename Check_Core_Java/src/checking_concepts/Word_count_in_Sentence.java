package checking_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Word_count_in_Sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello my name is arun Hello my world";
		String[] arr=str1.split(" ");
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		List<String> lst=new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				int count=map.get(arr[i]);
				map.put(arr[i], count+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		for(String word: map.keySet()) {
			lst.add(word);
		}
		System.out.println(lst);
	}

}
