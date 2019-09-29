package checking_concepts;

public class Reverse_string {
public static void main(String args[]) {
	String a="my name is arun";
	String rev="";
	for (int i = a.length()-1; i >=0; i--) {
		rev=rev+a.charAt(i);
	}
	System.out.println(rev);
}
	
}
