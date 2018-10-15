package com.choju.fpro.vo;

public class emailVO {
private String email;
private String sha256;


@Override
public String toString() {
	return "emailVO [email=" + email + ", code=" + sha256 + "]";
}

public emailVO() {
	//이게 생성자
}


public emailVO(String email,String sha256) {
	
	this.email = email;
	this.sha256=sha256;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSha256() {
	return sha256;
}
public void setSha256(String sha256) {
	this.sha256 = sha256;
}

}
