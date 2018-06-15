package d0604;

public class smarttv extends product{
	String cr;
	
	public smarttv(String pname,int price,String cr ) {
		this.pname=pname;
		this.price=price;
		this.cr=cr;
	}
	@Override
	public void printExtra() {System.out.println("통신사: "+cr);}

}
