package project01;


public abstract class fclinfo{
	String fclname;//시설물 이름
	int x,y,num;//시설 번호 및 좌표
	boolean io;//시설 야외유무 
	
	
	public void printdetail() {
		System.out.println("번호: "+num);
		System.out.println("이름: "+fclname);
		System.out.println("위치: ("+x+","+y+")");
		if(io) {
		System.out.println("실내시설이거나 실내시설이 갖춰져있습니다.");}
		else{System.out.println("야외시설입니다.");}
		option();
		
	}
	
	public abstract void option();
	

}