package project01.copy;

public class dotinfo{
	dot[] dote=new dot[50];
	public int gury(int a,int b,int a1, int b1) {//두점 사이의 거리
		return (int) (Math.sqrt(Math.pow(a-a1, 2)+Math.pow(b-b1, 2)));
		}
	public void dotinfom(){
		// 골목길
		
		
		
				dote[0]=new dot(1,15,85);
				dote[1]=new dot(2,30,90);
				dote[2]=new dot(3,50,90);
				dote[3]=new dot(4,70,95);
				dote[4]=new dot(5,90,100);
				dote[5]=new dot(6,15,71);
				dote[6]=new dot(7,33,80);
				dote[7]=new dot(8,50,82);
				dote[8]=new dot(9,59,78);
				dote[9]=new dot(10,75,80);
				dote[10]=new dot(11,95,85);
				dote[11]=new dot(12,13,40);
				dote[12]=new dot(13,29,40);
				dote[13]=new dot(14,29,41);
				dote[14]=new dot(15,59,65);
				dote[15]=new dot(16,100,63);
				dote[16]=new dot(17,12,10);
				dote[17]=new dot(18,34,20);
				dote[18]=new dot(19,45,35);
				dote[19]=new dot(20,65,40);
				dote[20]=new dot(21,80,40);
				dote[21]=new dot(22,30,40);
				dote[22]=new dot(23,45,15);
	}
	public  int[] closedot(int i){//각 골목당 인접 골목
		int[] clo = null;
		if(i==1) {
			clo=new
					int[2];
			clo[0]=5;
			clo[1]=1;
	
			
		}
		if(i==2) {
			clo=new int[3];
			clo[0]=0;
			clo[1]=2;
			clo[2]=6;
			
		}
		
		if(i==3) {
			clo=new int[3];
			clo[0]=1;
			clo[1]=7;
			clo[2]=3;
	
			
		}
		if(i==4) {
			clo=new int[3];
			clo[0]=2;
			clo[1]=4;
			clo[2]=9;
	
			
		}
		if(i==5) {
			clo=new int[2];
			clo[0]=3;
			clo[1]=10;
	
			
		}
		if(i==6) {
			clo=new int[3];
			clo[0]=0;
			clo[1]=13;
			clo[2]=11;
	
			
		}
		if(i==7) {
			clo=new int[3];
			clo[0]=1;
			clo[1]=13;
			clo[2]=7;
	
			
		}
		if(i==8) {
			clo=new int[3];
			clo[0]=2;
			clo[1]=6;
			clo[2]=8;
	
			
		}
		if(i==9) {
			clo=new int[3];
			clo[0]=7;
			clo[1]=14;
			clo[2]=9;
	
			
		}
		if(i==10) {
			clo=new int[4];
			clo[0]=3;
			clo[1]=20;
			clo[2]=8;
			clo[3]=10;
	
			
		}
		if(i==11) {
			clo=new int[3];
			clo[0]=4;
			clo[1]=15;
			clo[2]=9;
	
			
		}
		if(i==12) {
			clo=new int[3];
			clo[0]=5;
			clo[1]=12;
			clo[2]=16;
	
			
		}
		if(i==13) {
			clo=new int[4];
			clo[0]=13;
			clo[1]=11;
			clo[2]=17;
			clo[3]=18;
	
			
		}
		if(i==14) {
			clo=new int[4];
			clo[0]=5;
			clo[1]=6;
			clo[2]=12;
			clo[3]=14;
	
			
		}
		if(i==15) {
			clo=new int[3];
			clo[0]=8;
			clo[1]=13;
			clo[2]=19;
	
			
		}
		if(i==16) {
			clo=new int[1];
			clo[0]=15;
	
			
		}
		if(i==17) {
			clo=new int[2];
			clo[0]=11;
			clo[1]=17;
	
			
		}
		if(i==18) {
			clo=new int[3];
			clo[0]=21;
			clo[1]=16;
			clo[2]=22;
	
			
		}
		if(i==19) {
			clo=new int[3];
			clo[0]=21;
			clo[1]=16;
			clo[2]=22;
			
		}
		if(i==20) {
			clo=new int[3];
			clo[0]=18;
			clo[1]=14;
			clo[2]=20;
	
			
		}
		if(i==21) {
			clo=new int[2];
			
			clo[0]=19;
			clo[1]=22;
	
			
		}
		if(i==22) {
			clo=new int[4];
			clo[0]=13;
			clo[1]=11;
			clo[2]=17;
			clo[3]=18;
			
		}
		if(i==23) {
			clo=new int[3];
			clo[0]=17;
			clo[1]=18;
			clo[2]=20;
		}
		
		
		return clo;
		
	}

}