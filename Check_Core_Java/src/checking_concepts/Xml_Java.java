package checking_concepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Xml_Java {

	public static void main(String[] args) throws IOException {
		String theString = "";
		File file = new File("C:\\Users\\Arun\\Desktop\\test.txt");
		Scanner scanner = new Scanner(file);
		theString = scanner.nextLine();
		while (scanner.hasNextLine()) {
		       theString = theString + "\n" + scanner.nextLine();
		}
	
		String html_body=theString.replaceAll("<.*>", " ");
		System.out.println(html_body);
		
		FileWriter writer = new FileWriter("C:\\Users\\Arun\\Desktop\\MyFile.html", true);
        writer.write("<html>");
        writer.write("<body>");   // write new line
        writer.write(html_body);
        writer.write("</body>");
        writer.write("</html>");
        writer.close();

		scanner.close();
	}
	
}
