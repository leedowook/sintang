package project01.copy;

public class info {
		
		 fclinfo[] fcl=new fclinfo[100] ;
		 fearfcl fear;
		 trillfcl trill;
		 kidfcl kid;
		 natfcl nat;
		 resfcl res;
		 eventfcl event;
		 waterfcl wat;
		 
	 nomalfcl nom;
		public void backup() {

			nom=new nomalfcl(0,"입구",45,15,true);
			fcl[0]=nom;
			//공포
			fear=new fearfcl(1,"정글의모르가나",6,85,true,4);
			fcl[1]=fear;
			fear=new fearfcl(2,"파란기둥",4,75,true,5);
			fcl[2]=fear;
			fear=new fearfcl(3,"키자루의유치원",5,70,true,2);
			fcl[3]=fear;
			//vr
			fear=new fearfcl(31,"VR유령의집",19,60,true,3);
			fcl[31]=fear;
			
			//스릴러
			trill=new trillfcl(4,"원심분리기",30,75,false,4);
			fcl[4]=trill;
			trill=new trillfcl(5,"번지점프",40,87,false,4);
			fcl[5]=trill;
			trill=new trillfcl(6,"롤러코스터",70,23,false,2);
			fcl[6]=trill;
			trill=new trillfcl(7,"성적표차트",50,79,false,5);
			fcl[7]=trill;
			trill=new trillfcl(8,"바이킹",90,60,false,3);
			fcl[8]=trill;
			//vr
			trill=new trillfcl(32,"VR티익스프레스",30,59,true,3);
			fcl[32]=trill;
			
			//애들
			kid=new kidfcl(9,"회전목마",69,40,false,80);
			fcl[9]=kid;
			kid=new kidfcl(10,"뽀로로열차",75,32,false,10);
			fcl[10]=kid;
			kid=new kidfcl(11,"매직렌드",90,45,true,15);
			fcl[11]=kid;
			kid=new kidfcl(12,"키즈빌리지",90,80,true,12);
			fcl[12]=kid;
			//vr
			kid=new kidfcl(33,"VR코코몽",55,45,true,80);
			fcl[33]=kid;
			
			//자연테마
			nat=new natfcl(13,"사파리",5,40,false,17);
			fcl[13]=nat;
			nat=new natfcl(14,"플라워랜드",30,40,false,17);
			fcl[14]=nat;
			nat=new natfcl(15,"이글루체험",20,45,true,20);
			fcl[15]=nat;
			nat=new natfcl(16,"판다월드",22,15,true,17);
			fcl[16]=nat;
			nat=new natfcl(17,"승마체험",34,55,false,15);
			fcl[17]=nat;
			//워터파크
			wat=new waterfcl(18,"아마존익스프레스",15,5,false,"중");
			fcl[18]=wat;
			wat=new waterfcl(19,"홉슬레이",85,100,false,"상");
			fcl[19]=wat;
			wat=new waterfcl(20,"워터슬라이드",90,95,false,"상");
			fcl[20]=wat;
			wat=new waterfcl(21,"물썰매",60,85,false,"하");
			fcl[21]=wat;
			//이벤트
			event=new eventfcl(22,"플레이배틀서바이벌",5,100,false,20);
			fcl[22]=event;
			event=new eventfcl(34,"VR영화관",55,55,true,10);
			fcl[34]=event;
			
			//식당
			res=new resfcl(23,"페밀리레스토랑",71,69,true,5);
			fcl[23]=res;
			res=new resfcl(24,"치킨치킨",30,80,true,4);
			fcl[24]=res;
			res=new resfcl(25,"아메리칸함벅",50,39,false,4);
			fcl[25]=res;
			res=new resfcl(26,"데리아",30,80,true,2);
			fcl[26]=res;
			res=new resfcl(27,"햄벅왕",90,49,true,3);
			fcl[27]=res;
			res=new resfcl(28,"와장창피자",21,85,true,5);
			fcl[28]=res;
			res=new resfcl(29,"헛피자",35,35,true,4);
			fcl[29]=res;
			res=new resfcl(30,"스텍끼",25,30,true,4);
			fcl[30]=res;
			
			//미아센터
			nom=new nomalfcl(35,"북미아센터",55,90,true);
			fcl[35]=nom;
			nom=new nomalfcl(36,"서미아센터",62,65,true);
			fcl[36]=nom;
			nom=new nomalfcl(37,"동미아센터",25,55,true);
			fcl[37]=nom;
			//응급
			nom=new nomalfcl(38,"응급1*",12,87,true);
			fcl[38]=nom;
			nom=new nomalfcl(39,"응급2",35,90,false);
			fcl[39]=nom;
			nom=new nomalfcl(40,"응급3",80,95,false);
			fcl[40]=nom;
			nom=new nomalfcl(41,"응급4*",100,89,true);
			fcl[41]=nom;
			nom=new nomalfcl(42,"응급5",85,71,false);
			fcl[42]=nom;
			nom=new nomalfcl(43,"응급6",15,70,false);
			fcl[43]=nom;
			nom=new nomalfcl(44,"응급7",15,30,false);
			fcl[44]=nom;
			nom=new nomalfcl(45,"응급8*",41,60,true);
			fcl[45]=nom;
			nom=new nomalfcl(46,"응급9",80,70,false);
			fcl[46]=nom;
			nom=new nomalfcl(47,"응급10",65,95,false);
			fcl[47]=nom;
			nom=new nomalfcl(48,"응급11*",80,30,true);
			fcl[48]=nom;
			nom=new nomalfcl(49,"응급12",60,42,false);
			fcl[49]=nom;
			nom=new nomalfcl(50,"응급13*",29,20,true);
			fcl[50]=nom;
			nom=new nomalfcl(51,"응급14",55,80,false);
			fcl[51]=nom;
			
			
			
			
			
		
		
}
			}
