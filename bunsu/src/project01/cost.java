package project01;

public abstract class cost {
	   String name;
	   int cost;
	   
	   public void reservation() {   //티켓 가격표를 출력하기위한 메소드
	      System.out.println(name + " : " + cost + "원");
	   }
	}