package d0531;

public class bird extends countable{
	
	bird(String name,int num){super(name,num);}
	
	@Override 
	public void count() {
		
		System.out.println(name+"새가 "+num+"마리");
	}
	public void fly() {
		System.out.println(name+"새 "+num+"마리가 날아든다");
		
	}
	
	
}
