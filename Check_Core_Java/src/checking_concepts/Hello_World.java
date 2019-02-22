package checking_concepts;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Hello_World {

	public static void main(String[] args) {
		final String username = "arun.vrm.121@gmail.com";
		final String password = "Topper1993#";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("arun.vrm.121@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse("roger86123@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler,"
				+ "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");
		//	System.out.println("checking test");
			System.out.println("checkin test 2");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
		
	}

}
