package d0530;
import java.util.*;
public class ticket {
	String name;
	final int num;
	int price;
	Scanner scan=new Scanner(System.in);
	public ticket(String name,int num,int price) {
		this.name=name;
		this.num=num;
		this.price=price;
	}
	public void sale(){
		int ch;
		int price=this.price;
		System.out.println("가격을 변경하시겠습니까? 변경하시려면 1번 전으로 돌아가시려면 0번을 눌러주세요");
		System.out.print(">선택");
		ch=scan.nextInt();
		if(ch==1) {
			System.out.println("기존 가격에서 얼마나 변경하시겠습니까? 빼시려면 -붙여서 사용해주십시요");
			ch=scan.nextInt();
			price+=ch;
			System.out.println("기존 가격"+this.price+"원에서 변경된 가격은 "+price+"원입니다.");
			this.price=price;
		}
		else if(ch==0){
			System.out.println("기존 매뉴로 돌아갑니다 ");
		}
		else {
			System.out.println("잘못 입력하셨습니다. 변경하시려면 1번 전으로 돌아가시려면 0번을 눌러주세요");
		}
	}
}
