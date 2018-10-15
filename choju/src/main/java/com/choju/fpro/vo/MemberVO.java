package com.choju.fpro.vo;

public class MemberVO {
	   private String email;
	   private String nickname;
	   private String password;
	   private String name;
	   private String gender;
	   private String age;
	   private String sha256;
	   private int cheked;
	   
	   @Override
	   public String toString() {
	      return "MemberVO [email=" + email + ", Nicname=" + nickname + ", password=" + password + ", name=" + name
	            + ", gender=" + gender + ", age=" + age +",sha256"+sha256+"]";
	   }

	   public MemberVO() {
	      //이게 생성자
	   }
	   
	   public MemberVO(String email,String nickname,String password,String name,String gender,String age,String sha256,int cheked) {
	      
	      this.email = email;
	      this.password = password;
	      this.nickname = nickname;
	      this.name=name;
	      this.age = age;
	      this.gender = gender;
	      this.sha256 = sha256;
	      this.cheked= cheked;
	   }
	   

	   public int getCheked() {
	      return cheked;
	   }

	   public void setCheked(int cheked) {
	      this.cheked = cheked;
	   }

	   public String getSha256() {
	      return sha256;
	   }

	   public void setSha256(String sha256) {
	      this.sha256 = sha256;
	   }

	   public String getNickname() {
	      return nickname;
	   }

	   public void setNickname(String nickname) {
	      this.nickname = nickname;
	   }

	   public String getPassword() {
	      return password;
	   }
	   public void setPassword(String password) {
	      this.password = password;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getAge() {
	      return age;
	   }
	   public void setAge(String age) {
	      this.age = age;
	   }
	   public String getGender() {
	      return gender;
	   }
	   public void setGender(String gender) {
	      this.gender = gender;
	   }
	   public String getEmail() {
	      return email;
	   }
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   
	}
