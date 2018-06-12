package javapro;
import java.util.*;
public class lookupinfo {
	info in=new info();
	dotinfo dot=new dotinfo();
	
	
	public void searchinfo(){
		boolean z=true;
		Scanner scan=new Scanner(System.in);
		int p,snu,j = 0;
		
		String sna;
		in.backup();
		dot.dotinfom();
	while(z) {
		System.out.println("1.번호로 검색 2.한글로 검색 3.뒤로가기");
		System.out.print("선택>");
		p=scan.nextInt();
		if(p==1) {
			System.out.println("번호로 선택입니다.");
			System.out.print("선택>");
			snu=scan.nextInt();
			for(int i=0;i<in.fcl.length;i++) {
				if(in.fcl[i+1]==null) {
					break;}
			if(in.fcl[i].num==snu) {
				j=i;
				in.fcl[j].printdetail();
				break;
			}}
		
		
		}
		
		else if(p==2) {
			System.out.println("한글로 선택입니다.");
			System.out.print("선택>");
			sna=scan.next();
			for(int i=0;i<in.fcl.length;i++) {
				if(in.fcl[i+1]==null) {
					break;}
			if(in.fcl[i].fclname.equals(sna)) {
				j=i;
				in.fcl[j].printdetail();
				break;
			}}
		
		
		in.fcl[j].printdetail();}
		
		
		else if(p==3) {
			z=false;
		}
		else {System.out.println("잘못된 입력입니다.");}
		
	}}
	
	}

