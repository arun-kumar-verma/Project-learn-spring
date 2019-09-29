package checking_concepts;

public class Reversing_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="hello in the world of java";
		String[] strarray=str1.split(" ");
		String rev_string="";
		for (int i = strarray.length-1; i >=0 ; i--) {
			rev_string=rev_string+strarray[i]+ " ";
		}
		System.out.println(rev_string);
	}

}
