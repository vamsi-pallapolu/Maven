package mavenexamplecom.sdet;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String inpUser, String inpPass) {
		ResourceBundle bundle=ResourceBundle.getBundle("config");
		String user=bundle.getString("username");
		String pass=bundle.getString("password");
		if(inpUser.equals(user) && inpPass.equals(pass))
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		
	}
}
