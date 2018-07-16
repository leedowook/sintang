package education;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class googleserver extends Authenticator {
		PasswordAuthentication passAuth;
		
		public googleserver() {
			passAuth=new PasswordAuthentication(
					"dlscjsdodnr@gmail.com","vaixzklffwwfdzgz");
			
		}
		public PasswordAuthentication getPasswordAuthentication() {
			return passAuth;
			
		}

}
