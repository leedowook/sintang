package project01;
import java.util.*;
public class navi {//
	info in=new info();
	dotinfo dt=new dotinfo();
	int min,esum[]=new int[23];
	public void navigation() {
		
		
		
		Scanner scan=new Scanner(System.in);
		boolean choo=true,os=true;
		
		int fm=0,p,fsum = 0,nsum = 0;//1회용,각종 선택지,총거리,현제거리,임시거리,최소거리
		int n,z;//현제위치인 배열 이전위치 배열 끝 골목 배열인덱스,count=지나간거리수
		
		in.backup();
		dt.dotinfom();
		while(choo) {
		System.out.println("놀이기구 1: 번호로 검색 2: 한글로 검색 \n3: 의료기구,응급센터 번호확인 4: 종료");
		System.out.print("선택>");
		p=scan.nextInt();
		if(p==1) {
		int count=0;
		int search,start,end,ed = 0;
		System.out.println("목적지와 출발지를 입력해주세요");
		System.out.print("목적지>");
		search=scan.nextInt();
		end=search;
		System.out.print("출발지>");
		search=scan.nextInt();
		start=search;
		//시작지점
		//시작지점
		fm=closeint(start);
		
		ed=closeint(end);
		
		n=fm;//초기 시작지점인덱스
		z=fm;//초기 이전지점인덱스
		ArrayList<Integer> gr = new ArrayList<>();
		
		//****************1차 검증 완료*********************
		
		os=true;
		while(os){
			
			//각 거리 지나는 과정을 저장
			//1단계 각 출발지점에서 연결되있는 골목길의 목적지까지의 최소길이구하기
			int[] sa=dt.closedot(dt.dote[n].num1);//인접한 골목길의 인덱스를 담을 배열선언
			int[][] es=new int[dt.closedot(dt.dote[n].num1).length][2];//길이 비교를 위해 배열선언
			int mini=0;//최소거리의 인덱스를 대입
			
			for(int i=0;i<sa.length;i++) {
			es[i][0]=dt.gury(dt.dote[ed].x1,dt.dote[ed].y1,dt.dote[sa[i]].x1, dt.dote[sa[i]].y1);//목적지까지 길이를 하나하나 넣어줌 
			es[i][1]=sa[i];//각길이의 인덱스 를 넣어서 이전 인덱스빼고 비교 가능하도록 해줌
			}
			
			
			if(es[0][1]!=z) {
				min=es[0][0];
				mini=es[0][1];
				for(int i=1;i<es.length;i++) {
					if(es[i][1]!=z && es[i][0]<min) {//비교후 이전인덱스를 제외한 것만 인덱스를 mini에 가장 작은 거리를 min에 넣어줌
						min=es[i][0];
						mini=es[i][1];
					}
				}
			}
			else if(es[0][1]==z) {
				min=es[1][0];
				mini=es[1][1];
				for(int i=2;i<es.length;i++) {//[0][0]이 이전꺼일때라 [1][0]을 대입했으니 2부터 시작
					if(es[i][0]<min) {//비교후 인덱스를 mini에 가장 작은 거리를 min에 넣어줌
						min=es[i][0];
						mini=es[i][1];
					}
				}}
			
			gr.add(count,dt.dote[n].num1);
			count++;
			fsum+=min;
			if(mini==ed) {
				for(int i=0;i<in.fcl.length;i++) {//시작점 인덱스를 이제start에대입
				if(in.fcl[i].num==start) {
					start=i;
					break;}
				}
				System.out.println("출발지  "+in.fcl[start].fclname+"로부터");
				for(int i=0;i<in.fcl.length;i++) {//엔딩점 인덱스를 이제 end에대입
					if(in.fcl[i].num==end) {
						end=i;
						break;}
					}
				System.out.println("목적지 "+in.fcl[end].fclname);
				gr.add(count,dt.dote[ed].num1);
				System.out.println("해당 목적지까지 빠르게 가시려면");
				
				for(int g:gr) {
					System.out.print(g+"번 ");
				}
				System.out.println("길을 걸쳐서 가시면 되며 예상 도착시간은");
				System.out.println((int)(fsum/8)+"분입니다.");
				
				os=false;
				break;
			}
			else {
				
				z=n;
				n=mini;
				
				
			}
			//첫 인덱스가 이전인덱스일때를 대비
		}
		
			
				
			
			
			
		}
		
		
		else if(p==2) {//한글로 선택할경우
			int count=0;
			String search;
			int ed = 0;
			String end,start;
			int end1=0,start1 = 0;
			System.out.println("목적지와 출발지를 입력해주세요");
			System.out.print("목적지>");
			search=scan.next();
			end=search;
			System.out.print("출발지>");
			search=scan.next();
			start=search;
			//시작지점
			fm=closeString(start);
			
			ed=closeString(end);
			n=fm;//초기 시작지점인덱스
			z=fm;//초기 이전지점인덱스
			ArrayList<Integer> gr = new ArrayList<>();
			
			//****************1차 검증 완료*********************
			
			os=true;
			while(os){
				//각 거리 지나는 과정을 저장
				//1단계 각 출발지점에서 연결되있는 골목길의 목적지까지의 최소길이구하기
				int[] sa=dt.closedot(dt.dote[n].num1);//인접한 골목길의 인덱스를 담을 배열선언
				int[][] es=new int[dt.closedot(dt.dote[n].num1).length][2];//길이 비교를 위해 배열선언
				int mini=0;//최소거리의 인덱스를 대입
				
				for(int i=0;i<sa.length;i++) {
				es[i][0]=dt.gury(dt.dote[ed].x1,dt.dote[ed].y1,dt.dote[sa[i]].x1, dt.dote[sa[i]].y1);//목적지까지 길이를 하나하나 넣어줌 
				es[i][1]=sa[i];//각길이의 인덱스 를 넣어서 이전 인덱스빼고 비교 가능하도록 해줌
				}
				
				
				if(es[0][1]!=z) {
					min=es[0][0];
					mini=es[0][1];
					for(int i=1;i<es.length;i++) {
						if(es[i][1]!=z && es[i][0]<min) {//비교후 이전인덱스를 제외한 것만 인덱스를 mini에 가장 작은 거리를 min에 넣어줌
							min=es[i][0];
							mini=es[i][1];
						}
					}
				}
				else if(es[0][1]==z) {
					min=es[1][0];
					mini=es[1][1];
					for(int i=2;i<es.length;i++) {//[0][0]이 이전꺼일때라 [1][0]을 대입했으니 2부터 시작
						if(es[i][0]<min) {//비교후 인덱스를 mini에 가장 작은 거리를 min에 넣어줌
							min=es[i][0];
							mini=es[i][1];
						}
					}}
				
				gr.add(count,dt.dote[n].num1);
				count++;
				fsum+=min;
				if(mini==ed) {
					for(int i=0;i<in.fcl.length;i++) {//시작점 인덱스를 이제start에대입
					if(in.fcl[i].num==start1) {
						start1=i;
						break;}
					}
					System.out.println("출발지  "+in.fcl[start1].fclname+"로부터");
					for(int i=0;i<in.fcl.length;i++) {//엔딩점 인덱스를 이제 end에대입
						if(in.fcl[i].num==end1) {
							end1=i;
							break;}
						}
					System.out.println("목적지 "+in.fcl[end1].fclname);
					gr.add(count,dt.dote[ed].num1);
					System.out.println("해당 목적지까지 빠르게 가시려면");
					
					for(int g:gr) {
						System.out.print(g+"번 ");
					}
					System.out.println("길을 걸쳐서 가시면 되며 예상 도착시간은");
					System.out.println((int)(fsum/8)+"분입니다.");
					
					os=false;
					break;
				}
				else {
					
					z=n;
					n=mini;
					
					
				}
				//첫 인덱스가 이전인덱스일때를 대비
			}
		
		}
		else if(p==3) {
			
			int l;//내부선택지
			
			System.out.println("1번 미아센터 번호확인 2번 응급실 번호확인 뒤로가시려면 0번을");
			System.out.print("선택>");
			l=scan.nextInt();
			if(l==1) {
					for(int i=0;i<in.fcl.length;i++) {//끝점에 가장가까운 골목길 설정
						if(in.fcl[i+1]==null) {break;}
					else if(in.fcl[i].num>=35&&in.fcl[i].num<=37) {
							in.fcl[i].printdetail();} 
						
						}
						}
			if(l==2) {
				System.out.println("*표시는 실내 응급시설입니다. 찾기 힘드시다면 가까운 직원에게 문의하세요");
				for(int i=0;i<in.fcl.length;i++) {//끝점에 가장가까운 골목길 설정
					if(in.fcl[i+1]==null) {break;}
				else if(in.fcl[i].num>=38&&in.fcl[i].num<=51) {
						in.fcl[i].printdetail();} 
					
					}
					}
			
		}
		else if(p==4) {
			choo=false;
			break;
			
		}
		else {System.out.println("잘 못 입력하셨습니다. ");}
		}
	}
		
	public int closeint(int a) {//a에 넣고 가까운 골목길 받는 메소드
		int fm = 0,start,esum[]=new int[23],min;
		start=a;
		for(int i=0;i<in.fcl.length;i++) {//시작점에 가장가까운 골목길 설정
			if(in.fcl[i].num==start) {//시작지점과 같은 장소배열 찾기
				for(int j=0;j<dt.dote.length;j++) {//각 골목길과의 거리비교를 위해 배열에 우겨넣기
				esum[j]=(int)dt.gury(in.fcl[i].x, in.fcl[i].y, dt.dote[j].x1, dt.dote[j].y1);
				if(dt.dote[j+1]==null) {
					break;}}
				break;}}
				min=esum[0];
		for(int j=1;j<dt.dote.length;j++) {//최소거리 구하기
			if(dt.dote[j+1]==null) {
			break;}
			if(esum[j]<min) {
				min=esum[j];
				fm=j;//최소 거리인 골목길	출발지
				}}return fm;
		}
	
	
	public int closeString(String a) {//문자열을 받아 가까운 골목 검색
		int fm = 0,start1,esum[]=new int[23],min;
		String start;
		start=a;
		esum=this.esum;
		min=this.min;
		
	for(int i=0;i<in.fcl.length;i++)
	 {//시작점에 가장가까운 골목길 설정
		if(in.fcl[i].fclname.equals(start))
			start1=i;{//시작지점과 같은 장소배열 찾기
							for(int j=0;j<dt.dote.length;j++) {//각 골목길과의 거리비교를 위해 배열에 우겨넣기
								esum[j]=(int)dt.gury(in.fcl[i].x, in.fcl[i].y, dt.dote[j].x1, dt.dote[j].y1);
								if(dt.dote[j+1]==null) {
								break;}}
							break;
							}
				}
				min=esum[0];
				for(int j=1;j<dt.dote.length;j++) {//최소거리 구하기
					if(dt.dote[j+1]==null) {
				break;}
					if(esum[j]<min) {
						this.min=this.esum[j];
						fm=j;//최소 거리인 골목길	
					}}return fm;
	}
	
				
		
}
	
	
		
	

