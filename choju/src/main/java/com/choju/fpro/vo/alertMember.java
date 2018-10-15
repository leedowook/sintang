package com.choju.fpro.vo;

public class alertMember {
	String email;
	String password;
	String age;
	int cheked;
	
	@Override
	public String toString() {
		return "alertMember [email=" + email + ", password=" + password + ", age=" + age + ", cheked=" + cheked + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getCheked() {
		return cheked;
	}
	public void setCheked(int cheked) {
		this.cheked = cheked;
	}
	
}
