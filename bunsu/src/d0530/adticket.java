package d0530;

public class adticket extends ticket {
	
	int date;
	public adticket(String name,int num,int price,int date) {
		super(name,num,price);
		this.date=date;
		
	}
	@Override
	public void sale(){
		
		int price=this.price;
		
		System.out.println(price);
		if(10<this.date&&this.date<=30) {
			price*=(0.5);
		}
		else if(5<this.date) {
			price*=(0.8);
		}
		else if(0<this.date) {
			price*=(0.9);
		}
		else {System.out.println("전산오류");}
		System.out.println("원래 가격"+this.price+"원이 사전예약으로 인해 할인된 가격은 "+price+"원 입니다.");
		this.price=price;
	}
}
