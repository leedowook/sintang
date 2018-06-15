package d0604;
import java.util.*;
//ishop 인터페이스의 구현 클래스
public class Myshop implements ishop{
	//회원 정보 등로글 위한 배열 선언
	user[] us=new user[2];
	product[] pr=new product[4];
	//상품 추가를 위한 장바구니
	ArrayList<product> cart=new ArrayList<product>();
	Scanner scan=new Scanner(System.in);
	int selUser;
	String title;
	
	@Override
	public void settitle(String title) {
		this.title=title;
		
	}
	@Override
	public void genuser() {
		user user=new user("이름",paytype.cash);//위에 선언한 배열에 넣기
		us[0] =user;
		user=new user("이름",paytype.cash);//위에 선언한 배열에 넣기
		us[1] =user;
	}	
		
	@Override
	public void genproduct() {
		cellphone cp=new cellphone("갤럭시 s9",1000000,"skt");
		pr[0]=cp;
		cp=new cellphone("아이폰x",78080,"kt");
		pr[1]=cp;
		smarttv st=new smarttv("삼성 3d smart tv",5000000,"4k");
		pr[2]=st;
		st=new smarttv("lg 3d smart tv",4230000,"2k");
		pr[3]=st;
	}
	@Override
	public void start() {System.out.println(title+":메인화면 -계정 선택");
	System.out.println("========================");
	
	int i=0;
	for(user u:us) {
		
		System.out.println("["+i+"]"+u.getName()+u.getPayt());
	i++;
	}
	
	/*for(int i=0;i<us.length;i++) {
		System.out.println("["+i+"]"+us[i].getName()+us[i].getPayt());}*/
	System.out.println("[x]종료");
	System.out.print("선택: ");
	String sel=scan.next();
	switch(sel) {
	case "x": System.exit(0);
	break;
	default:
		selUser=Integer.parseInt(sel);
		productlist();//상품을 보여줄 리스트
	}
	}
	public void productlist() {
		
		
		System.out.println(title+": 상품 목록-상품선택");
		System.out.println("=======================");
		
		for(product p: pr) {
			p.printdetail();
			}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.print("선택:");
		String sel=scan.next();
		switch(sel) {
		case "h":start();
			break;
		
		case "c":checkout();
			break;
		default:
			int z=Integer.parseInt(sel);
			cart.add(pr[z]);//위 카트리스트에 계속 추가됨
			productlist();//재귀적호출 자기자신을 호출해줌
		}
	}
		
	public void checkout() {
		System.out.println(title+": 체크아웃");
		System.out.println("=============================");
		int i=0;
		int sum=0;
		for(product a:cart) {a.printdetail();
		sum+=a.price;
		i++;}
		System.out.println("총결제하실 금액은"+sum);
		System.out.println("결제방법:"+us[selUser].getPayt());
		System.out.println("합계:"+sum+"원");
		System.out.println("[p]이전,[q]결제완료");
		System.out.print("선택:");
		String sel =scan.next();
		
		switch(sel){
		case "p":
			productlist();
			break;
		case "q":
				System.out.println("결제가 완료되었스비다. 종료하빈다.");
				System.exit(0);
				break;
		default:
			checkout();
			
		}
	}
}
