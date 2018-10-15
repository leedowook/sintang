package com.choju.fpro.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;
	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("ksq9511","fjnanmarnafjotby");
	}
	public PasswordAuthentication getPasswordAuthentication() {
		return passAuth;
	}

}
