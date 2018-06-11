package project01;
import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class allmain {
	public static void main(String []args) {
		ticket tick=new ticket();
		navi ne=new navi();
		info in=new info();
		parade par=new parade();
		lookupinfo look=new lookupinfo();
		boolean main=true;
		
		int mcho,p = 0;
		String sna2,sna1 = null,temp;
		Scanner scan=new Scanner(System.in);
		while(main) {
		System.out.println("===================================================");
		System.out.println("메뉴를 고르시오");
		System.out.println("1.예매 및 주차현황2.놀이기구 정보조회 3.길찾기/미아센터&응급실조회");
		System.out.println("4.원하는 놀이기구조회 5.퍼레이드 조회 6.오늘의 인구현황확인 7.종료 ");
		System.out.println("===================================================");
		System.out.print("선택>"); mcho=scan.nextInt();
		if(mcho==1) {
			System.out.println("**************************");
			tick.reservation1();
			tick.start();
		}
		else if(mcho==2) {
			System.out.println("**************************");
			System.out.println("놀이기구 정보 조회입니다.");
			in.lookup();}
		else if(mcho==3) {
			System.out.println("**************************");
			System.out.println("길찾기/미아센터&응급실조회입니다.");
			ne.navigation();}
		else if(mcho==4) {
			System.out.println("**************************");
			System.out.println("원하는 놀이기구 조회입니다.");
			look.searchinfo();}
		else if(mcho==5) {
			boolean k=true;
			while(k) {
				System.out.println("**************************");	
			System.out.println("조회하실 퍼레이드를 선택하세요");
			System.out.println("1."+par.perfom1 +"2."+par.perfom2+"3.뒤로가기");
			p=scan.nextInt();
			if(p==0) {
				System.out.println("-----------------");
				System.out.println("퍼레이드 관리자메뉴");
				System.out.println("변경하실 퍼레이드 선택 1,2");
				p=scan.nextInt();
				
				if(p==1) {
					System.out.println("현재 "+par.perfom1+"을 변경할 이름 입력하시오");
					temp=par.perfom1;
					par.perfom1=scan.next();
					System.out.println(temp+"를 "+par.perfom1+"으로 변경완료");
				}
				if(p==2) {
					System.out.println("현재 "+par.perfom2+"을 변경할 이름 입력하시오");
					temp=par.perfom2;
					par.perfom2=scan.next();
					System.out.println(temp+"를 "+par.perfom2+"으로 변경완료");
				}
			}
			else if(p==1) {;
				par.show1();}
			else if(p==2) {;
			par.show2();}
			else if(p==3) {
				k=false;
				break;
			}
			}
		}
		else if(mcho==6) {
			System.out.println("**************************");
			tick.popinfo();
		}
		else if(mcho==7) {
			main=false;
			System.out.println("이용해주셔서 감사합니다.");
			break;
		}
		
		
			}}
}
