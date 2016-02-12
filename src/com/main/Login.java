package com.main;

public class Login {
	public boolean authorise(String usernameText, String passwordText){
		if(usernameText.equals("test") && passwordText.equals("test"))
			return true;
		else
			return false;
	}
	
}
