package checking_concepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class XmlToHtml {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String theString = "";
		char[] a;
		char[] b= {};
		File file = new File("C:\\Users\\Arun\\Desktop\\test.txt");
		Scanner scanner = new Scanner(file);
		theString = scanner.nextLine();
		while (scanner.hasNextLine()) {
		       theString = theString + "\n" + scanner.nextLine();
		}
		a=theString.toCharArray();
		System.out.println(a.length);
		for(int i=0,j=0;i<a.length;i++,j++) {
			System.out.println(a[i]);
			if(a[i]=='<') {
				do {
					i++;
				}while(a[i]=='>');
				
			}
				System.out.println("1");
				b[j]=a[i];
			
		}
		
		String html_body=new String(b);
		System.out.println(html_body);
		scanner.close();
	}

}
