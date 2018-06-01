package d0530;
import java.util.*;
public class tiketex {
	static Scanner scan=new Scanner(System.in);
	static adticket[] ad=new adticket[30];
	static wutiket[] wu=new wutiket[50];
	
	
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		int l=0;
		int user=0;
		System.out.println("mgv 영화관에 오신걸 환영합니다");
		boolean x=true;
		int n;
		while(x) {
			System.out.println("메뉴를 선택해 주십시오");
			System.out.println("-------------------------");
			System.out.println("1.사전예약|2.일반예몌|3.종료 ");
			System.out.println("-------------------------");
			System.out.print("선택>");
			n=scan.nextInt();
			if(n==1) {
				System.out.println("현제 사전 예약이 가능한 티켓의 정보입니다.");
				for(int i=0;i<ad.length;i++) {
					if(!(ad[i]==(null)))
						System.out.println("제목:"+ad[i].name+" 가격: "+ad[i].price+"원 개봉까지 남은일:"+ad[i].date+"  NO."+ad[i].num);
					else if(ad[i]==(null)){break;}
				}
				System.out.println("예약하실 영화 번호를 선택해주세요");
				System.out.print("선택>");
				n=scan.nextInt();
				System.out.println("영화"+ad[n].name+" 를 선택하셨습니다. ");
				ad[n].sale();
				System.out.println(user+"번 고객님 "+"영화 "+ad[n].name+" 금액"+ad[n].price+"결제가 완료되어 사전예약이  완료 되었습니다.");
			}
			else if(n==2) {
				System.out.println("현제 일반예매이 가능한 티켓의 정보입니다.");
				for(int i=0;i<wu.length;i++) {
					if(!wu[i].equals(null))
						System.out.println("제목:"+wu[i].name+" 가격: "+wu[i].price+"원 NO."+wu[i].num);
					else {break;}
				}
				System.out.println("예매하실 영화 번호를 선택해주세요");
				System.out.print("선택>");
				n=scan.nextInt();
				for(int i=0;i<wu.length;i++) {
					if(n==wu[i].num) {
					System.out.println("영화"+wu[i].name+" 를 선택하셨습니다. ");
					n=i;
					break;}
				}
				
				System.out.println("결제에 앞서 신용카드를 사용하시겠습니까?");
				System.out.print("선택>");
				wu[n].check=scan.nextInt();
				wu[n].sale();
				System.out.println(user+"번 고객님 "+"영화 "+ad[n].name+" 금액"+ad[n].price+"결제가 완료되어 예매가  완료 되었습니다.");
			}
			else if(n==3) {
				System.out.println("이용해 주셔서 감사합니다.즐거운 하루 되십시오");
				x=false;
				break;
			}
			else if(n==4) {
				
				boolean z=true;
				while(z) {
				System.out.println("관리자 메뉴입니다.");
				System.out.println("=================================================");
				System.out.println(" 1.사전예약티켓 입력 | 2.일반 티켓입력 | 3.가격변경 | 4.종료");
				System.out.println("=================================================");
				System.out.print(">선택");
				n=scan.nextInt();
				if(n==1)
				{System.out.println("사전예약 티켓 입력입니다");
				System.out.println("------------------------------------");
						ad[l]=new adticket(null,0,0,0);
						
						String na;
						int nu,p,d;
						System.out.println("영화 제목을 입력하세요");
						na=scan.next();
						nu=l;
						System.out.println("가격을 입력하세요");
						p=scan.nextInt();
						System.out.println("날짜을 입력하세요");
						d=scan.nextInt();
						if(30<d) {
							System.out.println("잘못된 값입니다 다시 입력하세요");
							d=scan.nextInt();
						}
						ad[l]=new adticket(na,nu,p,d);
						System.out.println("사전 예약 티켓이 생성되었습니다."+"제목"+ad[l].name+"가격"+ad[l].price+"날짜"+ad[l].date+"  No."+ad[l].num);
						l++;
						break;
					}
				
					
				else if(n==2) 
				{
					System.out.println("일반 티켓 입력입니다");
					System.out.println("------------------------------------");
					
					
							wu[l]=new wutiket(null,0,0,0);
							
							String na;
							int nu,p,ch=0;
							System.out.println("영화 제목을 입력하세요");
							na=scan.next();
							nu=l;
							System.out.println("가격을 입력하세요");
							p=scan.nextInt();
							wu[l]=new wutiket(na,nu,p,ch);
							System.out.println("사전 예약 티켓이 생성되었습니다."+"제목"+wu[l].name+"가격"+wu[l].price+"  No."+wu[l].num);
							l++;
							break;
						
					}
				
				else if(n==3) 
				{System.out.println("아직 지원 ㄴㄴ");}
				else if(n==4) 
				{z=false; }
				else 
				{System.out.println("잘못된 값입니다.");}
			}
			}
			else {
				System.out.println("잘못된 값입니다.");
			}
		}
	}
}
